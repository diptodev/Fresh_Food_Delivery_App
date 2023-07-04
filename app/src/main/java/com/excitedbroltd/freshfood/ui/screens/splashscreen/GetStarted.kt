package com.excitedbroltd.freshfood.ui.screens.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.nav.Screen
import com.excitedbroltd.freshfood.ui.theme.DeepGreen
import com.excitedbroltd.freshfood.ui.theme.LightGray

@Composable
fun GetStarted(navController: NavHostController) {
    var isVisible by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(key1 = true) {
        isVisible = true
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color.White,
                        DeepGreen.copy(alpha = 0.6f)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Fresh Food",
                    style = MaterialTheme.typography.titleLarge,
                    color = DeepGreen
                )
                Text(
                    text = "Grocery Shop",
                    style = MaterialTheme.typography.titleMedium,
                    color = LightGray
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.splash_screen_fruits),
                    contentDescription = "Fresh Fruit",
                )

                Box(
                    Modifier
                        .padding(top = 50.dp, start = 30.dp, end = 30.dp, bottom = 40.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .clickable {
                            isVisible = false
                            navController.navigate(Screen.Skip.route) {
                                    popUpTo(Screen.GetStarted.route) {
                                        inclusive = true
                                    }
                            }
                        }
                        .background(DeepGreen)
                        .fillMaxWidth()
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Get Started",
                        style = MaterialTheme.typography.titleSmall,
                        color = Color.White.copy(alpha = 0.7f)
                    )
                }
            }
        }


    }
}