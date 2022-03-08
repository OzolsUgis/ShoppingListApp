package com.ugisozols.shoppinglistapp.domain.use_cases

import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository

/**
 *[UpdateProduct] use case runs function that takes [Product] object and [Boolean]
 * object as a parameter to send further to [ShoppingListRepository.updateProduct] function
 *
 */
class UpdateProduct(
    private val repository: ShoppingListRepository
) {
    suspend operator fun invoke(product : Product, value : Boolean){
        repository.updateProduct(product, value)
    }
}