package com.excitedbroltd.freshfood.nav

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.excitedbroltd.freshfood.ui.screens.signupscreen.LogIn
import com.excitedbroltd.freshfood.ui.screens.splashscreen.GetStarted
import com.excitedbroltd.freshfood.ui.screens.splashscreen.Skip

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination("get_started")
    ) {
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
            route = Screen.LogIn.route,
            enterTransition = {
                fadeIn(tween(1000))
            }

        ) {
            LogIn(navController)
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

fun startDestination(s: String): String {
    when (s) {
        "login" -> return Screen.LogIn.route
        "get_started" -> return Screen.GetStarted.route
    }
    return ""
}
