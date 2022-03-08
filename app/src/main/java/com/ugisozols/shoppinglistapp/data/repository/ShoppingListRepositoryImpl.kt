package com.ugisozols.shoppinglistapp.data.repository

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.Query
import com.ugisozols.shoppinglistapp.data.mapper.toProductCollection
import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


/**
 * Implementation of [ShoppingListRepository]
 *
 * @param productRef is injected parameter that allows to get [CollectionReference]
 * @param productQuery is injected parameter that allows to get [Query]
 *
 * @return [ShoppingListRepository] implementation
 */
class ShoppingListRepositoryImpl @Inject constructor(
    private val productRef : CollectionReference,
    private val productQuery : Query
) : ShoppingListRepository {
    override fun getShoppingList(category: String): Flow<Resource<List<Product>>> {
        TODO("Not yet implemented")
    }

    override suspend fun insertProduct(product: Product) {
        val productId = productRef.document().id
        val newProduct = product.copy(
            id = productId
        )
        productRef.document(productId).set(
            newProduct.toProductCollection()
        )
    }

    override suspend fun deleteProducts(products: List<Product>) {
        TODO("Not yet implemented")
    }

    override suspend fun updateProduct(product: Product, value: Boolean) {
        TODO("Not yet implemented")
    }
}