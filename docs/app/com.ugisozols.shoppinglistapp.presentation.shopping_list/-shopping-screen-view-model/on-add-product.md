---
title: onAddProduct
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.presentation.shopping_list](../index.html)/[ShoppingScreenViewModel](index.html)/[onAddProduct](on-add-product.html)



# onAddProduct



[androidJvm]\
fun [onAddProduct](on-add-product.html)()



Function collects data from [name](name.html),[amount](amount.html),[chosenCategoryName](chosen-category-name.html) and send this data to [UseCases.insertProduct](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/insert-product.html) to validate and send further to repository



In case of error return function sends event to _uiEvent to Show snackbar with error message



after successfully executed function it return values in empty state




