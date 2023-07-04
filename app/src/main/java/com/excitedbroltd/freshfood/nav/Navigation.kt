package com.excitedbroltd.freshfood.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.excitedbroltd.freshfood.ui.screens.signupscreen.LogIn
import com.excitedbroltd.freshfood.ui.screens.splashscreen.GetStarted
import com.excitedbroltd.freshfood.ui.screens.splashscreen.Skip

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination("get_started")
    ) {
        composable(route = Screen.GetStarted.route) {
            GetStarted(navController)
        }
        composable(route = Screen.LogIn.route) {
            LogIn(navController)
        }
        composable(route = Screen.Skip.route) {
            Skip(navController)
        }
    }


}

fun startDestination(s: String): String {
    when (s) {
        "login" -> return Screen.LogIn.route
        "get_started" -> return Screen.GetStarted.route
    }
    return ""
}
