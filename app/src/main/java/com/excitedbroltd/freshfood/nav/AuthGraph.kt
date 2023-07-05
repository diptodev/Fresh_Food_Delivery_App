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
import com.excitedbroltd.freshfood.ui.screens.signupscreen.LogIn
import com.excitedbroltd.freshfood.ui.screens.signupscreen.SignUpScreen
import com.excitedbroltd.freshfood.ui.screens.signupscreen.Welcome

fun NavGraphBuilder.AuthGraph(navController: NavHostController) {
    navigation(startDestination = Screen.WelcomePage.route, route = AUTH_GRAPH) {
        composable(
            route = Screen.WelcomePage.route,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { 600 }, animationSpec = tween(durationMillis = 300)
                ) + fadeIn(tween(300))
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -600 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeOut(tween(300))
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { 600 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeOut(tween(300))
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { -600 }, animationSpec = tween(durationMillis = 300)
                ) + fadeIn(tween(300))
            }
        ) {
            Welcome(navController)
        }
        composable(
            route = Screen.LogIn.route,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { 600 }, animationSpec = tween(durationMillis = 300)
                ) + fadeIn(tween(300))
            },
            exitTransition = {
                fadeOut(tween(300))
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { 600 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeOut(tween(300))
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { -600 }, animationSpec = tween(durationMillis = 300)
                ) + fadeIn(tween(300))
            }
        ) {
            LogIn(navController)
        }

        composable(
            route = Screen.SignUp.route,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { 600 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeIn(tween(300))
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { 600 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeOut(tween(300))
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { 600 },
                    animationSpec = tween(300, easing = FastOutSlowInEasing)
                ) + fadeOut(tween(300))
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { -600 }, animationSpec = tween(durationMillis = 300)
                ) + fadeIn(tween(300))
            }

        ) {
            SignUpScreen(navController)
        }
    }
}
