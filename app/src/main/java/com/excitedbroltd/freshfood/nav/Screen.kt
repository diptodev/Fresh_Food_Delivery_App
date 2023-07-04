package com.excitedbroltd.freshfood.nav

sealed class Screen(val route: String) {
    object GetStarted : Screen("get_started")
    object Skip : Screen("skip")
    object LogIn : Screen("login")
}