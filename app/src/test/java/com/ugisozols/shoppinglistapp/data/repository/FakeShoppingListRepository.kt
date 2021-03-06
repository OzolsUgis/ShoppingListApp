package com.ugisozols.shoppinglistapp.data.repository

import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.utils.Resource
import kotlinx.coroutines.flow.Flow

class FakeShoppingListRepository() : ShoppingListRepository {

    private val shoppingItems = mutableListOf<Product>()




    override fun getShoppingList(category: String): Flow<Resource<List<Product>>> {
        TODO()
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
        TODO()
    }
}