package com.f1.view.components.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun IndicativeColor(modifier: Modifier = Modifier, width: Dp, height: Dp, color: Long){
    Box(
        modifier = modifier
            .size(width = width, height = height)
            .background(Color(color))
    )
}