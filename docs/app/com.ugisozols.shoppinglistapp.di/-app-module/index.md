---
title: AppModule
---
//[app](../../../index.html)/[com.ugisozols.shoppinglistapp.di](../index.html)/[AppModule](index.html)



# AppModule



[androidJvm]\
@Module



object [AppModule](index.html)



## Functions


| Name | Summary |
|---|---|
| [provideFirebase](provide-firebase.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [provideFirebase](provide-firebase.html)(): FirebaseFirestore |
| [providePreferences](provide-preferences.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [providePreferences](provide-preferences.html)(sharedPreferences: [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html)): [Preferences](../../com.ugisozols.shoppinglistapp.domain.preferences/-preferences/index.html) |
| [provideProductRef](provide-product-ref.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [provideProductRef](provide-product-ref.html)(db: FirebaseFirestore): CollectionReference |
| [provideQuery](provide-query.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [provideQuery](provide-query.html)(productRef: CollectionReference): Query |
| [provideSharedPreferences](provide-shared-preferences.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [provideSharedPreferences](provide-shared-preferences.html)(app: [Application](https://developer.android.com/reference/kotlin/android/app/Application.html)): [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html) |
| [provideShoppingListRepository](provide-shopping-list-repository.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [provideShoppingListRepository](provide-shopping-list-repository.html)(shoppingListRef: CollectionReference, query: Query): [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html) |
| [provideUseCases](provide-use-cases.html) | [androidJvm]<br>@Provides<br>@Singleton<br>fun [provideUseCases](provide-use-cases.html)(repository: [ShoppingListRepository](../../com.ugisozols.shoppinglistapp.domain.repository/-shopping-list-repository/index.html)): [UseCases](../../com.ugisozols.shoppinglistapp.domain.use_cases/-use-cases/index.html) |

