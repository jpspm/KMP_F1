package com.f1.view.components.common

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AdaptiveText(
    text: String,
    modifier: Modifier = Modifier,
    maxFontSize: TextUnit = 20.sp,
    minFontSize: TextUnit = 10.sp,
    style: TextStyle = TextStyle.Default
) {
    BoxWithConstraints(modifier) {
        val width = maxWidth
        val calculatedFontSize = when {
            width < 100.dp -> minFontSize
            width > 180.dp -> (maxFontSize.value * 0.75).sp
            else -> maxFontSize
        }
        Text(
            text = text,
            style = style.copy(fontSize = calculatedFontSize),
            maxLines = 1,
            softWrap = false
        )
    }
}