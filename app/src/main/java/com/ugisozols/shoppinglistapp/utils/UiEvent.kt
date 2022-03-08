package com.ugisozols.shoppinglistapp.utils


/**
 * [UiEvent] contains data classes that shows specific
 *  event of the application.
 *  Event gets observed in UI
 *
 *  - [ShowSnackbar]
 *  - [Navigate]
 */
sealed class UiEvent{
    /**
     * Show snackbar event gets observed in UI and calls showSnackbar function in scaffold state
     * this snackbar contains message of [UiText] which gets outputted in UI
     *
     * @param message of Type [UiText] contains message for snackbar
     *
     */
    data class ShowSnackbar(val message : UiText) : UiEvent()

    /**
     * Navigate event gets observed in UI and it calls function usually in viewModel
     * to navigate for example to next screen
     *
     * @param route of Type [String] contains route string
     */
    data class Navigate(val route : String) : UiEvent()
}
