package com.excitedbroltd.freshfood.ui.screens.main_screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.dataclass.Categories
import com.excitedbroltd.freshfood.ui.theme.LightGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavHostController) {
    var query: String by rememberSaveable { mutableStateOf("") }
    val array = listOf(
        Categories("Fresh Fruits", "FreshId fruits", Color.Red),
        Categories("Fresh Diary", "FreshId fruits", Color.Yellow),
        Categories("Fresh Vegetable", "FreshId fruits", Color.Green)
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LightGray)
            .padding(top = 20.dp),

        ) {
        Column() {
            // val containerColor = FilledTextFieldTokens.ContainerColor.toColor()
            TextField(
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(start = 10.dp, end = 10.dp),
                shape = CircleShape,
                value = query,
                onValueChange = {
                    query = it
                },
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,

                    unfocusedIndicatorColor = Color.Transparent
                ),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(
                    onSearch = {
                        Log.d("ONSearch", "Home: search options clicked")
                    }
                ),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_search),
                        contentDescription = "search_icon"
                    )
                },
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = "icon for filter"
                    )
                },
                placeholder = {
                    Text(text = "Search only items...")
                },
                maxLines = 1,
                singleLine = true,

                )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(15.dp),
                // elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.splash_screen_fruits),
                    contentDescription = "any offer included"
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Categories", fontStyle = FontStyle.Normal)
                    Text(text = "->", modifier = Modifier
                        .size(20.dp)
                        .clickable { })
                }

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                ) {
                    items(array) {
                        Card(
                            modifier = Modifier
                                .height(200.dp)
                                .width(135.dp)
                                .padding(5.dp),
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = it.foodCategoriesColor.copy(0.1f)),
                            ) {
                                Text(text = it.foodCategories, textAlign = TextAlign.Center, fontSize = 25.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}