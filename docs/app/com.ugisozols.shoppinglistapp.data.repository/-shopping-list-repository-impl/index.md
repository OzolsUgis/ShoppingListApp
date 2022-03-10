---
title: ShoppingListRepositoryImpl
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.data.repository](../index.html)/[ShoppingListRepositoryImpl](index.html)



# ShoppingListRepositoryImpl



[androidJvm]\
class [ShoppingListRepositoryImpl](index.html)@Injectconstructor(productRef: CollectionReference, productQuery: Query) : [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)

Implementation of [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)



#### Return



[ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html) implementation



## Parameters


androidJvm

| | |
|---|---|
| productRef | is injected parameter that allows to get CollectionReference |
| productQuery | is injected parameter that allows to get Query |



## Constructors


| | |
|---|---|
| [ShoppingListRepositoryImpl](-shopping-list-repository-impl.html) | [androidJvm]<br>@Inject<br>fun [ShoppingListRepositoryImpl](-shopping-list-repository-impl.html)(productRef: CollectionReference, productQuery: Query) |


## Functions


| Name | Summary |
|---|---|
| [deleteProducts](delete-products.html) | [androidJvm]<br>open suspend override fun [deleteProducts](delete-products.html)(products: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;)<br>[deleteProducts](delete-products.html) function is member of [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html) used to delete products from cloud server |
| [getShoppingList](get-shopping-list.html) | [androidJvm]<br>open override fun [getShoppingList](get-shopping-list.html)(category: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Flow&lt;[Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;&gt;&gt;<br>[getShoppingList](get-shopping-list.html) function is member of [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html) used to get live data from cloud server |
| [insertProduct](insert-product.html) | [androidJvm]<br>open suspend override fun [insertProduct](insert-product.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html))<br>[insertProduct](insert-product.html) function is member of [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html) used to insert data in cloud server |
| [updateProduct](update-product.html) | [androidJvm]<br>open suspend override fun [updateProduct](update-product.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html), value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>[updateProduct](update-product.html) function is member of [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html) used to update specific product |

