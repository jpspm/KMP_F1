package com.f1.view.components.driverstanding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.f1.ui.theme.F1LightGray
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize
import com.f1.view.components.common.ColumnWithBorder
import com.f1.view.components.common.IndicativeColor

@Composable
fun DriverPoints(
    modifier: Modifier = Modifier,
    lastName: String,
    team: String,
    points: String,
    nation: String,
    color: Long,
    image: String
) {
    val baseSize = LocalBaseSize.current
    val baseTextLength = baseSize.baseTextLength
    val imageSize = baseSize.imageSize
    ColumnWithBorder(drawTop = true, drawLeft = true, roundTopStart = true) {
        Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size((0.8*imageSize).dp).padding(end = 6.dp)
            )
            IndicativeColor(height = (0.7*imageSize).dp, width = 10.dp, color = color, modifier = Modifier.padding(horizontal = 10.dp))
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        lastName,
                        style = F1Typography().displayMedium,
                        fontSize = (baseTextLength).sp
                    )
                    Text(
                        nation,
                        style = F1Typography().displayMedium,
                        fontSize = (baseTextLength).sp
                    )
                }
                Divider(
                    color = F1LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    team,
                    style = F1Typography().displayMedium,
                    fontSize = (baseTextLength).sp
                )
                Text(
                    "$points Pnts",
                    style = F1Typography().displayMedium,
                    fontSize = (baseTextLength).sp
                )

            }
        }
    }
}