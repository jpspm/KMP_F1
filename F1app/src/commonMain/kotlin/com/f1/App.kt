package com.f1

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.F1Theme
import com.f1.view.components.F1TopBar
import com.f1.view.components.LeaderHomeWidget
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import f1app.f1app.generated.resources.Res
import f1app.f1app.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    F1Theme {
        Scaffold(topBar = { F1TopBar() }) {
            Column(
                Modifier.fillMaxSize().padding(it),
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(50.dp)){
                    LeaderHomeWidget(
                        name = "Bortoleto",
                        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GABBOR01_Gabriel_Bortoleto/gabbor01.png",
                        points = "200pnts",
                        modifier = Modifier.weight(1f)
                    )
                    LeaderHomeWidget(
                        name = "Bortoleto",
                        image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GABBOR01_Gabriel_Bortoleto/gabbor01.png",
                        points = "200pnts",
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}