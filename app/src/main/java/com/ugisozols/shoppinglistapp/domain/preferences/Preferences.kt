package com.ugisozols.shoppinglistapp.domain.preferences

import com.ugisozols.shoppinglistapp.domain.models.UserInfo

/**
 * [Preferences] interface contains functions
 * for setting and getting data
 */
interface Preferences {

    /**
     * This is member of [Preferences] class
     * function saves name value to Shared Preferences
     *
     * @param name of Type [String] ads this parameter to Shared Preferences
     */
    fun saveUserName(name : String)

    /**
     * This is member of [Preferences] class
     * @return [UserInfo] from Shared Preferences
     */
    fun loadUserName(): UserInfo

    /**
     * This is member of [Preferences] class
     * function saves boolean value to Shared Preferences
     *
     * @param shouldShow of Type [Boolean] ads this parameter to Shared Preferences
     */
    fun saveShouldShowWelcome(shouldShow : Boolean)

    /**
     * This is member of [Preferences] class
     *
     * Function is used to know if app must show welcome screen
     * at the beginning
     * @return [Boolean] from Shared Preferences
     */
    fun loadShouldShowWelcome() : Boolean

    companion object{
        const val KEY_NAME = "name"
        const val KEY_SHOULD_SHOW_WELCOME = "should_show_welcome"
     }
}