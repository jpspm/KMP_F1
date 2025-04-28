package com.f1.view.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.f1.ui.theme.F1LightGray
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize
import com.f1.view.components.common.ColumnWithBorder
import com.f1.view.components.common.IndicativeColor
import f1app.f1app.generated.resources.Res
import f1app.f1app.generated.resources.home_pnts
import org.jetbrains.compose.resources.stringResource


@Composable
fun TeamHomeWidget(
    modifier: Modifier = Modifier,
    teamName: String,
    points: Int,
    color: Long,
    firstPilotName: String,
    firstPilotNumber: Int,
    firstPilotImage: String,
    secondPilotName: String,
    secondPilotNumber: Int,
    secondPilotImage: String
) {
    var rowWidth by remember { mutableStateOf(0) }
    BoxWithConstraints(modifier = Modifier.wrapContentSize()) {
        val baseSize = LocalBaseSize.current
        val baseTextLength = baseSize.baseTextLength
        ColumnWithBorder(modifier = modifier) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 3.dp)
                    .onGloballyPositioned { coordinates ->
                        rowWidth = coordinates.size.width
                    }
            ) {
                IndicativeColor(width = 10.dp, height = (2 * baseTextLength).dp, color = color)
                Column(modifier = Modifier.padding(start = 8.dp, end = 30.dp)) {
                    Text(
                        teamName,
                        style = F1Typography().displayMedium,
                        fontSize = (baseTextLength*0.7).sp
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        points.toString(),
                        style = F1Typography().labelLarge,
                        fontSize = (baseTextLength * 0.6).sp
                    )
                    Text(
                        stringResource(Res.string.home_pnts),
                        style = F1Typography().labelLarge,
                        fontSize = (baseTextLength * 0.6).sp
                    )
                }
            }
            Divider(
                color = F1LightGray,
                thickness = 1.dp,
                modifier = Modifier.width(with(LocalDensity.current) { rowWidth.toDp() })
            )
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 3.dp)){
                PilotTeamWidget(pilotName = firstPilotName, pilotNumber = firstPilotNumber, image = firstPilotImage, color = color)
                Spacer(Modifier.width(baseTextLength.dp/2))
                PilotTeamWidget(pilotName = secondPilotName, pilotNumber = secondPilotNumber, image = secondPilotImage, color = color)
            }
        }
    }
}