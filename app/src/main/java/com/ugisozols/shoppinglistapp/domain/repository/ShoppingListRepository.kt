package com.ugisozols.shoppinglistapp.domain.repository

import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.utils.Resource
import kotlinx.coroutines.flow.Flow

/**
 * [ShoppingListRepository] is interface for functions that manipulates
 * with firebase cloud server. Repository is made as interface
 * for improved testing purposes
 *
 * Repository contains :
 *
 *  - [getShoppingList]
 *  - [insertProduct]
 *  - [deleteProducts]
 *  - [updateProduct]
 *
 *  Repository is implemented in data package
 */

interface ShoppingListRepository {

    /**
     * [getShoppingList] function is member of [ShoppingListRepository]
     * used to get live data from cloud server
     *
     * @param category of type [String] takes category name as a parameter to
     * return specific list of specific category
     *
     * @return [Flow] of Type [Resource] of Type [List] of [Product]
     *
     */
    fun getShoppingList(category : String) : Flow<Resource<List<Product>>>


    /**
     * [insertProduct] function is member of [ShoppingListRepository]
     * used to insert data in cloud server
     *
     * @param product takes [Product] object to add in cloud
     */
    suspend fun insertProduct(product: Product)

    /**
     *[deleteProducts] function is member of [ShoppingListRepository]
     * used to delete products from cloud server
     *
     * @param products is [List] of [Product] function deletes every member in this list
     */
    suspend fun deleteProducts(products : List<Product>)

    /**
     * [updateProduct] function is member of [ShoppingListRepository]
     * used to update specific product
     *
     * @param product is [Product] object what needs to be updated in cloud
     * @param value is [Boolean] value that contains updated value
     */
    suspend fun updateProduct(product : Product, value : Boolean)

}