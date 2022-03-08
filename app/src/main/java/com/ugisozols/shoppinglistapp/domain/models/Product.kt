package com.ugisozols.shoppinglistapp.domain.models


/**
 * [Product] class specifies attributes for each Product
 */
data class Product(
    val name : String,
    val amount : String,
    val category : Category,
    var checked : Boolean = false,
    val date : Long = System.currentTimeMillis(),
    val id : String? = null
)