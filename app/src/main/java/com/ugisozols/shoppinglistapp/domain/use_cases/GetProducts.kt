package com.ugisozols.shoppinglistapp.domain.use_cases

import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository

/**
 * [GetProducts] use case runs function that
 * takes [Category] name attribute and passes on as a string to
 * [ShoppingListRepository.getShoppingList] function
 */
class GetProducts(
    private val repository: ShoppingListRepository
) {
    operator fun invoke(category: Category?) =
        repository.getShoppingList(category?.name ?: "general")
}