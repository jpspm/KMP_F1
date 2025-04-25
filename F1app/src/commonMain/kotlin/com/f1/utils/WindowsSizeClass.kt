package com.f1.utils

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class WindowWidthSizeClass { Compact, Medium, Expanded }
enum class WindowHeightSizeClass { Compact, Medium, Expanded }

data class WindowsSizeClass(
    val widthSizeClass: WindowWidthSizeClass,
    val heightSizeClass: WindowHeightSizeClass
)

fun mapToWindowSizeClass(
    width: Dp,
    height: Dp
): WindowsSizeClass {
    val widthClass = when {
        width < 600.dp -> WindowWidthSizeClass.Compact
        width > 600.dp && width < 840.dp -> WindowWidthSizeClass.Medium
        else -> WindowWidthSizeClass.Expanded
    }
    val heightClass = when {
        height < 480.dp -> WindowHeightSizeClass.Compact
        height > 480.dp && height < 900.dp -> WindowHeightSizeClass.Medium
        else -> WindowHeightSizeClass.Expanded
    }
    return WindowsSizeClass(widthClass, heightClass)
}