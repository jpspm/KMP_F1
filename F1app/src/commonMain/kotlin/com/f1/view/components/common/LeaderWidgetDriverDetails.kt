package com.f1.view.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.LocalBaseSize

@Composable
fun LeaderWidgetDriverDetails(modifier: Modifier = Modifier, team:String, number: String, image: String, color: Long){
    val baseSize = LocalBaseSize.current
    val imageSize = baseSize.imageSize
    val baseTextLength = baseSize.baseTextLength
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Text(team, style = F1Typography().labelLarge, fontSize = (baseTextLength * 0.9).sp)
            Text(
                number,
                style = F1Typography().titleLarge,
                fontSize = (4 * baseTextLength).sp,
                color = Color(color),
                modifier = Modifier.padding(top = (2 * imageSize - (baseTextLength * 4.9)).dp)
            )
        }
        AsyncImage(
            model = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size((2 * imageSize).dp)
        )
    }

}