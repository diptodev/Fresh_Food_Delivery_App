package com.excitedbroltd.freshfood.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination("login"),
        route = ROOT
    ) {
        SplashScreenGraph(navController)
        AuthGraph(navController)
        MainGraph(navController)
    }

}


fun startDestination(s: String): String {
    when (s) {
        "login" -> return AUTH_GRAPH
        "get_started" -> return SPLASH_GRAPH
    }
    return ""
}
