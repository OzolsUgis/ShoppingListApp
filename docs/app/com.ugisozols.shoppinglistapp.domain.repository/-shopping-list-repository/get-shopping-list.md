---
title: getShoppingList
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.repository](../index.html)/[ShoppingListRepository](index.html)/[getShoppingList](get-shopping-list.html)



# getShoppingList



[androidJvm]\
abstract fun [getShoppingList](get-shopping-list.html)(category: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Flow&lt;[Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;&gt;&gt;



[getShoppingList](get-shopping-list.html) function is member of [ShoppingListRepository](index.html) used to get live data from cloud server



#### Return



Flow of Type [Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html) of Type [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)



## Parameters


androidJvm

| | |
|---|---|
| category | of type [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) takes category name as a parameter to return specific list of specific category |




