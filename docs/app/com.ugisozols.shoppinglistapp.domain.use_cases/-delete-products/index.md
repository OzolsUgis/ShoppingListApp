---
title: DeleteProducts
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.use_cases](../index.html)/[DeleteProducts](index.html)



# DeleteProducts



[androidJvm]\
class [DeleteProducts](index.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))

[DeleteProducts](index.html) use case runs function that takes list as a parameter, checks if list in not empty and sends that list further to [ShoppingListRepository.deleteProducts](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/delete-products.html) funtion



## Constructors


| | |
|---|---|
| [DeleteProducts](-delete-products.html) | [androidJvm]<br>fun [DeleteProducts](-delete-products.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [invoke](invoke.html) | [androidJvm]<br>suspend operator fun [invoke](invoke.html)(list: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;): [Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |

