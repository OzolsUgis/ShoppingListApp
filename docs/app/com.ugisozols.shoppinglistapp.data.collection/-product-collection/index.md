---
title: ProductCollection
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.data.collection](../index.html)/[ProductCollection](index.html)



# ProductCollection



[androidJvm]\
data class [ProductCollection](index.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, category: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, date: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, checked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

[ProductCollection](index.html) specifies attributes for Product collection in each object in cloud all of the attributes ar Nullable and set with default values to avoid any serialization errors



## Constructors


| | |
|---|---|
| [ProductCollection](-product-collection.html) | [androidJvm]<br>fun [ProductCollection](-product-collection.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = "", amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = "", category: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = "", date: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, checked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = "") |


## Properties


| Name | Summary |
|---|---|
| [amount](amount.html) | [androidJvm]<br>val [amount](amount.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [category](category.html) | [androidJvm]<br>val [category](category.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [checked](checked.html) | [androidJvm]<br>val [checked](checked.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null |
| [date](date.html) | [androidJvm]<br>val [date](date.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |


## Extensions


| Name | Summary |
|---|---|
| [toProducts](../../com.ugisozols.shoppinglistapp.data.mapper/to-products.html) | [androidJvm]<br>fun [ProductCollection](index.html).[toProducts](../../com.ugisozols.shoppinglistapp.data.mapper/to-products.html)(): [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)<br>Extension function of [ProductCollection](index.html) |

