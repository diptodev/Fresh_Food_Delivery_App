package com.excitedbroltd.freshfood.ui.screens.signupscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.excitedbroltd.freshfood.R
import com.excitedbroltd.freshfood.ui.theme.LightGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn() {
    Column(modifier = Modifier.fillMaxSize()) {
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
                painter = painterResource(id = R.drawable.delivery_man_5_main),
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
                    text = "Welcome Back!",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 30.sp
                )
                Text(
                    text = "Sign in to your account",
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
            ) {
                val colors = TextFieldDefaults.textFieldColors(
                    containerColor = White,
                    focusedIndicatorColor = Gray
                )
                TextField(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        focusedLabelColor = Gray
                    ),
                    enabled = true,
                    isError = false,
                    value = "",
                    label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,

                            ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_email),
                                contentDescription = "Icon google",
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
                    .clip(RoundedCornerShape(30.dp)),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Gray
                    ),
                    value = "", label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,

                            ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_lock),
                                contentDescription = "Icon google",
                                Modifier.size(20.dp)
                            )
                            Text(
                                text = "Please enter your password",
                                Modifier.padding(start = 10.dp)
                            )
                        }
                    }, onValueChange = {

                    })
                Row() {

                    Row() {
                        Checkbox(checked = false, onCheckedChange = {})
                        Text(text = "remember me")
                    }
                    Text(text = "Forgot password?")
                }
            }
        }
        Column() {
            Button(onClick = { }) {
                Text(text = "Sign in")
            }
            Row() {
                Text(text = "Want to create new account?")
                Text(text = "register now!")
            }
        }
    }
}