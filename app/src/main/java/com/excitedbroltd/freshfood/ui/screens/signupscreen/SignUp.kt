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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.nav.Screen
import com.excitedbroltd.freshfood.ui.theme.DeepGreen
import com.excitedbroltd.freshfood.ui.theme.LightGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(350.dp)
                .background(
                    brush = Brush.linearGradient(
                        listOf(LightGray, White)
                    )
                ),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.delivery_man_4_main),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column {
                Text(
                    text = "Create Account",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 30.sp
                )
                Text(
                    text = "Quickly create an account",
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
            ) {

                TextField(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .shadow(
                            elevation = 2.dp,
                            ambientColor = Black.copy(alpha = 0.5f),
                            spotColor = Black.copy(alpha = 0.5f),
                            clip = true,
                            shape = RoundedCornerShape(30.dp)
                        ),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Transparent,
                        unfocusedIndicatorColor = Transparent,
                        disabledIndicatorColor = Transparent,
                        focusedLabelColor = Gray,
                        focusedContainerColor = White,
                        unfocusedContainerColor = White,
                        disabledContainerColor = White
                    ),
                    enabled = true,
                    isError = false,
                    value = "",
                    maxLines = 1,
                    label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,

                            ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_email),
                                contentDescription = "Icon email",
                                Modifier.size(20.dp)
                            )
                            Text(
                                text = "Please enter your email",
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                    },
                    onValueChange = {

                    })

                TextField(modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp)
                    .shadow(
                        elevation = 2.dp,
                        ambientColor = Black.copy(alpha = 0.5f),
                        spotColor = Black.copy(alpha = 0.5f),
                        clip = true,
                        shape = RoundedCornerShape(30.dp)
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = White,
                        unfocusedContainerColor = White,
                        disabledContainerColor = Transparent,
                        focusedIndicatorColor = Transparent,
                        unfocusedIndicatorColor = Transparent,
                        focusedLabelColor = Gray,
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    maxLines = 1,
                    value = "", label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,

                            ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_phone),
                                contentDescription = "Icon phone",
                                Modifier.size(20.dp)
                            )
                            Text(
                                text = "Phone",
                                Modifier.padding(start = 10.dp),
                            )
                        }
                    }, onValueChange = {

                    })
                TextField(modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp)
                    .shadow(
                        elevation = 2.dp,
                        ambientColor = Black.copy(alpha = 0.5f),
                        spotColor = Black.copy(alpha = 0.5f),
                        clip = true,
                        shape = RoundedCornerShape(30.dp)
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = White,
                        unfocusedContainerColor = White,
                        disabledContainerColor = Transparent,
                        focusedIndicatorColor = Transparent,
                        unfocusedIndicatorColor = Transparent,
                        focusedLabelColor = Gray,
                    ), maxLines = 1,
                    value = "", label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,

                            ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_lock),
                                contentDescription = "Icon lock",
                                Modifier.size(20.dp)
                            )
                            Text(
                                text = "Please enter your password",
                                Modifier.padding(start = 10.dp)
                            )
                        }
                    }, onValueChange = {

                    })

            }
        }
        Column() {

            Box(
                Modifier
                    .padding(start = 45.dp, end = 30.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .clickable {
                        navController.navigate(Screen.Home.route)
                    }
                    .background(DeepGreen)
                    .fillMaxWidth()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.titleSmall,
                    color = White
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {
                Text(
                    text = "Already have an account?",
                    style = MaterialTheme.typography.bodySmall,
                    color = Gray,
                    fontSize = 12.sp,
                )
                Text(
                    text = "Login", style = MaterialTheme.typography.bodySmall,
                    fontSize = 14.sp,
                    color = Blue,
                    modifier = Modifier.clickable {
                        navController.navigate(Screen.LogIn.route) {

                        }
                    }
                )
            }
        }
    }
}