package com.f1.view.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.f1.ui.theme.F1LightGray
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize
import com.f1.view.components.common.ColumnWithBorder
import com.f1.view.components.common.InfoRowWithIndicativeColor
import com.f1.view.components.common.PositionPointsRow


@Composable
fun TeamHomeWidget(
    modifier: Modifier = Modifier,
    teamName: String,
    points: String,
    color: Long,
    position: String,
    firstPilotName: String,
    firstPilotNumber: Int,
    firstPilotImage: String,
    secondPilotName: String,
    secondPilotNumber: Int,
    secondPilotImage: String
) {
    BoxWithConstraints(modifier = Modifier.wrapContentSize()) {
        val baseSize = LocalBaseSize.current
        val baseTextLength = baseSize.baseTextLength
        ColumnWithBorder(
            modifier = modifier,
            drawTop = true,
            drawRight = true,
            roundTopEnd = true
        ) {
            PositionPointsRow(position = position, points = points)
            Divider(
                color = F1LightGray,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
            InfoRowWithIndicativeColor(color = color, composableIndicative = {
                Text(
                    teamName,
                    style = F1Typography().displayMedium,
                    fontSize = (baseTextLength).sp
                )
            }, composableFinalRow = {})
            Divider(
                color = F1LightGray,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(top = 3.dp).padding(horizontal = 8.dp)
            ) {
                PilotTeamWidget(
                    pilotName = firstPilotName,
                    pilotNumber = firstPilotNumber,
                    image = firstPilotImage,
                    color = color
                )
                PilotTeamWidget(
                    pilotName = secondPilotName,
                    pilotNumber = secondPilotNumber,
                    image = secondPilotImage,
                    color = color
                )
            }
        }
    }
}