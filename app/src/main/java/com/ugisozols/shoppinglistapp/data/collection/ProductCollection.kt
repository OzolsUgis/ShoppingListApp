package com.ugisozols.shoppinglistapp.data.collection

/**
 * [ProductCollection] specifies attributes for Product collection
 * in each object in cloud all of the attributes ar Nullable and set with
 * default values to avoid any serialization errors
 */
data class ProductCollection(
    val name : String? = "",
    val amount : String? = "",
    val category : String? = "",
    val date : Long? = null,
    val checked : Boolean? = null,
    val id : String? = ""
)
