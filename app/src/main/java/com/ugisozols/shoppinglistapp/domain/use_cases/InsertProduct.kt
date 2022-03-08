package com.ugisozols.shoppinglistapp.domain.use_cases

import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.utils.UiEvent
import com.ugisozols.shoppinglistapp.utils.UiText

/**
 * [InsertProduct] use case runs function that validates
 * data & checks if inputs are not null If Input field
 * is empty then function returns ShowSnackbar event with error message
 * if data passes validation it gets sent to repository to add [Product] object
 * to cloud
 */
class InsertProduct(
    private val repository: ShoppingListRepository
) {
    suspend operator fun invoke(
        name : String,
        amount : String,
        category : String?
    ) : UiEvent {
        if(name.trim().isEmpty() || amount.trim().isEmpty()){
            return UiEvent.ShowSnackbar(UiText.StringResource(R.string.inputEmpty))
        }
        val product = Product(
            name = name,
            amount = amount,
            category = Category.fromString(category?: "general")
        )
        repository.insertProduct(product)
        return UiEvent.ShowSnackbar(UiText.StringResource(R.string.successfully_added_product))
    }
}