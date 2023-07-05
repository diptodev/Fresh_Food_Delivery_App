package com.excitedbroltd.freshfood.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.excitedbroltd.freshfood.ui.screens.mainscreen.Home

fun NavGraphBuilder.MainGraph(navController: NavHostController) {
    navigation(startDestination = Screen.Home.route, route = MAIN) {
        composable(route = Screen.Home.route) {
            Home(navController)
        }
    }
}