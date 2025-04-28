package com.f1.view.components.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.F1DarkGray

@Composable
fun ColumnWithBorder(
    modifier: Modifier = Modifier,
    strokeWidthDp: Dp = 2.dp,
    radiusDp: Dp = 12.dp,
    borderColor: Color = F1DarkGray,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(modifier.drawBehind {
        val strokeWidth = strokeWidthDp.toPx()
        val radius = radiusDp.toPx()

        drawLine(
            color = borderColor,
            start = Offset(radius, 0f),
            end = Offset(size.width - radius, 0f),
            strokeWidth = strokeWidth
        )

        drawLine(
            color = borderColor,
            start = Offset(size.width, radius),
            end = Offset(size.width, size.height),
            strokeWidth = strokeWidth
        )

        drawArc(
            color = borderColor,
            startAngle = -90f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(size.width - 2 * radius, 0f),
            size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2),
            style = androidx.compose.ui.graphics.drawscope.Stroke(width = strokeWidth)
        )
    }) {
        content()
    }
}