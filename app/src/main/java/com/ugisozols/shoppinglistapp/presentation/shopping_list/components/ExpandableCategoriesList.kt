package com.ugisozols.shoppinglistapp.presentation.shopping_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ugisozols.shoppinglistapp.domain.models.Category
import com.ugisozols.shoppinglistapp.presentation.ui.theme.LightPink
import com.ugisozols.shoppinglistapp.presentation.ui.theme.LocalSpacing
import com.ugisozols.shoppinglistapp.presentation.ui.theme.ObjectColor
import androidx.compose.foundation.layout.Spacer as Spacer


@Composable
fun ExpandableCategoriesList(
    onCloseList : () -> Unit,
    onCategoryClick : (Category) -> Unit,
    modifier : Modifier = Modifier
){
    val spacing = LocalSpacing.current
    Box(
        modifier = modifier
            .offset(x = (-1).dp)
            .background(
                color = LightPink,
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    bottomStart = 0.dp,
                    topEnd = 70.dp,
                    bottomEnd = 70.dp
                )
            )
            .border(1.dp, ObjectColor, RoundedCornerShape(  topStart = 0.dp,
                bottomStart = 0.dp,
                topEnd = 70.dp,
                bottomEnd = 70.dp))
    ){
        Column(
            Modifier
                .fillMaxWidth()
                .padding(spacing.spacingLarge)) {
            Spacer(modifier = Modifier.height(height = spacing.spacingMedium))
            IconButton(
                onClick = {
                    onCloseList()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = null,
                    modifier = Modifier.size(35.dp),
                    tint = ObjectColor
                )
            }
            Spacer(modifier = Modifier.height(spacing.spacingMedium))

            LazyColumn{
                items(Category.listOfCategories){ category ->
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .clickable {
                            onCategoryClick(category)
                        },
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = category.name[0].uppercase() + category.name.substring(1),
                            fontWeight = FontWeight.Light

                        )
                        Spacer(modifier = Modifier.height(spacing.spacingMedium))
                    }
                }
            }
        }

    }
}