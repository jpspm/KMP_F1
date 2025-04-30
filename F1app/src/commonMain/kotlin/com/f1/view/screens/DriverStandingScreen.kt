package com.f1.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.F1Theme
import com.f1.view.components.common.F1TopBar
import com.f1.view.components.driverstanding.DriverPoints
import com.f1.view.components.driverstanding.sampleDriverPointsList

@Composable
fun DriverStandingScreen(modifier: Modifier = Modifier) {
    F1Theme {
        Scaffold(topBar = { F1TopBar(pageName = "Driver Standing") }) {
            LazyColumn(modifier = Modifier.fillMaxSize().padding(it).padding(horizontal = 8.dp, vertical = 10.dp), verticalArrangement = Arrangement.spacedBy(10.dp)){
                items(sampleDriverPointsList){driver ->
                    DriverPoints(
                        lastName = driver.lastName,
                        team = driver.team,
                        points = driver.points,
                        nation = driver.nation,
                        color = driver.color,
                        image = driver.image
                    )
                }
            }
        }
    }
}