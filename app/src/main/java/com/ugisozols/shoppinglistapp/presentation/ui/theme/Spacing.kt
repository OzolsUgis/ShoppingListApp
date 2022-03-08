package com.ugisozols.shoppinglistapp.presentation.ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 *  Data class of different values of spacing
 */
data class Spacing(
    val spacingSmall : Dp = 8.dp,
    val spacingMedium : Dp = 16.dp,
    val spacingLarge : Dp = 32.dp,
    val spacingExtraLarge : Dp = 63.dp
)

/**
 * Provides [Spacing] that can be use to assign different
 * values of spacing
 */
val LocalSpacing = compositionLocalOf { Spacing() }

