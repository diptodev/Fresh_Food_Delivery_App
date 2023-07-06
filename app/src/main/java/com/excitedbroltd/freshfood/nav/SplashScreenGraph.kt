package com.excitedbroltd.freshfood.nav

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.excitedbroltd.freshfood.ui.screens.splash_screen.GetStarted
import com.excitedbroltd.freshfood.ui.screens.splash_screen.Skip

fun NavGraphBuilder.SplashScreenGraph(navController: NavHostController) {
    navigation(startDestination = Screen.GetStarted.route, route = SPLASH_GRAPH) {
        composable(
            route = Screen.GetStarted.route,
            enterTransition = {
                fadeIn(tween(300))
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -300 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeOut(tween(300))
            }
        ) {
            GetStarted(navController)
        }
        composable(
            route = Screen.Skip.route,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { 300 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeIn(tween(300))
            },
            exitTransition = {
                fadeOut(tween(300))
            }
        ) {
            Skip(navController)
        }
    }
}