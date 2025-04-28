package com.f1.view.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.f1.ui.theme.F1DarkGray
import com.f1.ui.theme.F1LightGray
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize

@Composable
fun PilotTeamWidget(
    modifier: Modifier = Modifier,
    pilotName: String,
    pilotNumber: Int,
    color: Long,
    image: String
) {
    val baseSize = LocalBaseSize.current
    val baseTextLength = baseSize.baseTextLength
    val imageSize = baseSize.imageSize
    var rowWidth by remember { mutableStateOf(0) }
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.drawBehind {
        val strokeWidth = 2.dp.toPx()
        val radius = 12.dp.toPx()
        val borderColor = F1DarkGray
        drawLine(
            color = borderColor,
            start = Offset(size.width, (baseTextLength*3).toFloat()),
            end = Offset(size.width, size.height - radius),
            strokeWidth = strokeWidth
        )
        drawLine(
            color = borderColor,
            start = Offset(0f, size.height),
            end = Offset(size.width - radius, size.height),
            strokeWidth = strokeWidth
        )
        drawArc(
            color = borderColor,
            startAngle = 0f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(size.width - 2 * radius, size.height - 2 * radius),
            size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2),
            style = androidx.compose.ui.graphics.drawscope.Stroke(width = strokeWidth)
        )

    }) {
        Row(
            modifier = Modifier.defaultMinSize((imageSize*0.735).dp)
                .onGloballyPositioned { coordinates ->
                    rowWidth = coordinates.size.width
                }, horizontalArrangement = Arrangement.SpaceBetween) {
            Text(pilotName, style = F1Typography().labelLarge, fontSize = (baseTextLength * 0.8).sp)
            Text(
                pilotNumber.toString(),
                style = F1Typography().labelLarge,
                fontSize = (baseTextLength * 0.8).sp,
                color = Color(color), modifier = Modifier.defaultMinSize(minWidth = (baseTextLength).dp), textAlign = TextAlign.End
            )
        }
        Divider(
            color = F1LightGray,
            thickness = 1.dp,
            modifier = Modifier.width(with(LocalDensity.current) { rowWidth.toDp() })
        )
        AsyncImage(
            model = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size((imageSize*0.735).dp).padding(end = 6.dp)
        )
    }
}