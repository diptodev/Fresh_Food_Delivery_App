package com.excitedbroltd.freshfood.ui.screens.signupscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.nav.Screen
import com.excitedbroltd.freshfood.ui.theme.DeepGreen
import com.excitedbroltd.freshfood.ui.theme.LightGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Welcome(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White), contentAlignment = Alignment.Center

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(400.dp)
                    .background(
                        brush = Brush.linearGradient(
                            listOf(LightGray, Color.White)
                        )
                    ),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    painter = painterResource(id = R.drawable.delivery_man_6_main),
                    contentDescription = "delivery man 6",
                    contentScale = ContentScale.Crop
                )
            }
            Column {
                Text(text = "Welcome", style = MaterialTheme.typography.titleLarge)
                Text(
                    text = "Fresh Food online grocery store is the no 1 ",
                    style = MaterialTheme.typography.bodySmall,
                    color = LightGray
                )
                Text(
                    text = "grocery application in the world",
                    style = MaterialTheme.typography.bodySmall,
                    color = LightGray
                )
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp, start = 20.dp, bottom = 20.dp),

                    elevation = CardDefaults.cardElevation(5.dp),
                    shape = RoundedCornerShape(40.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(top = 15.dp, bottom = 15.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_google),
                            contentDescription = "Connect using google",
                            tint = Color.Red,
                            modifier = Modifier
                                .size(20.dp)
                                .padding(end = 5.dp)
                        )
                        Text(text = "Connect using google", color = Color.Black)
                    }
                }
                Card(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp, start = 20.dp),
                    elevation = CardDefaults.elevatedCardElevation(5.dp),
                    shape = RoundedCornerShape(40.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(DeepGreen)
                            .padding(top = 15.dp, bottom = 15.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_lock),
                            contentDescription = "Connect using google",
                            tint = Color.Red,
                            modifier = Modifier
                                .size(20.dp)
                                .padding(end = 5.dp)
                        )
                        Text(text = "Create an account", color = Color.White)
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(bottom = 10.dp, top = 5.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "Already have an account? ", color = LightGray)
                    Text(
                        text = "Login",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Black.copy(0.6f),
                        modifier = Modifier.clickable {
                            navController.navigate(Screen.LogIn.route) {

                            }
                        }
                    )
                }
            }

        }
    }
}