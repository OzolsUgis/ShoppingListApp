package com.ugisozols.shoppinglistapp.domain.use_cases


import com.google.common.truth.Truth.assertThat
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.data.repository.FakeShoppingListRepository
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.utils.UiEvent
import com.ugisozols.shoppinglistapp.utils.UiText
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class InsertProductTest {

    private lateinit var insertProduct: InsertProduct

    @Before
    fun setUp() {
        val repository = FakeShoppingListRepository()
        insertProduct = InsertProduct(repository)
    }

    @Test
    fun `Name field empty, should return error snackbar`(): Unit = runBlocking{
        val response = insertProduct("", "7 mm", Category.House.name)

        assertThat(response == UiEvent.ShowSnackbar(UiText.StringResource(R.string.inputEmpty)))
    }

    @Test
    fun `Amount field empty, should return error snackbar`(): Unit = runBlocking{
        val response = insertProduct("Pipe", "", Category.House.name)

        assertThat(response == UiEvent.ShowSnackbar(UiText.StringResource(R.string.inputEmpty)))
    }

    @Test
    fun `Valid information, should return successful snackbar`() : Unit  = runBlocking {
        val response = insertProduct("Pipe", "7mm", Category.House.name)


        assertThat(
            response == UiEvent.ShowSnackbar(
                UiText.StringResource(
                    R.string.successfully_added_product
                )
            )
        )
    }
}