package com.ugisozols.shoppinglistapp.presentation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ugisozols.shoppinglistapp.R

/**
 * Font family - roboto.
 * Contains different kind of font weights
 */
val roboto = FontFamily(
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_black, FontWeight.Black),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_thin, FontWeight.Thin)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.SemiBold,
        fontSize = 42.sp,
        color = TextColor
    ),
    button = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Light,
        fontSize = 22.sp,
        color = TextColor
    ),
    caption = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp
    ),
    body1 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        color = TextColor
    ),
    body2 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Light,
        fontSize = 22.sp,
        color = TextColor
    ),
    h2 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        color = TextColor
    )
)