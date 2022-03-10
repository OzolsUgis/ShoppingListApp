---
title: Error
---
//[app](../../../../index.html)/[com.ugisozols.shoppinglistapp.utils](../../index.html)/[Resource](../index.html)/[Error](index.html)



# Error



[androidJvm]\
class [Error](index.html)&lt;[T](index.html)&gt;(uiText: [UiText](../../-ui-text/index.html), data: [T](index.html)?) : [Resource](../index.html)&lt;[T](index.html)&gt; 

[Error](index.html) state is member of [Resource](../index.html) states this state returns error when response is interrupted or response is not valid state can still show cached data



## Parameters


androidJvm

| | |
|---|---|
| uiText | adding message to error state it can be message from server or hardcoded string which is later observed and shown in UI |
| data | to add any cached data to response |



## Constructors


| | |
|---|---|
| [Error](-error.html) | [androidJvm]<br>fun &lt;[T](index.html)&gt; [Error](-error.html)(uiText: [UiText](../../-ui-text/index.html), data: [T](index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [data](../data.html) | [androidJvm]<br>val [data](../data.html): [T](index.html)? |
| [uiText](../ui-text.html) | [androidJvm]<br>val [uiText](../ui-text.html): [UiText](../../-ui-text/index.html)? |

