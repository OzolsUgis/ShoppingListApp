---
title: PreferencesImpl
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.data.local.preferences](../index.html)/[PreferencesImpl](index.html)



# PreferencesImpl



[androidJvm]\
class [PreferencesImpl](index.html)@Injectconstructor(sharedPref: [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html)) : [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html)

Implementation of [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html)



- 
   [saveUserName](save-user-name.html)
- 
   [loadUserName](load-user-name.html)
- 
   [saveShouldShowWelcome](save-should-show-welcome.html)
- 
   [loadShouldShowWelcome](load-should-show-welcome.html)



## Constructors


| | |
|---|---|
| [PreferencesImpl](-preferences-impl.html) | [androidJvm]<br>@Inject<br>fun [PreferencesImpl](-preferences-impl.html)(sharedPref: [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html)) |


## Functions


| Name | Summary |
|---|---|
| [loadShouldShowWelcome](load-should-show-welcome.html) | [androidJvm]<br>open override fun [loadShouldShowWelcome](load-should-show-welcome.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>This is member of [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html) class |
| [loadUserName](load-user-name.html) | [androidJvm]<br>open override fun [loadUserName](load-user-name.html)(): [UserInfo](../../com.ugisozols.shoppinglistapp.domain.models/-user-info/index.html)<br>This is member of [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html) class |
| [saveShouldShowWelcome](save-should-show-welcome.html) | [androidJvm]<br>open override fun [saveShouldShowWelcome](save-should-show-welcome.html)(shouldShow: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>This is member of [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html) class function saves boolean value to Shared Preferences |
| [saveUserName](save-user-name.html) | [androidJvm]<br>open override fun [saveUserName](save-user-name.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>This is member of [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html) class function saves name value to Shared Preferences |

