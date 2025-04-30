package com.f1.view.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize
import f1app.f1app.generated.resources.Res
import f1app.f1app.generated.resources.home_pnts
import org.jetbrains.compose.resources.stringResource

@Composable
fun PositionPointsRow(modifier: Modifier = Modifier, position: String, points: String){
    val baseSize = LocalBaseSize.current
    val baseTextLength = baseSize.baseTextLength
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth().padding(end = 8.dp).padding(vertical = 8.dp)) {
        Text(position, style = F1Typography().labelLarge, fontSize = (1.7 * baseTextLength).sp)
        Column {
            Text(
                points,
                style = F1Typography().labelLarge,
                fontSize = (baseTextLength * 0.8).sp
            )
            Text(
                stringResource(Res.string.home_pnts),
                style = F1Typography().labelLarge,
                fontSize = (baseTextLength * 0.8).sp
            )
        }
    }
}