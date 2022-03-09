package com.ugisozols.shoppinglistapp.domain.use_cases

import com.google.common.truth.Truth.assertThat
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.data.repository.FakeShoppingListRepository
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.domain.models.Product
import com.ugisozols.shoppinglistapp.utils.Resource
import com.ugisozols.shoppinglistapp.utils.UiText
import kotlinx.coroutines.runBlocking

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
    fun `Empty list, should return error`() : Unit = runBlocking{
        val list = emptyList<Product>()
        val testResponse = deleteProducts(list)

        assertThat(
            testResponse == Resource.Error(UiText.StringResource(R.string.delete_list_empty), null)
        )
    }

    @Test
    fun `List contains objects, should return success`() : Unit = runBlocking {
        val list = mutableListOf(
            Product(
                name = "Pipe",
                amount = "7mm",
                category = Category.House,
                checked = true
            )
        )
        val testResponse = deleteProducts(list)

        assertThat(
            testResponse == Resource.Success(null)
        )
    }
}