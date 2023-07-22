package com.excitedbroltd.freshfood.ui.screens.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.ui.theme.LightGray

@Composable
fun Home(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LightGray),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(15.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.splash_screen_fruits),
                    contentDescription = "any offer included"
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Categories")
                    Text(text = "->", modifier = Modifier.clickable { })
                }
            }
        }
    }
}