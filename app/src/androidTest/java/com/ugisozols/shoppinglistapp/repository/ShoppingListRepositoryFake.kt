package com.ugisozols.shoppinglistapp.repository

import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.filter
import kotlin.random.Random

class ShoppingListRepositoryFake : ShoppingListRepository {



    private val shoppingList = mutableListOf<Product>()

    private val getProductsFlow = MutableSharedFlow<Resource<List<Product>>>(replay = 1)


    override fun getShoppingList(category: String): Flow<Resource<List<Product>>> {
        return getProductsFlow
    }

    override suspend fun insertProduct(product: Product) {
        shoppingList.add(product.copy(id = Random.nextInt().toString()))
        getProductsFlow.emit(Resource.Success(shoppingList))
    }

    override suspend fun deleteProducts(products: List<Product>) {
        products.forEach {
            shoppingList.remove(it)
        }
        getProductsFlow.emit(Resource.Success(shoppingList))
    }

    override suspend fun updateProduct(product: Product, value: Boolean) {
        shoppingList.forEach {
            if (it.id == product.id) {
                shoppingList.remove(it)
                shoppingList.add(
                    product.copy(
                        checked = value
                    )
                )
            } else {
                shoppingList.add(product.copy(checked = value))
            }
        }
        getProductsFlow.emit(Resource.Success(shoppingList))
    }
}