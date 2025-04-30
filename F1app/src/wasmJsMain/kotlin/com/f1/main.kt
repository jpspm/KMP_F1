package com.f1

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.f1.view.screens.DriverStandingScreen
import com.f1.view.screens.Home
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        DriverStandingScreen()
    }
}