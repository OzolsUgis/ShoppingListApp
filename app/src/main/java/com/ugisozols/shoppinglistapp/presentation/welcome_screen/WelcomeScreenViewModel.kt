package com.ugisozols.shoppinglistapp.presentation.welcome_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.utils.navigation.Route
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import com.ugisozols.shoppinglistapp.utils.UiEvent
import com.ugisozols.shoppinglistapp.utils.UiText
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeScreenViewModel @Inject constructor(
    private val preferences: Preferences
) : ViewModel() {

    var name = mutableStateOf("")
        private set

    /**
     * Function sets state to [name] variable
     * takes [String] value as parameter, then
     * sets current input field state to name variable
     */
    fun onAddName(newName : String){
        name.value = newName
    }

    /**
     * Mutable value of [uiEvent] this sends oneTime events to UI
     * This value can only be modified within viewModel because it's not correct
     * to be able to access this outside viewModel
     */
    private val _uiEvent = Channel<UiEvent>()



    /**
     * Immutable value of [_uiEvent] this gets observed in UI
     */
    val uiEvent = _uiEvent.receiveAsFlow()


    /**
     * Function collects state on [name] if its empty
     * then error message in form of [UiEvent.ShowSnackbar]
     * is sent to [_uiEvent] to later be observed in UI and snackbar can be shown
     *
     * In case [name] state is not empty then its value gets passed
     * to [Preferences.saveUserName] function which saves [name] in
     * shared preferences
     *
     * Also in case of successful execution [UiEvent.Navigate] function is
     * called and screen is navigated
     *
     */
    fun onNextClick(){
        viewModelScope.launch {
            if(name.value.isBlank()){
                _uiEvent.send(
                    UiEvent.ShowSnackbar(
                        UiText.StringResource(R.string.empty_username_input)
                    )
                )
                name.value = ""
                return@launch
            }
            preferences.saveUserName(name.value)

            _uiEvent.send(
                UiEvent.Navigate(route = Route.SHOPPING_LIST_ROUTE)
            )
        }
    }
}