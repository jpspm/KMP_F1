package com.f1.view.components.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.f1.ui.theme.F1Black
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize

@Composable
fun NextRace(
    modifier: Modifier = Modifier,
    nextRaceTitle: String,
    circuit: String,
    intervalDays: String,
    month: String,
    event: String,
    eventDay: String,
    eventHours: String,
    daysRemain: String,
    hrsRemain: String,
    minsRemain: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.drawBehind {
        val radius = 12.dp.toPx()
        val strokeWidth = 2.dp.toPx()
        drawArc(
            color = F1Black,
            startAngle = 180f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(0f, 0f),
            size = Size(radius * 2, radius * 2),
            style = Stroke(width = strokeWidth)
        )

        drawArc(
            color = F1Black,
            startAngle = -90f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(size.width - 2 * radius, 0f),
            size = Size(radius * 2, radius * 2),
            style = Stroke(width = strokeWidth)
        )

        drawArc(
            color = F1Black,
            startAngle = 90f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(0f, size.height - 2 * radius),
            size = Size(radius * 2, radius * 2),
            style = Stroke(width = strokeWidth)
        )

        drawArc(
            color = F1Black,
            startAngle = 0f,
            sweepAngle = 90f,
            useCenter = false,
            topLeft = Offset(size.width - 2 * radius, size.height - 2 * radius),
            size = Size(radius * 2, radius * 2),
            style = Stroke(width = strokeWidth)
        )

    }){
        val baseSize = LocalBaseSize.current
        val baseTextLength = baseSize.baseTextLength
        val imageSize = baseSize.imageSize
        Text(nextRaceTitle, style = F1Typography().titleLarge, fontSize = (baseTextLength).sp, textAlign = TextAlign.Center)
        AsyncImage(
            model = circuit,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(height = (1.5*imageSize).dp, width = (3*imageSize).dp)
        )
        NextRaceCountdown(
            intervalDays = intervalDays,
            month = month,
            event = event,
            eventDay = eventDay,
            eventHours = eventHours,
            daysRemain = daysRemain,
            hrsRemain = hrsRemain,
            minsRemain = minsRemain
        )
    }
}