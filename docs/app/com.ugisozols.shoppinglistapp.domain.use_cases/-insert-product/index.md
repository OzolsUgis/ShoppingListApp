---
title: InsertProduct
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.use_cases](../index.html)/[InsertProduct](index.html)



# InsertProduct



[androidJvm]\
class [InsertProduct](index.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))

[InsertProduct](index.html) use case runs function that validates data & checks if inputs are not null If Input field is empty then function returns ShowSnackbar event with error message if data passes validation it gets sent to repository to add [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html) object to cloud



## Constructors


| | |
|---|---|
| [InsertProduct](-insert-product.html) | [androidJvm]<br>fun [InsertProduct](-insert-product.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [invoke](invoke.html) | [androidJvm]<br>suspend operator fun [invoke](invoke.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), category: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [UiEvent](../../com.ugisozols.shoppinglistapp.utils/-ui-event/index.html) |

