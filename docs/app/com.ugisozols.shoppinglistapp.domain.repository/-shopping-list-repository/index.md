---
title: ShoppingListRepository
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.repository](../index.html)/[ShoppingListRepository](index.html)



# ShoppingListRepository



[androidJvm]\
interface [ShoppingListRepository](index.html)

[ShoppingListRepository](index.html) is interface for functions that manipulates with firebase cloud server. Repository is made as interface for improved testing purposes



Repository contains :



- 
   [getShoppingList](get-shopping-list.html)
- 
   [insertProduct](insert-product.html)
- 
   [deleteProducts](delete-products.html)
- 
   [updateProduct](update-product.html)




Repository is implemented in data package



## Functions


| Name | Summary |
|---|---|
| [deleteProducts](delete-products.html) | [androidJvm]<br>abstract suspend fun [deleteProducts](delete-products.html)(products: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;)<br>[deleteProducts](delete-products.html) function is member of [ShoppingListRepository](index.html) used to delete products from cloud server |
| [getShoppingList](get-shopping-list.html) | [androidJvm]<br>abstract fun [getShoppingList](get-shopping-list.html)(category: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Flow&lt;[Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;&gt;&gt;<br>[getShoppingList](get-shopping-list.html) function is member of [ShoppingListRepository](index.html) used to get live data from cloud server |
| [insertProduct](insert-product.html) | [androidJvm]<br>abstract suspend fun [insertProduct](insert-product.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html))<br>[insertProduct](insert-product.html) function is member of [ShoppingListRepository](index.html) used to insert data in cloud server |
| [updateProduct](update-product.html) | [androidJvm]<br>abstract suspend fun [updateProduct](update-product.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html), value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>[updateProduct](update-product.html) function is member of [ShoppingListRepository](index.html) used to update specific product |


## Inheritors


| Name |
|---|
| [ShoppingListRepositoryImpl](../../com.ugisozols.shoppinglistapp.data.repository/-shopping-list-repository-impl/index.html) |

