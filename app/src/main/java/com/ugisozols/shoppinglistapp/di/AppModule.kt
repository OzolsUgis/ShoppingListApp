package com.ugisozols.shoppinglistapp.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.ugisozols.shoppinglistapp.data.preferences.PreferencesImpl
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import com.ugisozols.shoppinglistapp.utils.Constants.SHARED_PREF_NAME
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

}