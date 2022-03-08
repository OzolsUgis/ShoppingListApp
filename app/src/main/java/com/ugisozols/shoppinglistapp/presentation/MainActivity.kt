package com.ugisozols.shoppinglistapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import com.ugisozols.shoppinglistapp.presentation.shopping_list.ShoppingScreen
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ShoppingListAppTheme
import com.ugisozols.shoppinglistapp.presentation.welcome_screen.WelcomeScreen
import com.ugisozols.shoppinglistapp.utils.navigation.Route
import com.ugisozols.shoppinglistapp.utils.navigation.navigate
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val shouldShowWelcome = preferences.loadShouldShowWelcome()
        setContent {
            ShoppingListAppTheme {
                val scaffoldState = rememberScaffoldState()
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState
                ) {

                    NavHost(
                        navController = navController,
                        startDestination = if (shouldShowWelcome) {
                            Route.WELCOME_ROUTE
                        } else {
                            Route.SHOPPING_LIST_ROUTE
                        }
                    ) {
                        composable(Route.WELCOME_ROUTE) {
                            WelcomeScreen(
                                scaffoldState = scaffoldState,
                                navController::navigate
                            )
                        }
                        composable(Route.SHOPPING_LIST_ROUTE){
                            ShoppingScreen(scaffoldState = scaffoldState)
                        }
                    }
                }
            }
        }
    }
}



