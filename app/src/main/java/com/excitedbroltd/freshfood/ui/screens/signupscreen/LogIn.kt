package com.excitedbroltd.freshfood.ui.screens.signupscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.excitedbroltd.freshfood.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn() {
    Column {
        Box() {
            Image(
                painter = painterResource(id = R.drawable.delivery_man_5_main),
                contentDescription = ""
            )
        }
        Column() {
            Column {
                Text(text = "Welcome Back!")
                Text(text = "Sign in to your account")
            }
            Column() {
                TextField(value = "", label = {
                    Text(text = "Please enter your email")
                }, onValueChange = {

                })
                TextField(value = "", label = {
                    Text(text = "Please enter your password")
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