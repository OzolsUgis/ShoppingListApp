---
title: UiEvent
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.utils](../index.html)/[UiEvent](index.html)



# UiEvent



[androidJvm]\
sealed class [UiEvent](index.html)

[UiEvent](index.html) contains data classes that shows specific event of the application. Event gets observed in UI



- 
   [ShowSnackbar](-show-snackbar/index.html)
- 
   [Navigate](-navigate/index.html)



## Types


| Name | Summary |
|---|---|
| [Navigate](-navigate/index.html) | [androidJvm]<br>data class [Navigate](-navigate/index.html)(route: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UiEvent](index.html)<br>Navigate event gets observed in UI and it calls function usually in viewModel to navigate for example to next screen |
| [ShowSnackbar](-show-snackbar/index.html) | [androidJvm]<br>data class [ShowSnackbar](-show-snackbar/index.html)(message: [UiText](../-ui-text/index.html)) : [UiEvent](index.html)<br>Show snackbar event gets observed in UI and calls showSnackbar function in scaffold state this snackbar contains message of [UiText](../-ui-text/index.html) which gets outputted in UI |


## Inheritors


| Name |
|---|
| [ShowSnackbar](-show-snackbar/index.html) |
| [Navigate](-navigate/index.html) |

