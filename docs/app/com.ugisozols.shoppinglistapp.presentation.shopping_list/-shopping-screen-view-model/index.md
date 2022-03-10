---
title: ShoppingScreenViewModel
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.presentation.shopping_list](../index.html)/[ShoppingScreenViewModel](index.html)



# ShoppingScreenViewModel



[androidJvm]\
class [ShoppingScreenViewModel](index.html)@Injectconstructor(useCases: [UseCases](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/index.html), preferences: [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

[ShoppingScreenViewModel](index.html) contains states and state change functions as well as functions that manipulates with data from call



## Constructors


| | |
|---|---|
| [ShoppingScreenViewModel](-shopping-screen-view-model.html) | [androidJvm]<br>@Inject<br>fun [ShoppingScreenViewModel](-shopping-screen-view-model.html)(useCases: [UseCases](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/index.html), preferences: [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [clear](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1936886459%2FFunctions%2F-451970049) | [androidJvm]<br>@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)<br>fun [clear](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1936886459%2FFunctions%2F-451970049)() |
| [deleteProductsFromList](delete-products-from-list.html) | [androidJvm]<br>fun [deleteProductsFromList](delete-products-from-list.html)()<br>Function collects data from listOfCheckedProducts list state and passes further to [UseCases.deleteProducts](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/delete-products.html) function |
| [getProductList](get-product-list.html) | [androidJvm]<br>fun [getProductList](get-product-list.html)()<br>Function collects data from [currentCategory](current-category.html) state and updates list for the category of specific state |
| [getTag](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-215894976%2FFunctions%2F-451970049) | [androidJvm]<br>open fun &lt;[T](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-215894976%2FFunctions%2F-451970049) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [getTag](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-215894976%2FFunctions%2F-451970049)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-215894976%2FFunctions%2F-451970049) |
| [onAddAmount](on-add-amount.html) | [androidJvm]<br>fun [onAddAmount](on-add-amount.html)(newAmount: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>sets [amount](amount.html) value to input amount value from Add new product alert dialog |
| [onAddName](on-add-name.html) | [androidJvm]<br>fun [onAddName](on-add-name.html)(newName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>sets [name](name.html) value to input name value from Add new product alert dialog |
| [onAddProduct](on-add-product.html) | [androidJvm]<br>fun [onAddProduct](on-add-product.html)()<br>Function collects data from [name](name.html),[amount](amount.html),[chosenCategoryName](chosen-category-name.html) and send this data to [UseCases.insertProduct](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/insert-product.html) to validate and send further to repository |
| [onAddToList](on-add-to-list.html) | [androidJvm]<br>fun [onAddToList](on-add-to-list.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html))<br>adds products to listOfCheckedProducts |
| [onCategoryListExpanded](on-category-list-expanded.html) | [androidJvm]<br>fun [onCategoryListExpanded](on-category-list-expanded.html)()<br>sets [isCategoryListExpanded](is-category-list-expanded.html) value to opposite of current value used to observe the state of category list if it's expanded or not |
| [onCleared](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1930136507%2FFunctions%2F-451970049) | [androidJvm]<br>open fun [onCleared](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1930136507%2FFunctions%2F-451970049)() |
| [onRemoveFromList](on-remove-from-list.html) | [androidJvm]<br>fun [onRemoveFromList](on-remove-from-list.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html))<br>removes products from listOfCheckedProducts |
| [onSelectCategory](on-select-category.html) | [androidJvm]<br>fun [onSelectCategory](on-select-category.html)(categoryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>sets [chosenCategoryName](chosen-category-name.html) to selected categories name used to display currently selected category |
| [onShowDialog](on-show-dialog.html) | [androidJvm]<br>fun [onShowDialog](on-show-dialog.html)()<br>sets [onShowDialog](on-show-dialog.html) value to opposite of current value used to observe the state of dialog if it's shown or not |
| [setCurrentCategory](set-current-category.html) | [androidJvm]<br>fun [setCurrentCategory](set-current-category.html)(category: [Category](../../com.ugisozols.shoppinglistapp.domain.models/-category/index.html))<br>function takes category that is selected in UI and passes the [Category](../../com.ugisozols.shoppinglistapp.domain.models/-category/index.html) data to [currentCategory](current-category.html) state |
| [setTagIfAbsent](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1567230750%2FFunctions%2F-451970049) | [androidJvm]<br>open fun &lt;[T](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1567230750%2FFunctions%2F-451970049) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [setTagIfAbsent](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1567230750%2FFunctions%2F-451970049)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [T](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1567230750%2FFunctions%2F-451970049)): [T](../../com.ugisozols.shoppinglistapp.presentation.welcome_screen/-welcome-screen-view-model/index.html#-1567230750%2FFunctions%2F-451970049) |
| [updateCheckedProduct](update-checked-product.html) | [androidJvm]<br>fun [updateCheckedProduct](update-checked-product.html)(product: [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html), value: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>Function requires [Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html) object and [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) values and sends these values to [UseCases.updateProduct](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/update-product.html) function |


## Properties


| Name | Summary |
|---|---|
| [amount](amount.html) | [androidJvm]<br>var [amount](amount.html): MutableState&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [chosenCategoryName](chosen-category-name.html) | [androidJvm]<br>var [chosenCategoryName](chosen-category-name.html): MutableState&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [currentCategory](current-category.html) | [androidJvm]<br>var [currentCategory](current-category.html): MutableState&lt;[Category](../../com.ugisozols.shoppinglistapp.domain.models/-category/index.html)&gt;<br>[currentCategory](current-category.html) is used in function to receive data for specific category defined in this state |
| [isCategoryListExpanded](is-category-list-expanded.html) | [androidJvm]<br>var [isCategoryListExpanded](is-category-list-expanded.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isExpanded](is-expanded.html) | [androidJvm]<br>var [isExpanded](is-expanded.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [name](name.html) | [androidJvm]<br>var [name](name.html): MutableState&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [productState](product-state.html) | [androidJvm]<br>val [productState](product-state.html): State&lt;[Resource](../../com.ugisozols.shoppinglistapp.utils/-resource/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Product](../../com.ugisozols.shoppinglistapp.domain.models/-product/index.html)&gt;&gt;&gt;<br>Immutable value of _productListState to access this in UI |
| [showDialog](show-dialog.html) | [androidJvm]<br>var [showDialog](show-dialog.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [uiEvent](ui-event.html) | [androidJvm]<br>val [uiEvent](ui-event.html): Flow&lt;[UiEvent](../../com.ugisozols.shoppinglistapp.utils/-ui-event/index.html)&gt;<br>Immutable value of _uiEvent this gets observed in UI |
| [userName](user-name.html) | [androidJvm]<br>var [userName](user-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

