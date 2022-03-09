package com.ugisozols.shoppinglistapp.domain.use_cases

import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.utils.Resource
import com.ugisozols.shoppinglistapp.utils.UiEvent
import com.ugisozols.shoppinglistapp.utils.UiText


/**
 * [DeleteProducts] use case runs function that
 * takes list as a parameter, checks if list in not empty
 * and sends that list further to [ShoppingListRepository.deleteProducts] funtion
 */
class DeleteProducts(
    private val repository: ShoppingListRepository
) {
    suspend operator fun invoke(list : List<Product>): Resource<Any>{
        return if (list.isEmpty()){
            Resource.Error(UiText.StringResource(R.string.delete_list_empty))
        }else{
            repository.deleteProducts(list)
            Resource.Success(null)
        }
    }
}