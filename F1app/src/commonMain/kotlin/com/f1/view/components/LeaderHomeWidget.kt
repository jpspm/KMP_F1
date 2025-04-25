package com.f1.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage
import com.f1.ui.theme.F1Typography

@Composable
fun LeaderHomeWidget(modifier: Modifier = Modifier, name: String, image: String, points: String) {
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Leader", style = F1Typography().displaySmall)
        AsyncImage(model = image, contentDescription = null, contentScale = ContentScale.Fit)
        Text(name, style = F1Typography().displayMedium)
        Text(points, style = F1Typography().bodyLarge)
    }
}