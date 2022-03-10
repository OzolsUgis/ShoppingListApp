---
title: Resource
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.utils](../index.html)/[Resource](index.html)



# Resource



[androidJvm]\
sealed class [Resource](index.html)&lt;[T](index.html)&gt;

[Resource](index.html) class is used to wrap data in to state it improves dealing with data state while making for example api call



[Resource](index.html) have three states:



- 
   [Loading](-loading/index.html)
- 
   [Success](-success/index.html)
- 
   [Error](-error/index.html)



## Parameters


androidJvm

| | |
|---|---|
| data | incoming data with nullable type [T](index.html) |
| uiText | message of type [UiText](../-ui-text/index.html) usually returns error messages |



## Types


| Name | Summary |
|---|---|
| [Error](-error/index.html) | [androidJvm]<br>class [Error](-error/index.html)&lt;[T](-error/index.html)&gt;(uiText: [UiText](../-ui-text/index.html), data: [T](-error/index.html)?) : [Resource](index.html)&lt;[T](-error/index.html)&gt; <br>[Error](-error/index.html) state is member of [Resource](index.html) states this state returns error when response is interrupted or response is not valid state can still show cached data |
| [Loading](-loading/index.html) | [androidJvm]<br>class [Loading](-loading/index.html)&lt;[T](-loading/index.html)&gt;(data: [T](-loading/index.html)?) : [Resource](index.html)&lt;[T](-loading/index.html)&gt; <br>[Loading](-loading/index.html) state is member of [Resource](index.html) states with provided data param you can assign values usually it provides cached data while api call makes data update |
| [Success](-success/index.html) | [androidJvm]<br>class [Success](-success/index.html)&lt;[T](-success/index.html)&gt;(data: [T](-success/index.html)?) : [Resource](index.html)&lt;[T](-success/index.html)&gt; <br>[Success](-success/index.html) state is member of [Resource](index.html) states this state returns successful api call data |


## Properties


| Name | Summary |
|---|---|
| [data](data.html) | [androidJvm]<br>val [data](data.html): [T](index.html)? = null |
| [uiText](ui-text.html) | [androidJvm]<br>val [uiText](ui-text.html): [UiText](../-ui-text/index.html)? = null |


## Inheritors


| Name |
|---|
| [Loading](-loading/index.html) |
| [Success](-success/index.html) |
| [Error](-error/index.html) |

