package com.f1.view.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.F1DarkGray

@Composable
fun ColumnWithBorder(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    strokeWidthDp: Dp = 2.dp,
    radiusDp: Dp = 12.dp,
    borderColor: Color = F1DarkGray,
    drawTop: Boolean = false,
    drawBottom: Boolean = false,
    drawLeft: Boolean = false,
    drawRight: Boolean = false,
    roundTopStart: Boolean = false,
    roundTopEnd: Boolean = false,
    roundBottomStart: Boolean = false,
    roundBottomEnd: Boolean = false,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        verticalArrangement = verticalArrangement, horizontalAlignment = horizontalAlignment,
        modifier = modifier.drawBehind {
            val strokeWidth = strokeWidthDp.toPx()
            val radius = radiusDp.toPx()

            if (drawTop)
                drawLine(
                    color = borderColor,
                    start = Offset(if (roundTopStart) radius else 0f, 0f),
                    end = Offset(size.width - if (roundTopEnd) radius else 0f, 0f),
                    strokeWidth = strokeWidth
                )

            if (drawBottom)
                drawLine(
                    color = borderColor,
                    start = Offset(if (roundBottomStart) radius else 0f, size.height),
                    end = Offset(size.width - if (roundBottomEnd) radius else 0f, size.height),
                    strokeWidth = strokeWidth
                )

            if (drawLeft)
                drawLine(
                    color = borderColor,
                    start = Offset(0f, if (roundTopStart) radius else 0f),
                    end = Offset(0f, size.height - if (roundBottomStart) radius else 0f),
                    strokeWidth = strokeWidth
                )

            if (drawRight)
                drawLine(
                    color = borderColor,
                    start = Offset(size.width, if (roundTopEnd) radius else 0f),
                    end = Offset(size.width, size.height - if (roundBottomEnd) radius else 0f),
                    strokeWidth = strokeWidth
                )

            if (roundTopEnd)
                drawArc(
                    color = borderColor,
                    startAngle = -90f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(size.width - 2 * radius, 0f),
                    size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2),
                    style = Stroke(width = strokeWidth)
                )

            if (roundTopStart)
                drawArc(
                    color = borderColor,
                    startAngle = 180f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(0f, 0f),
                    size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2),
                    style = Stroke(width = strokeWidth)
                )

            if (roundBottomStart)
                drawArc(
                    color = borderColor,
                    startAngle = 90f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(0f, size.height - 2 * radius),
                    size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2),
                    style = Stroke(width = strokeWidth)
                )

            if (roundBottomEnd)
                drawArc(
                    color = borderColor,
                    startAngle = 0f,
                    sweepAngle = 90f,
                    useCenter = false,
                    topLeft = Offset(size.width - 2 * radius, size.height - 2 * radius),
                    size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2),
                    style = Stroke(width = strokeWidth)
                )
        }
    ) {
        content()
    }
}
