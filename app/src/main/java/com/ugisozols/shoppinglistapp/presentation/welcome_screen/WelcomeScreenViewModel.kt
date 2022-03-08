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

    fun onAddName(newName : String){
        name.value = newName
    }

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

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