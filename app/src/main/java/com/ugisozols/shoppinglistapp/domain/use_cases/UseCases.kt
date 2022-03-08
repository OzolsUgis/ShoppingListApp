package com.ugisozols.shoppinglistapp.domain.use_cases


/**
 * [UseCases] class combines all use cases for this application
 */
data class UseCases(
    val insertProduct : InsertProduct,
    val getProducts: GetProducts,
    val deleteProducts: DeleteProducts,
    val updateProduct: UpdateProduct
)
