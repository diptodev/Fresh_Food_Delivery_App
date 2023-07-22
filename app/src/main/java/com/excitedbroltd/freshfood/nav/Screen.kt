package com.excitedbroltd.freshfood.nav

const val AUTH_GRAPH = "auth_graph"
const val SPLASH_GRAPH = "splash_graph"
const val ROOT = "root"
const val MAIN_GRAPH = "main_graph"


sealed class Screen(val route: String) {
    object GetStarted : Screen("get_started")
    object Skip : Screen("skip")
    object LogIn : Screen("login")
    object SignUp : Screen("signup")
    object WelcomePage : Screen("welcome_page")
    object Home : Screen("home")
    object Enter_phone : Screen("enter_phone")
    object Enter_code : Screen("enter_code")
    object Forgot_password : Screen("forgot_pass")

}