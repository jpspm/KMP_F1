package com.f1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.f1.view.screens.DriverStandingScreen
import com.f1.view.screens.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DriverStandingScreen()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
   Home()
}