package com.ugisozols.shoppinglistapp.domain.use_cases

import com.ugisozols.shoppinglistapp.data.repository.FakeShoppingListRepository
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class DeleteProductsTest {

    private lateinit var deleteProducts: DeleteProducts

    @Before
    fun setUp() {
        val repository = FakeShoppingListRepository()
        deleteProducts = DeleteProducts(repository)
    }

    @Test
    fun `Empty list `
}