---
title: UiText
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.utils](../index.html)/[UiText](index.html)



# UiText



[androidJvm]\
sealed class [UiText](index.html)

[UiText](index.html) contains instances of different kid on string inputs allows you to use string resources without context



-[DynamicString](-dynamic-string/index.html) -[StringResource](-string-resource/index.html) -[asString](as-string.html)



## Types


| Name | Summary |
|---|---|
| [DynamicString](-dynamic-string/index.html) | [androidJvm]<br>data class [DynamicString](-dynamic-string/index.html)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UiText](index.html)<br>Dynamic string simply takes text input |
| [StringResource](-string-resource/index.html) | [androidJvm]<br>data class [StringResource](-string-resource/index.html)(resId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [UiText](index.html)<br>String resource takes resourceId as a parameter and return UiText instance with that string specified by string resource |


## Functions


| Name | Summary |
|---|---|
| [asString](as-string.html) | [androidJvm]<br>fun [asString](as-string.html)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Function is used to return string for UI from [UiText](index.html) instance |


## Inheritors


| Name |
|---|
| [DynamicString](-dynamic-string/index.html) |
| [StringResource](-string-resource/index.html) |

