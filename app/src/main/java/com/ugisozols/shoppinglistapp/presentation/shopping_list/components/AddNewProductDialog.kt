package com.ugisozols.shoppinglistapp.presentation.shopping_list.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.presentation.shopping_list.ShoppingScreenViewModel
import com.ugisozols.shoppinglistapp.presentation.ui.theme.LightPink
import com.ugisozols.shoppinglistapp.presentation.ui.theme.LocalSpacing
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ObjectColor

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AddNewProductDialog(
    viewModel: ShoppingScreenViewModel
) {
    val spacing = LocalSpacing.current

    AlertDialog(
        modifier = Modifier
            .height(650.dp)
            .width(500.dp)
            .semantics {
                contentDescription = "alertDialog"
            },
        onDismissRequest = {
            viewModel.onShowDialog()
        },
        title = {
            Column(Modifier.padding(top = spacing.spacingLarge)) {
                Spacer(modifier = Modifier.width(spacing.spacingLarge))
                Text(
                    text = stringResource(id = R.string.alert_dialog_title),
                    style = MaterialTheme.typography.h2
                )
            }

        },
        text = {
            Column(
                Modifier
                    .fillMaxSize()
            ) {
                Spacer(modifier = Modifier.height(spacing.spacingLarge))
                InputRow(
                    inputValuesNameText = stringResource(id = R.string.alert_dialog_name_text),
                    inputValue = viewModel.name.value,
                    onInputValueChange = {
                        viewModel.onAddName(it)
                    },
                    contentDescr = "productName"
                )
                Spacer(modifier = Modifier.height(spacing.spacingMedium))
                InputRow(
                    inputValuesNameText = stringResource(id = R.string.alert_dialog_amount_text),
                    inputValue = viewModel.amount.value,
                    onInputValueChange = {
                        viewModel.onAddAmount(it)
                    },
                    contentDescr = "productAmount"
                )
                Spacer(modifier = Modifier.height(spacing.spacingLarge))
                Column {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = stringResource(id = R.string.alert_dialog_category_text),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.width(spacing.spacingMedium))
                        Text(
                            text = viewModel.chosenCategoryName.value,
                            textAlign = TextAlign.Center
                        )

                        IconButton(onClick = {
                            viewModel.onCategoryListExpanded()
                        }, modifier = Modifier.semantics {
                            contentDescription = "dialogDropdown"
                        }
                        ) {
                            Icon(
                                imageVector = if (viewModel.isCategoryListExpanded) {
                                    Icons.Default.KeyboardArrowUp
                                } else {
                                    Icons.Default.KeyboardArrowDown
                                },
                                contentDescription = null,
                                tint = ObjectColor,
                                modifier = Modifier.size(50.dp)
                            )
                        }

                    }
                    Text(
                        text = stringResource(id = R.string.alert_dialog_noCategory_text),
                        fontSize = 8.sp
                    )
                }
                AnimatedVisibility(visible = viewModel.isCategoryListExpanded) {
                    LazyColumn {
                        items(Category.listOfCategories) { category ->
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        viewModel.onSelectCategory(category.name)
                                        viewModel.onCategoryListExpanded()
                                    }
                                    .semantics {
                                        contentDescription = category.name
                                    }
                                ,
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically

                            ) {
                                Spacer(modifier = Modifier.height(spacing.spacingMedium))
                                Text(text = category.name)
                            }
                        }
                    }
                }
            }
        },
        backgroundColor = LightPink,
        shape = RoundedCornerShape(40.dp),
        confirmButton = {
            Button(
                onClick = {
                    viewModel.onAddProduct()
                    viewModel.onShowDialog()
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
                    .semantics {
                        contentDescription = "alertDialog_add"
                    }
            ) {
                Text(
                    text = stringResource(id = R.string.floating_action_button),
                    style = MaterialTheme.typography.button
                )
            }
        }

    )
}

@Composable
private fun InputRow(
    inputValuesNameText: String,
    inputValue: String,
    onInputValueChange: (String) -> Unit,
    contentDescr : String
) {
    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight(),

        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = inputValuesNameText,
            textAlign = TextAlign.Center
        )
        StandardTextField(
            value = inputValue,
            onValueChange = {
                onInputValueChange(it)
            },
            modifier = Modifier.semantics {
                contentDescription = contentDescr
            }
        )
    }
}