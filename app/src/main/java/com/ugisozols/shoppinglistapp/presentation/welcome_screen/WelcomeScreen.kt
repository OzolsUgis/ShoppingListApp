package com.ugisozols.shoppinglistapp.presentation.welcome_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.presentation.ui.theme.LightPurple
import com.ugisozols.shoppinglistapp.presentation.ui.theme.LocalSpacing
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ObjectColor
import com.ugisozols.shoppinglistapp.presentation.ui.theme.TextColor
import com.ugisozols.shoppinglistapp.utils.UiEvent
import kotlinx.coroutines.flow.collect


@Composable
fun WelcomeScreen(
    scaffoldState: ScaffoldState,
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: WelcomeScreenViewModel = hiltViewModel()
) {

    val spacing = LocalSpacing.current
    val context = LocalContext.current

    LaunchedEffect(key1 = true) {
        viewModel.uiEvent.collect { event ->
            when (event) {
                is UiEvent.ShowSnackbar -> {
                    scaffoldState.snackbarHostState.showSnackbar(event.message.asString(context))
                }
                is UiEvent.Navigate -> {
                    onNavigate(event)
                }
            }

        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = LightPurple
            )
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = spacing.spacingLarge),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.h1
            )
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .rotate(-25f),
                tint = ObjectColor
            )

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(spacing.spacingMedium),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = null,
                    tint = ObjectColor,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(spacing.spacingMedium))
                TextField(
                    modifier = Modifier.semantics {
                        contentDescription = "input_username"
                    },
                    value = viewModel.name.value,
                    onValueChange = {
                        viewModel.onAddName(it)
                    },
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = stringResource(R.string.enter_name),
                            style = MaterialTheme.typography.body2
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = TextColor,
                        backgroundColor = Color.Transparent,
                        cursorColor = ObjectColor,
                        focusedIndicatorColor = ObjectColor,
                        focusedLabelColor = ObjectColor
                    ),
                    textStyle = MaterialTheme.typography.body2
                )
            }

            Button(
                onClick = {
                    viewModel.onNextClick()
                },
                border = BorderStroke(1.dp, ObjectColor),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                    contentColor = ObjectColor
                ),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                ),
                shape = RoundedCornerShape(100.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(spacing.spacingMedium)
            ) {
                Text(
                    text = stringResource(R.string.welcome_button_text),
                    style = MaterialTheme.typography.button
                )
            }
        }
    }
}
