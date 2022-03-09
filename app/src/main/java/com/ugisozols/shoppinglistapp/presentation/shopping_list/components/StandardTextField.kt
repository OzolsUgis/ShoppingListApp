package com.ugisozols.shoppinglistapp.presentation.shopping_list.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ObjectColor
import com.ugisozols.shoppinglistapp.presentation.ui.theme.TextColor

@Composable
fun StandardTextField(
    value : String,
    onValueChange : (String) -> Unit,
    modifier: Modifier
){
    TextField(
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            textColor = TextColor,
            backgroundColor = Color.Transparent,
            cursorColor = ObjectColor,
            focusedIndicatorColor = ObjectColor,
            focusedLabelColor = ObjectColor
        ),
        textStyle = MaterialTheme.typography.body2,
        modifier = modifier
    )

}