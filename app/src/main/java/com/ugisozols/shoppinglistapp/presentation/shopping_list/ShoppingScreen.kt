package com.ugisozols.shoppinglistapp.presentation.shopping_list


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ugisozols.shoppinglistapp.R
import com.ugisozols.shoppinglistapp.presentation.shopping_list.components.AddNewProductDialog
import com.ugisozols.shoppinglistapp.presentation.shopping_list.components.ExpandableCategoriesList
import com.ugisozols.shoppinglistapp.presentation.ui.theme.*
import com.ugisozols.shoppinglistapp.utils.Resource
import com.ugisozols.shoppinglistapp.utils.UiEvent
import kotlinx.coroutines.flow.collect

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun ShoppingScreen(
    scaffoldState: ScaffoldState,
    viewModel: ShoppingScreenViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val categoryName = viewModel.currentCategory.value.name

    val context = LocalContext.current

    LaunchedEffect(key1 = true) {
        viewModel.uiEvent.collect { event ->
            when (event) {
                is UiEvent.ShowSnackbar -> {
                    scaffoldState.snackbarHostState.showSnackbar(event.message.asString(context))
                }
                else -> Unit
            }

        }
    }

    Scaffold(
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton {
                viewModel.onShowDialog()
            }
        }
    ) {
        if (viewModel.showDialog) {
            AddNewProductDialog(
                viewModel = viewModel
            )
        }

        Box(
            Modifier
                .fillMaxSize()
                .background(
                    color = LightPurple
                )
        ) {
            Box {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(spacing.spacingMedium)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(start = spacing.spacingMedium)
                            .semantics {
                                contentDescription = "greeting"
                            },
                        text = stringResource(id = R.string.greeting) + viewModel.userName
                    )
                    Spacer(modifier = Modifier.height(spacing.spacingMedium))
                    Text(
                        modifier = Modifier.padding(start = spacing.spacingMedium),
                        text = categoryName[0].uppercase() + categoryName.substring(1),
                        style = MaterialTheme.typography.h2,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(spacing.spacingMedium))
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = { viewModel.isExpanded = !viewModel.isExpanded },
                            modifier = Modifier.semantics {
                                contentDescription = "expandButton"
                            }
                        ) {
                            Icon(
                                imageVector = if (viewModel.isExpanded) {
                                    Icons.Default.KeyboardArrowLeft
                                } else {
                                    Icons.Default.KeyboardArrowRight
                                },
                                contentDescription = null,
                                modifier = Modifier.size(50.dp),
                                tint = ObjectColor
                            )
                        }
                        IconButton(
                            onClick = {
                                viewModel.deleteProductsFromList()
                            },
                            modifier = Modifier.semantics {
                                contentDescription = "deleteButton"
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = null,
                                modifier = Modifier.size(35.dp),
                                tint = ObjectColor
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(spacing.spacingLarge))

                    when (val response = viewModel.productState.value) {
                        is Resource.Loading -> {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                CircularProgressIndicator(
                                    color = ObjectColor,
                                    strokeWidth = 5.dp,
                                    modifier = Modifier
                                        .align(alignment = Alignment.Center)
                                )
                            }

                        }
                        is Resource.Success -> {
                            LazyColumn {
                                items(response.data!!) { products ->
                                    var isChecked by remember {
                                        mutableStateOf(false)
                                    }
                                    Row(Modifier
                                        .toggleable(
                                            value = products.checked,
                                            role = Role.Checkbox,
                                            onValueChange = {
                                                isChecked = !isChecked
                                                if (it) {
                                                    viewModel.updateCheckedProduct(
                                                        products,
                                                        it
                                                    )
                                                    viewModel.onAddToList(products)
                                                } else {
                                                    viewModel.updateCheckedProduct(
                                                        products,
                                                        it
                                                    )
                                                    viewModel.onRemoveFromList(products)
                                                }
                                            }
                                        )
                                        .fillMaxWidth()
                                        .wrapContentHeight()
                                        .padding(horizontal = spacing.spacingMedium)
                                        .semantics {
                                            contentDescription = "listRow"
                                        },
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = products.name,
                                            fontWeight = FontWeight.SemiBold,
                                            color = TextColor
                                        )
                                        Text(
                                            text = products.amount,
                                            fontWeight = FontWeight.Light
                                        )

                                        Checkbox(
                                            checked = products.checked,
                                            onCheckedChange = null,
                                            colors = CheckboxDefaults.colors(
                                                checkedColor = ColorDone
                                            )
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(spacing.spacingMedium))
                                }
                            }
                        }
                        else -> Unit
                    }
                }
            }
            Row(Modifier.fillMaxWidth()) {

                AnimatedVisibility(viewModel.isExpanded) {
                    ExpandableCategoriesList(
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .fillMaxHeight()
                            .semantics {
                                contentDescription = "expandedCatList"
                            },
                        onCloseList = { viewModel.isExpanded = !viewModel.isExpanded },
                        onCategoryClick = {
                            viewModel.setCurrentCategory(it)
                            viewModel.getProductList()
                            viewModel.isExpanded = false
                        }
                    )
                }
            }

        }
    }

}