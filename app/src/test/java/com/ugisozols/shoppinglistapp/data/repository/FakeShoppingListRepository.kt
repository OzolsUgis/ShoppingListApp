package com.ugisozols.shoppinglistapp.data.repository

import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeShoppingListRepository() : ShoppingListRepository {

    private val shoppingItems = mutableListOf<Product>()

    private val flowShoppingItemsList: Flow<Resource<List<Product>>> = flow {
        emit(Resource.Success(shoppingItems as List<Product>))
    }


    override fun getShoppingList(category: String): Flow<Resource<List<Product>>> {
        return flowShoppingItemsList
    }

    override suspend fun insertProduct(product: Product) {
        shoppingItems.add(product)

    }

    override suspend fun deleteProducts(products: List<Product>) {
        products.forEach {
            shoppingItems.remove(it)
        }
    }

    override suspend fun updateProduct(product: Product, value: Boolean) {
        shoppingItems.forEach {
            if (it.id == product.id) {
                shoppingItems.remove(it)
                shoppingItems.add(
                    product.copy(
                        checked = value
                    )
                )
            } else {
                shoppingItems.add(product.copy(checked = value))
            }
        }
    }
}