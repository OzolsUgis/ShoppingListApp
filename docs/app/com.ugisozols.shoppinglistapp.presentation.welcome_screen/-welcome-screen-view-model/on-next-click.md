---
title: onNextClick
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.presentation.welcome_screen](../index.html)/[WelcomeScreenViewModel](index.html)/[onNextClick](on-next-click.html)



# onNextClick



[androidJvm]\
fun [onNextClick](on-next-click.html)()



Function collects state on [name](name.html) if its empty then error message in form of [UiEvent.ShowSnackbar](../../com.ugisozols.shoppinglistapp.utils/-ui-event/-show-snackbar/index.html) is sent to _uiEvent to later be observed in UI and snackbar can be shown



In case [name](name.html) state is not empty then its value gets passed to [Preferences.saveUserName](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/save-user-name.html) function which saves [name](name.html) in shared preferences



Also in case of successful execution [UiEvent.Navigate](../../com.ugisozols.shoppinglistapp.utils/-ui-event/-navigate/index.html) function is called and screen is navigated




