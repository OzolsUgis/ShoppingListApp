package com.ugisozols.shoppinglistapp.presentation.shopping_list

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.*

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ObjectColor


@Composable
fun FloatingActionButton(
    onShowDialog : () -> Unit
){
    ExtendedFloatingActionButton(
        icon = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                tint = ObjectColor
            )
        },
        text = {
            Text(
                text = stringResource(id = R.string.floating_action_button),
                style = MaterialTheme.typography.button
            )
        },
        onClick = {
            onShowDialog()
        },
        backgroundColor = Color.Transparent,
        elevation = FloatingActionButtonDefaults.elevation(
            0.dp,
            1.dp
        ),
        modifier = Modifier
            .border(
                1.dp ,
                ObjectColor,
                shape = RoundedCornerShape(80.dp)
            )
    )
}