package com.excitedbroltd.freshfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.excitedbroltd.freshfood.nav.Navigation
import com.excitedbroltd.freshfood.ui.theme.FreshFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FreshFoodTheme {
                // call navigation function from here
                Navigation()
            }
        }
    }
}
