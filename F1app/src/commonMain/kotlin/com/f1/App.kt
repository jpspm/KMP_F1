package com.f1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.F1Theme
import com.f1.utils.mapToWindowSizeClass
import com.f1.view.components.common.F1TopBar
import com.f1.view.components.home.LeaderHomeWidget
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    F1Theme {
        Scaffold(topBar = { F1TopBar() }) {
            BoxWithConstraints {
                val windowSize = mapToWindowSizeClass(maxWidth, maxHeight)
                Column(Modifier.padding(it)) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        LeaderHomeWidget(
                            name = "Gabriel",
                            lastName = "Bortoleto",
                            image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GABBOR01_Gabriel_Bortoleto/gabbor01.png",
                            points = "200",
                            sizeClass = windowSize,
                            color = 0xFF52E252,
                            team = "Sauber",
                            number = "5"
                        )
                        LeaderHomeWidget(
                            name = "Gabriel",
                            lastName = "Bortoleto",
                            image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GABBOR01_Gabriel_Bortoleto/gabbor01.png",
                            points = "200",
                            sizeClass = windowSize,
                            color = 0xFF52E252,
                            team = "Sauber",
                            number = "5"
                        )
                    }
                }
            }
        }
    }
}