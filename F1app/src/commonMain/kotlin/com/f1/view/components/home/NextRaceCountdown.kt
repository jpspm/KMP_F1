package com.f1.view.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.f1.ui.theme.F1Red
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize

@Composable
fun NextRaceCountdown(
    modifier: Modifier = Modifier,
    intervalDays: String,
    month: String,
    event: String,
    eventDay: String,
    eventHours: String,
    daysRemain: String,
    hrsRemain: String,
    minsRemain: String
) {
    var rowWidth by remember { mutableStateOf(0) }
    val baseSize = LocalBaseSize.current
    val baseTextLength = baseSize.baseTextLength
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(end = 10.dp).drawBehind {
                drawLine(
                    color = F1Red,
                    start = Offset(size.width, 0f),
                    end = Offset(size.width, size.height),
                    strokeWidth = 2.dp.toPx()
                )
            }) {
            Text(
                intervalDays,
                style = F1Typography().titleMedium,
                fontSize = baseTextLength.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                month,
                style = F1Typography().titleMedium,
                fontSize = (1.5 * baseTextLength).sp,
                modifier = Modifier.padding(end = 8.dp)
            )
        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.onGloballyPositioned { coordinates ->
                    rowWidth = coordinates.size.width
                }) {
                Text(
                    event,
                    style = F1Typography().titleMedium,
                    fontSize = baseTextLength.sp,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(eventDay, style = F1Typography().bodyLarge)
                    Text(
                        eventHours,
                        style = F1Typography().bodyLarge,
                        fontSize = (0.5 * baseTextLength).sp
                    )
                }
            }
            Divider(
                color = F1Red, thickness = 1.dp, modifier = Modifier.width(
                    with(
                        LocalDensity.current
                    ) { rowWidth.toDp() })
            )
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.drawBehind {
                        drawLine(
                            color = F1Red,
                            start = Offset(size.width, 0f),
                            end = Offset(size.width, size.height),
                            strokeWidth = 2.dp.toPx()
                        )
                    }) {
                    Text(
                        daysRemain,
                        style = F1Typography().titleMedium,
                        fontSize = (1.5 * baseTextLength).sp,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Text(
                        "DAYS",
                        style = F1Typography().titleMedium,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.drawBehind {
                        drawLine(
                            color = F1Red,
                            start = Offset(size.width, 0f),
                            end = Offset(size.width, size.height),
                            strokeWidth = 2.dp.toPx()
                        )
                    }) {
                    Text(
                        hrsRemain,
                        style = F1Typography().titleMedium,
                        fontSize = (1.5 * baseTextLength).sp,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Text(
                        "HRS",
                        style = F1Typography().titleMedium,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        minsRemain,
                        style = F1Typography().titleMedium,
                        fontSize = (1.5 * baseTextLength).sp,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Text(
                        "MINS",
                        style = F1Typography().titleMedium,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
            }
        }
    }
}