package com.ugisozols.shoppinglistapp.data.preferences

import android.content.SharedPreferences
import com.ugisozols.shoppinglistapp.domain.models.UserInfo
import com.ugisozols.shoppinglistapp.domain.preferences.Preferences
import javax.inject.Inject


/**
 *  Implementation of [Preferences]
 *   - [saveUserName]
 *   - [loadUserName]
 *   - [saveShouldShowWelcome]
 *   - [loadShouldShowWelcome]
 */
class PreferencesImpl @Inject constructor(
    private val sharedPref : SharedPreferences
) : Preferences{

    override fun saveUserName(name: String) {
        sharedPref.edit()
            .putString(Preferences.KEY_NAME, name)
            .apply()
    }

    override fun loadUserName(): UserInfo {
        val name = sharedPref.getString(Preferences.KEY_NAME, null) ?: ""
        return UserInfo(name)
    }

    override fun saveShouldShowWelcome(shouldShow: Boolean) {
        sharedPref.edit()
            .putBoolean(Preferences.KEY_SHOULD_SHOW_WELCOME, shouldShow)
            .apply()
    }

    override fun loadShouldShowWelcome(): Boolean {
        return sharedPref.getBoolean(
            Preferences.KEY_SHOULD_SHOW_WELCOME,
            true
        )
    }
}