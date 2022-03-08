package com.ugisozols.shoppinglistapp.utils

import android.content.Context
import androidx.annotation.StringRes


/**
 *[UiText] contains instances of different kid on string inputs
 * allows you to use string resources without context
 *
 * -[DynamicString]
 * -[StringResource]
 * -[asString]
 */
sealed class UiText {

    /**
     * Dynamic string simply takes text input
     * @param text of Type [String] can be valued or hard coded
     * @return [UiText] instance
     */
    data class DynamicString(val text: String): UiText()

    /**
     * String resource takes resourceId as a parameter and
     * return UiText instance with that string specified by string resource
     *
     * @param resId of Type [Int] is string resource Id
     * @return [UiText] instance
     */
    data class StringResource(val resId: Int): UiText()

    /**
     * Function is used to return string for UI from [UiText] instance
     * @return [String] of [UiText] instance
     */
    fun asString(context: Context): String {
        return when(this) {
            is DynamicString -> text
            is StringResource -> context.getString(resId)
        }
    }
}
