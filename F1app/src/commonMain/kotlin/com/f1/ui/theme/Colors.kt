package com.f1.ui.theme

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val F1Red = Color(0xFFFF1801)
val F1Black = Color(0xFF000000)
val F1White = Color(0xFFFFFFFF)
val F1DarkGray = Color(0xFF1D1D1B)

val F1LightColorScheme = lightColorScheme(
    primary = F1Red,
    onPrimary = F1White,
    primaryContainer = F1Red.copy(alpha = 0.1f),
    onPrimaryContainer = F1Black,

    secondary = F1DarkGray,
    onSecondary = F1White,
    secondaryContainer = F1DarkGray.copy(alpha = 0.1f),
    onSecondaryContainer = F1Black,

    background = F1White,
    onBackground = F1Black,

    surface = F1White,
    onSurface = F1Black,

    error = Color(0xFFB00020),
    onError = F1White
)