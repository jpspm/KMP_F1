package com.f1.utils

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class WindowWidthSizeClass { SmallCompact, MediumCompact, LargeCompact, Medium, Expanded }
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
        width < 400.dp -> WindowWidthSizeClass.SmallCompact
        width > 400.dp && width < 480.dp -> WindowWidthSizeClass.MediumCompact
        width > 480.dp && width < 600.dp -> WindowWidthSizeClass.LargeCompact
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