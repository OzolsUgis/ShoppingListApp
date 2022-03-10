---
title: StringResource
---
//[app](../../../../index.html)/[com.ugisozols.shoppinglistapp.utils](../../index.html)/[UiText](../index.html)/[StringResource](index.html)



# StringResource



[androidJvm]\
data class [StringResource](index.html)(resId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [UiText](../index.html)

String resource takes resourceId as a parameter and return UiText instance with that string specified by string resource



#### Return



[UiText](../index.html) instance



## Parameters


androidJvm

| | |
|---|---|
| resId | of Type [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) is string resource Id |



## Constructors


| | |
|---|---|
| [StringResource](-string-resource.html) | [androidJvm]<br>fun [StringResource](-string-resource.html)(resId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [asString](../as-string.html) | [androidJvm]<br>fun [asString](../as-string.html)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Function is used to return string for UI from [UiText](../index.html) instance |


## Properties


| Name | Summary |
|---|---|
| [resId](res-id.html) | [androidJvm]<br>val [resId](res-id.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

