package com.ugisozols.shoppinglistapp.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.ugisozols.shoppinglistapp.data.local.preferences.PreferencesImpl
import com.ugisozols.shoppinglistapp.data.repository.ShoppingListRepositoryImpl
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import com.ugisozols.shoppinglistapp.domain.repository.ShoppingListRepository
import com.ugisozols.shoppinglistapp.domain.use_cases.DeleteProducts
import com.ugisozols.shoppinglistapp.domain.use_cases.GetProducts
import com.ugisozols.shoppinglistapp.domain.use_cases.InsertProduct
import com.ugisozols.shoppinglistapp.domain.use_cases.UseCases
import com.ugisozols.shoppinglistapp.utils.Constants.DATE
import com.ugisozols.shoppinglistapp.utils.Constants.SHARED_PREF_NAME
import com.ugisozols.shoppinglistapp.utils.Constants.SHOPPING_LIST_APP
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(
        app : Application
    ) : SharedPreferences {
        return app.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun providePreferences(sharedPreferences: SharedPreferences) : Preferences {
        return PreferencesImpl(sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideShoppingListRepository(
        shoppingListRef : CollectionReference,
        query: Query
    ): ShoppingListRepository {
        return ShoppingListRepositoryImpl(shoppingListRef,query)
    }

    @Provides
    @Singleton
    fun provideFirebase() = FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    fun provideProductRef(db : FirebaseFirestore) = db.collection(SHOPPING_LIST_APP)

    @Provides
    @Singleton
    fun provideQuery(productRef : CollectionReference) = productRef.orderBy(DATE)


    @Provides
    @Singleton
    fun provideUseCases(repository: ShoppingListRepository) = UseCases(
        insertProduct = InsertProduct(repository),
        getProducts = GetProducts(repository),
        deleteProducts = DeleteProducts(repository)
    )
}