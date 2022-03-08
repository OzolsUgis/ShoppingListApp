package com.ugisozols.shoppinglistapp.domain.use_cases

import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository


/**
 * [DeleteProducts] use case runs function that
 * takes list as a parameter, checks if list in not empty
 * and sends that list further to [ShoppingListRepository.deleteProducts] funtion
 */
class DeleteProducts(
    private val repository: ShoppingListRepository
) {
    suspend operator fun invoke(list : List<Product>){
        if (list.isNotEmpty()){
            repository.deleteProducts(list )
        }
    }
}