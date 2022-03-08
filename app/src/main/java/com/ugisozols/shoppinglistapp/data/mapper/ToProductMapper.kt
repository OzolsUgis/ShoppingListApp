package com.ugisozols.shoppinglistapp.data.mapper

import com.ugisozols.shoppinglistapp.data.collection.ProductCollection
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.domain.models.Product

/**
 * Extension function of [ProductCollection]
 *
 * Used to map given object to [Product]
 * Returns object of [Product] with data provided in [ProductCollection]
 */
fun ProductCollection.toProducts() : Product {
    return Product(
        name = name.orEmpty(),
        amount = amount.orEmpty(),
        category = Category.fromString(category.orEmpty()),
        date = date ?: 0,
        checked = checked ?: false,
        id = id.orEmpty()
    )
}
