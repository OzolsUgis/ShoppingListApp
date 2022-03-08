package com.ugisozols.shoppinglistapp.utils.navigation

import androidx.navigation.NavController
import com.ugisozols.shoppinglistapp.utils.UiEvent


/**
 * [navigate] is extension function for [NavController]
 * which takes event parameter to navigate via given
 * event value
 *
 * @param [event] this event parameter is [UiEvent.Navigate] instance which contains route

 */
fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}

