package com.ugisozols.shoppinglistapp.data.local.preferences

import android.content.Context
import android.content.Context.MODE_PRIVATE
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.ugisozols.shoppinglistapp.domain.models.UserInfo


import org.junit.Before
import org.junit.Test


class PreferencesImplTest {

    private lateinit var prefs : PreferencesImpl
    private lateinit var context : Context

    @Before
    fun setUp() {
        context = ApplicationProvider.getApplicationContext()

        val sharedPref = context.getSharedPreferences(
            "prefs",
            MODE_PRIVATE
        )
        prefs = PreferencesImpl(sharedPref)

    }

    @Test
    fun savingNameToPreferences_loadingSavedValue(){
        val testName = "Test"

        prefs.saveUserName(testName)

        val testNameResult = prefs.loadUserName()

        assertThat(testNameResult == UserInfo(testName)).isTrue()
    }


    @Test
    fun savingBooleanValueToPrefs_loadingSavedBooleanValue(){
        val boolean = true

        prefs.saveShouldShowWelcome(boolean)

        val result = prefs.loadShouldShowWelcome()

        assertThat(result == boolean).isTrue()
    }


}