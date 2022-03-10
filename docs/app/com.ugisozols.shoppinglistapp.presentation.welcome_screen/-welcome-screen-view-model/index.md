---
title: WelcomeScreenViewModel
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.presentation.welcome_screen](../index.html)/[WelcomeScreenViewModel](index.html)



# WelcomeScreenViewModel



[androidJvm]\
class [WelcomeScreenViewModel](index.html)@Injectconstructor(preferences: [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)



## Functions


| Name | Summary |
|---|---|
| [clear](index.html#-1936886459%2FFunctions%2F-451970049) | [androidJvm]<br>@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)<br>fun [clear](index.html#-1936886459%2FFunctions%2F-451970049)() |
| [getTag](index.html#-215894976%2FFunctions%2F-451970049) | [androidJvm]<br>open fun &lt;[T](index.html#-215894976%2FFunctions%2F-451970049) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [getTag](index.html#-215894976%2FFunctions%2F-451970049)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](index.html#-215894976%2FFunctions%2F-451970049) |
| [onAddName](on-add-name.html) | [androidJvm]<br>fun [onAddName](on-add-name.html)(newName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Function sets state to [name](name.html) variable takes [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value as parameter, then sets current input field state to name variable |
| [onCleared](index.html#-1930136507%2FFunctions%2F-451970049) | [androidJvm]<br>open fun [onCleared](index.html#-1930136507%2FFunctions%2F-451970049)() |
| [onNextClick](on-next-click.html) | [androidJvm]<br>fun [onNextClick](on-next-click.html)()<br>Function collects state on [name](name.html) if its empty then error message in form of [UiEvent.ShowSnackbar](../../com.ugisozols.shoppinglistapp.utils/-ui-event/-show-snackbar/index.html) is sent to _uiEvent to later be observed in UI and snackbar can be shown |
| [setTagIfAbsent](index.html#-1567230750%2FFunctions%2F-451970049) | [androidJvm]<br>open fun &lt;[T](index.html#-1567230750%2FFunctions%2F-451970049) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [setTagIfAbsent](index.html#-1567230750%2FFunctions%2F-451970049)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [T](index.html#-1567230750%2FFunctions%2F-451970049)): [T](index.html#-1567230750%2FFunctions%2F-451970049) |


## Properties


| Name | Summary |
|---|---|
| [name](name.html) | [androidJvm]<br>var [name](name.html): MutableState&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [uiEvent](ui-event.html) | [androidJvm]<br>val [uiEvent](ui-event.html): Flow&lt;[UiEvent](../../com.ugisozols.shoppinglistapp.utils/-ui-event/index.html)&gt;<br>Immutable value of _uiEvent this gets observed in UI |

