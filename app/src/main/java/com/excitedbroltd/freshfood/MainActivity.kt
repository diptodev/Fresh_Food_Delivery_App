package com.excitedbroltd.freshfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.excitedbroltd.freshfood.ui.screens.SplashScreen.GetStarted
import com.excitedbroltd.freshfood.ui.theme.FreshFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FreshFoodTheme {
                GetStarted()
            }
        }
    }
}
