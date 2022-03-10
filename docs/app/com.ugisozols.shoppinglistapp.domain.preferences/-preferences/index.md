---
title: Preferences
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.preferences](../index.html)/[Preferences](index.html)



# Preferences



[androidJvm]\
interface [Preferences](index.html)

[Preferences](index.html) interface contains functions for setting and getting data



## Types


| Name | Summary |
|---|---|
| [Companion](-companion/index.html) | [androidJvm]<br>object [Companion](-companion/index.html) |


## Functions


| Name | Summary |
|---|---|
| [loadShouldShowWelcome](load-should-show-welcome.html) | [androidJvm]<br>abstract fun [loadShouldShowWelcome](load-should-show-welcome.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>This is member of [Preferences](index.html) class |
| [loadUserName](load-user-name.html) | [androidJvm]<br>abstract fun [loadUserName](load-user-name.html)(): [UserInfo](../../com.ugisozols.shoppinglistapp.domain.models/-user-info/index.html)<br>This is member of [Preferences](index.html) class |
| [saveShouldShowWelcome](save-should-show-welcome.html) | [androidJvm]<br>abstract fun [saveShouldShowWelcome](save-should-show-welcome.html)(shouldShow: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>This is member of [Preferences](index.html) class function saves boolean value to Shared Preferences |
| [saveUserName](save-user-name.html) | [androidJvm]<br>abstract fun [saveUserName](save-user-name.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>This is member of [Preferences](index.html) class function saves name value to Shared Preferences |


## Inheritors


| Name |
|---|
| [PreferencesImpl](../../com.ugisozols.shoppinglistapp.data.local.preferences/-preferences-impl/index.html) |

