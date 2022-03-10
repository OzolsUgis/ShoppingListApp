---
title: Product
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.domain.models](../index.html)/[Product](index.html)



# Product



[androidJvm]\
data class [Product](index.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), category: [Category](../-category/index.html), checked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), date: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

[Product](index.html) class specifies attributes for each Product



## Constructors


| | |
|---|---|
| [Product](-product.html) | [androidJvm]<br>fun [Product](-product.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), category: [Category](../-category/index.html), checked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, date: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = System.currentTimeMillis(), id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [amount](amount.html) | [androidJvm]<br>val [amount](amount.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [category](category.html) | [androidJvm]<br>val [category](category.html): [Category](../-category/index.html) |
| [checked](checked.html) | [androidJvm]<br>var [checked](checked.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [date](date.html) | [androidJvm]<br>val [date](date.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |


## Extensions


| Name | Summary |
|---|---|
| [toProductCollection](../../com.ugisozols.shoppinglistapp.data.mapper/to-product-collection.html) | [androidJvm]<br>fun [Product](index.html).[toProductCollection](../../com.ugisozols.shoppinglistapp.data.mapper/to-product-collection.html)(): [ProductCollection](../../com.ugisozols.shoppinglistapp.data.collection/-product-collection/index.html)<br>extension function of [Product](index.html) class |

