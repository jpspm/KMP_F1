package com.f1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun F1Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = F1LightColorScheme,
        typography = F1Typography(),
        content = content
    )
}