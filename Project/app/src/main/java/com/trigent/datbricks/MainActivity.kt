package com.trigent.datbricks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.trigent.datbricks.ui.theme.DatBricksTheme
import com.trigent.datbricks.ui.navigation.AppMainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DatBricksTheme {
                AppMainScreen()
            }
        }
    }
}