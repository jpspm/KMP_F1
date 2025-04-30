package com.f1.view.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.LocalBaseSize

@Composable
fun InfoRowWithIndicativeColor(
    modifier: Modifier = Modifier,
    color: Long,
    composableIndicative: @Composable () -> Unit,
    composableFinalRow: @Composable () -> Unit
) {
    val baseSize = LocalBaseSize.current
    val baseTextLength = baseSize.baseTextLength
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth().padding(end = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            IndicativeColor(width = 10.dp, height = (2 * baseTextLength).dp, color = color)
            Column(modifier = Modifier.padding(start = 8.dp, end = 30.dp)) {
                composableIndicative()
            }
        }
        composableFinalRow()
    }
}