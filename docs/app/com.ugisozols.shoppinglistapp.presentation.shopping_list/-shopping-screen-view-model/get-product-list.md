---
title: getProductList
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.presentation.shopping_list](../index.html)/[ShoppingScreenViewModel](index.html)/[getProductList](get-product-list.html)



# getProductList



[androidJvm]\
fun [getProductList](get-product-list.html)()



Function collects data from [currentCategory](current-category.html) state and updates list for the category of specific state



This function is called in UI and [ShoppingScreenViewModel](index.html) init block with default value "general"



In case of error return function sends event to _uiEvent to Show snackbar with error message




