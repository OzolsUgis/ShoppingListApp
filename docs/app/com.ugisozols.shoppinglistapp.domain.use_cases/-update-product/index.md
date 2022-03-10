---
title: UpdateProduct
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.use_cases](../index.html)/[UpdateProduct](index.html)



# UpdateProduct



[androidJvm]\
class [UpdateProduct](index.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))

[UpdateProduct](index.html) use case runs function that takes [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html) object and [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) object as a parameter to send further to [ShoppingListRepository.updateProduct](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/update-product.html) function



## Constructors


| | |
|---|---|
| [UpdateProduct](-update-product.html) | [androidJvm]<br>fun [UpdateProduct](-update-product.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [invoke](invoke.html) | [androidJvm]<br>suspend operator fun [invoke](invoke.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html), value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |

