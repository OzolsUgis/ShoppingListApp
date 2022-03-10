---
title: com.ugisozols.shoppinglistapp.domain.use_cases
---
//[app](../../index.html)/[com.ugisozols.shoppinglistapp.domain.use_cases](index.html)



# Package com.ugisozols.shoppinglistapp.domain.use_cases



## Types


| Name | Summary |
|---|---|
| [DeleteProducts](-delete-products/index.html) | [androidJvm]<br>class [DeleteProducts](-delete-products/index.html)(repository: [ShoppingListRepository](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))<br>[DeleteProducts](-delete-products/index.html) use case runs function that takes list as a parameter, checks if list in not empty and sends that list further to [ShoppingListRepository.deleteProducts](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/delete-products.html) funtion |
| [GetProducts](-get-products/index.html) | [androidJvm]<br>class [GetProducts](-get-products/index.html)(repository: [ShoppingListRepository](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))<br>[GetProducts](-get-products/index.html) use case runs function that takes [Category](../com.ugisozols.shoppinglistapp.domain.models/-category/index.html) name attribute and passes on as a string to [ShoppingListRepository.getShoppingList](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/get-shopping-list.html) function |
| [InsertProduct](-insert-product/index.html) | [androidJvm]<br>class [InsertProduct](-insert-product/index.html)(repository: [ShoppingListRepository](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))<br>[InsertProduct](-insert-product/index.html) use case runs function that validates data & checks if inputs are not null If Input field is empty then function returns ShowSnackbar event with error message if data passes validation it gets sent to repository to add [Product](../com.ugisozols.shoppinglistapp.domain.models/-product/index.html) object to cloud |
| [UpdateProduct](-update-product/index.html) | [androidJvm]<br>class [UpdateProduct](-update-product/index.html)(repository: [ShoppingListRepository](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html))<br>[UpdateProduct](-update-product/index.html) use case runs function that takes [Product](../com.ugisozols.shoppinglistapp.domain.models/-product/index.html) object and [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) object as a parameter to send further to [ShoppingListRepository.updateProduct](../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/update-product.html) function |
| [UseCases](-use-cases/index.html) | [androidJvm]<br>data class [UseCases](-use-cases/index.html)(insertProduct: [InsertProduct](-insert-product/index.html), getProducts: [GetProducts](-get-products/index.html), deleteProducts: [DeleteProducts](-delete-products/index.html), updateProduct: [UpdateProduct](-update-product/index.html))<br>[UseCases](-use-cases/index.html) class combines all use cases for this application |

