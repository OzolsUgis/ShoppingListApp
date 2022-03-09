package com.ugisozols.shoppinglistapp

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.common.truth.Truth.assertThat
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.domain.models.UserInfo
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import com.ugisozols.shoppinglistapp.domain.use_cases.*
import com.ugisozols.shoppinglistapp.presentation.MainActivity
import com.ugisozols.shoppinglistapp.presentation.shopping_list.ShoppingScreen
import com.ugisozols.shoppinglistapp.presentation.shopping_list.ShoppingScreenViewModel
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ShoppingListAppTheme
import com.ugisozols.shoppinglistapp.presentation.welcome_screen.WelcomeScreen
import com.ugisozols.shoppinglistapp.presentation.welcome_screen.WelcomeScreenViewModel
import com.ugisozols.shoppinglistapp.repository.ShoppingListRepositoryFake
import com.ugisozols.shoppinglistapp.utils.navigation.Route
import com.ugisozols.shoppinglistapp.utils.navigation.navigate
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.mockk.every
import io.mockk.mockk
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class ShoppingListAppE2E {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()


    private lateinit var fakeRepository : ShoppingListRepositoryFake
    private lateinit var useCases: UseCases
    private lateinit var preferences: Preferences
    private lateinit var shoppingScreenViewModel: ShoppingScreenViewModel
    private lateinit var welcomeScreenViewModel: WelcomeScreenViewModel

    private lateinit var navController : NavHostController

    @Before
    fun setUp(){

        fakeRepository = ShoppingListRepositoryFake()
        useCases = UseCases(
            insertProduct = InsertProduct(fakeRepository),
            getProducts = GetProducts(fakeRepository),
            deleteProducts = DeleteProducts(fakeRepository),
            updateProduct = UpdateProduct(fakeRepository)
        )
        preferences = mockk(relaxed = true)
        every { preferences.loadUserName()} returns UserInfo(
            name = "TestName"
        )
        shoppingScreenViewModel = ShoppingScreenViewModel(
            useCases,
            preferences
        )
        welcomeScreenViewModel = WelcomeScreenViewModel(
            preferences
        )



        composeRule.setContent {
            val scaffoldState = rememberScaffoldState()
            ShoppingListAppTheme {
                navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState
                ) {

                    NavHost(
                        navController = navController,
                        startDestination = Route.WELCOME_ROUTE

                    ) {
                        composable(Route.WELCOME_ROUTE) {
                            WelcomeScreen(
                                scaffoldState = scaffoldState,
                                navController::navigate,
                                viewModel = welcomeScreenViewModel
                            )
                        }
                        composable(Route.SHOPPING_LIST_ROUTE){
                            ShoppingScreen(
                                scaffoldState = scaffoldState,
                                viewModel = shoppingScreenViewModel
                            )
                        }
                    }
                }
            }
        }
    }

    @Test
    fun addProductToList_productIsShownInList_afterwardsDeleted(){
        val usernameInput = "TestName"
        val productName = "TestProduct"
        val amount = "Test"
        val selectedCategory = Category.General

        assertThat(
            navController.currentDestination
                ?.route
                ?.startsWith(Route.WELCOME_ROUTE)
        ).isTrue()

        composeRule
            .onNodeWithText("ShoppingListApp")
            .assertExists()
        composeRule
            .onNodeWithContentDescription("input_username")
            .performTextInput(usernameInput)

        composeRule
            .onNodeWithText("Next")
            .performClick()

        assertThat(
            navController.currentDestination
                ?.route
                ?.startsWith(Route.SHOPPING_LIST_ROUTE)
        ).isTrue()

        composeRule
            .onNodeWithContentDescription("greeting")
            .assertExists()

        composeRule
            .onNodeWithText("Hello,$usernameInput")
            .assertExists()

        composeRule
            .onNodeWithContentDescription("expandButton")
            .assertExists()

        composeRule
            .onNodeWithContentDescription("deleteButton")
            .assertExists()

        composeRule
            .onNodeWithText("Add")
            .performClick()

        composeRule
            .onNodeWithContentDescription("alertDialog")
            .assertExists()

        composeRule
            .onNodeWithText("Add new product")
            .assertExists()

        composeRule
            .onNodeWithText("Name:")
            .assertExists()

        composeRule
            .onNodeWithText("Amount:")
            .assertExists()

        composeRule
            .onNodeWithContentDescription("productName")
            .performTextInput(productName)

        composeRule
            .onNodeWithContentDescription("productAmount")
            .performTextInput(amount)

        composeRule
            .onNodeWithContentDescription("dialogDropdown")
            .performClick()

        Category.listOfCategories.forEach {
            composeRule
                .onNodeWithText(it.name)
                .assertExists()
        }

        composeRule
            .onNodeWithText(selectedCategory.name)
            .performClick()

        Category.listOfCategories.forEach {
            if (it == selectedCategory){
                composeRule
                    .onNodeWithText(it.name)
                    .assertExists()
            }else{
                composeRule
                    .onNodeWithText(it.name)
                    .assertDoesNotExist()
            }

        }

        composeRule
            .onNodeWithContentDescription("alertDialog_add")
            .performClick()

        composeRule
            .onNodeWithContentDescription("alertDialog")
            .assertDoesNotExist()

        composeRule
            .onNodeWithText(productName)
            .assertExists()

        composeRule
            .onNodeWithText(amount)
            .assertExists()

        composeRule
            .onNodeWithContentDescription("expandButton")
            .performClick()

        composeRule
            .onNodeWithContentDescription("expandedCatList")
            .assertExists()

        composeRule
            .onNodeWithText(
                Category.Garden.name[0].uppercase()+Category.Garden.name.substring(1)
            )
            .performClick()

        composeRule
            .onNodeWithContentDescription("expandedCatList")
            .assertDoesNotExist()

        composeRule
            .onNodeWithText(
                Category.Garden.name[0].uppercase()+Category.Garden.name.substring(1)
            )
            .assertExists()

        composeRule
            .onNodeWithText(productName)
            .performClick()

        composeRule
            .onNodeWithContentDescription("deleteButton")
            .performClick()


        composeRule
            .onNodeWithText(productName)
            .assertDoesNotExist()

        composeRule
            .onNodeWithText(amount)
            .assertDoesNotExist()

    }

}