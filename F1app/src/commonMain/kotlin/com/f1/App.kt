package com.f1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.BaseSize
import com.f1.ui.theme.F1Theme
import com.f1.ui.theme.LocalBaseSize
import com.f1.utils.WindowWidthSizeClass
import com.f1.utils.mapToWindowSizeClass
import com.f1.view.components.common.F1TopBar
import com.f1.view.components.home.LeaderHomeWidget
import com.f1.view.components.home.NextRace
import com.f1.view.components.home.TeamHomeWidget
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    F1Theme {
        Scaffold(topBar = { F1TopBar() }) {
            BoxWithConstraints {
                val windowSize = mapToWindowSizeClass(maxWidth, maxHeight)
                val baseSize = when (windowSize.widthSizeClass) {
                    WindowWidthSizeClass.SmallCompact -> BaseSize(115, 18)
                    WindowWidthSizeClass.MediumCompact -> BaseSize(130, 23)
                    WindowWidthSizeClass.Medium -> BaseSize(200, 20)
                    else -> BaseSize(250, 20)
                }
                CompositionLocalProvider(LocalBaseSize provides baseSize) {
                    LazyColumn(Modifier.padding(it).padding(horizontal = 8.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        item {
                            LeaderHomeWidget(
                                name = "Gabriel",
                                lastName = "Bortoleto",
                                image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GABBOR01_Gabriel_Bortoleto/gabbor01.png",
                                points = "200",
                                color = 0xFF52E252,
                                team = "Sauber",
                                number = "55",
                                modifier = Modifier.padding(top = 8.dp),
                                nation = "BRA",
                                position = "1"
                            )
                        }
                        item {
                            TeamHomeWidget(
                                teamName = "Red Bull Racing",
                                points = "125",
                                color = 0xFF3671C6,
                                position = "1",
                                firstPilotName = "Verstappen",
                                firstPilotNumber = 1,
                                firstPilotImage = "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png",
                                secondPilotName = "Tsunoda",
                                secondPilotNumber = 22,
                                secondPilotImage = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png",
                            )
                        }
                        item {
                            NextRace(
                                modifier = Modifier.padding(horizontal = 8.dp),
                                nextRaceTitle = "FORMULA 1 CRIPTO.COM MIAMI GRAND PRIX 2025",
                                circuit = "https://media.formula1.com/image/upload/f_auto,c_limit,w_1440,q_auto/f_auto/q_auto/content/dam/fom-website/2018-redesign-assets/Track%20icons%204x3/Miami%20carbon",
                                intervalDays = "02-04",
                                month = "MAY",
                                event = "PRACTICE 1",
                                eventDay = "FRIDAY",
                                eventHours = "13:30-14:30",
                                daysRemain = "05",
                                hrsRemain = "21",
                                minsRemain = "11"
                            )
                        }
                    }
                }
            }
        }
    }
}
