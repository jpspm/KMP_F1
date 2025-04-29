package com.f1.view.components.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.f1.ui.theme.F1LightGray
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize
import com.f1.view.components.common.ColumnWithBorder
import com.f1.view.components.common.InfoRowWithIndicativeColor
import com.f1.view.components.common.LeaderWidgetDriverDetails
import com.f1.view.components.common.PositionPointsRow

@Composable
fun LeaderHomeWidget(
    modifier: Modifier = Modifier,
    name: String,
    lastName: String,
    image: String,
    color: Long,
    points: String,
    team: String,
    number: String,
    nation: String,
    position: String
) {
    var rowWidth by remember { mutableStateOf(0) }
    val baseSize = LocalBaseSize.current
    val baseTextLength = baseSize.baseTextLength
    ColumnWithBorder(modifier = modifier) {
        PositionPointsRow(
            position = position,
            points = points,
            modifier = Modifier.onGloballyPositioned { coordinates ->
                rowWidth = coordinates.size.width
            })
        Divider(
            color = F1LightGray,
            thickness = 1.dp,
            modifier = Modifier.width(with(LocalDensity.current) { rowWidth.toDp() })
        )
        InfoRowWithIndicativeColor(color = color, composableIndicative = {
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
        }, composableFinalRow = {
            Text(nation, style = F1Typography().displayMedium, fontSize = baseTextLength.sp)
        })
        Divider(
            color = F1LightGray,
            thickness = 1.dp,
            modifier = Modifier.width(with(LocalDensity.current) { rowWidth.toDp() })
        )
        LeaderWidgetDriverDetails(team = team, number = number, image = image, color = color)
    }
}