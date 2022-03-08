package com.ugisozols.shoppinglistapp.utils


/**
 * [Resource] class is used to wrap data in to state
 * it improves dealing with data state while making for example api call
 *
 * [Resource] have three states:
 * - [Loading]
 * - [Success]
 * - [Error]
 *
 * @param data incoming data with nullable type [T]
 *
 * @param uiText message of type [UiText] usually returns error messages
 *
 */
sealed class Resource<T>(val data: T? = null, val uiText: UiText? = null) {

    /**
     * [Loading] state is member of [Resource] states
     * with provided data param you can assign values
     * usually it provides cached data while api call makes data update
     *
     * @param data Nullable type of [T] takes any kind of data while response is loading
     */
    class Loading<T>(data : T? = null) : Resource<T>(data)

    /**
     * [Success] state is member of [Resource] states
     * this state returns successful api call data
     *
     * @param data Nullable type of [T] takes any kind of data when api call is in success state
     */
    class Success<T>(data: T?): Resource<T>(data)

    /**
     *[Error] state is member of [Resource] states
     * this state returns error when response is interrupted or response is not valid
     * state can still show cached data
     *
     * @param uiText adding message to error state it can be message from server or hardcoded string
     * which is later observed and shown in UI
     * @param data to add any cached data to response
     */
    class Error<T>(uiText : UiText, data: T? = null): Resource<T>(data, uiText)
}
