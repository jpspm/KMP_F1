package com.f1.view.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.f1.ui.theme.F1Black
import com.f1.ui.theme.F1DarkGray
import com.f1.ui.theme.F1LightGray
import com.f1.ui.theme.F1Typography
import com.f1.utils.WindowWidthSizeClass
import com.f1.utils.WindowsSizeClass
import com.f1.view.components.common.IndicativeColor

@Composable
fun LeaderHomeWidget(
    modifier: Modifier = Modifier,
    name: String,
    lastName: String,
    image: String,
    color: Long,
    points: String,
    sizeClass: WindowsSizeClass,
    team: String,
    number: String
) {
    var rowWidth by remember { mutableStateOf(0) }
    BoxWithConstraints(modifier = modifier.wrapContentSize()) {
        val imageSize = when (sizeClass.widthSizeClass) {
            WindowWidthSizeClass.Compact -> 130.dp
            WindowWidthSizeClass.Medium -> 200.dp
            else -> 250.dp
        }
        val baseTextLength = when (sizeClass.widthSizeClass) {
            WindowWidthSizeClass.Compact -> 20
            WindowWidthSizeClass.Medium -> 20
            else -> 20
        }

        Column(
            Modifier.drawBehind {
                val strokeWidth = 2.dp.toPx()
                val radius = 12.dp.toPx()
                val borderColor = F1DarkGray

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
            }

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .onGloballyPositioned { coordinates ->
                        rowWidth = coordinates.size.width
                    }
            ) {
                IndicativeColor(width = 10.dp, height = (2 * baseTextLength).dp, color = color)
                Column(modifier = Modifier.padding(start = 8.dp, end = 30.dp)) {
                    Text(
                        name,
                        style = F1Typography().displayMedium,
                        fontSize = (baseTextLength * 0.6).sp
                    )
                    Text(
                        lastName,
                        style = F1Typography().displayMedium,
                        fontSize = baseTextLength.sp
                    )
                }
                Column {
                    Text(points, style = F1Typography().labelLarge)
                    Text("Pnts", style = F1Typography().labelLarge)
                }
            }

            Divider(
                color = F1LightGray,
                thickness = 1.dp,
                modifier = Modifier.width(with(LocalDensity.current) { rowWidth.toDp() })
            )
            Row {
                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    Text(team, style = F1Typography().labelLarge)
                    Text(
                        number,
                        style = F1Typography().titleLarge,
                        fontSize = (4.5 * baseTextLength).sp,
                        color = Color(color)
                    )
                }
                AsyncImage(
                    model = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(imageSize)
                )
            }
        }
    }
}