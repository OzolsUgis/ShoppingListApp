package com.ugisozols.shoppinglistapp.data.mapper

import com.ugisozols.shoppinglistapp.data.collection.ProductCollection
import com.ugisozols.shoppinglistapp.domain.models.Product

/**
 * extension function of [Product] class
 *
 * Used to map given data to [ProductCollection] object
 */
fun Product.toProductCollection() : ProductCollection {
    return ProductCollection(
        name = name,
        amount = amount,
        category = category.name,
        id = id,
        checked = checked,
        date = date
    )
}
