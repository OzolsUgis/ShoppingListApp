---
title: GetProducts
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.use_cases](../index.html)/[GetProducts](index.html)



# GetProducts



[androidJvm]\
class [GetProducts](index.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))

[GetProducts](index.html) use case runs function that takes [Category](../../com.ugisozols.shoppinglistapp.domain.models/-category/index.html) name attribute and passes on as a string to [ShoppingListRepository.getShoppingList](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/get-shopping-list.html) function



## Constructors


| | |
|---|---|
| [GetProducts](-get-products.html) | [androidJvm]<br>fun [GetProducts](-get-products.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [invoke](invoke.html) | [androidJvm]<br>operator fun [invoke](invoke.html)(category: [Category](../../com.ugisozols.shoppinglistapp.domain.models/-category/index.html)?): Flow&lt;[Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;&gt;&gt; |

