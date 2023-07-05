package com.excitedbroltd.freshfood.ui.screens.signupscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun SignUpScreen(navController: NavHostController) {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.Red), contentAlignment = Alignment.Center) {
        Text(text = "This is sign up screen")
    }
}