package com.f1.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf

data class BaseSize(
    val imageSize: Int,
    val baseTextLength: Int
)

val LocalBaseSize = staticCompositionLocalOf {
    BaseSize(
        imageSize = 150,
        baseTextLength = 20
    )
}