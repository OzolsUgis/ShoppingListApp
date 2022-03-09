package com.ugisozols.shoppinglistapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
        preferences = mockk(relaxed = true)
        every { preferences.loadUserName()} returns UserInfo(
            name = "TestName"
        )

        fakeRepository = ShoppingListRepositoryFake()
        useCases = UseCases(
            insertProduct = InsertProduct(fakeRepository),
            getProducts = GetProducts(fakeRepository),
            deleteProducts = DeleteProducts(fakeRepository),
            updateProduct = UpdateProduct(fakeRepository)
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

}