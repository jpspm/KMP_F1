package com.f1.view.components.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.f1.ui.theme.F1Red
import com.f1.ui.theme.F1Typography
import com.f1.ui.theme.F1White
import f1app.f1app.generated.resources.Res
import f1app.f1app.generated.resources.f1_logo
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun F1TopBar(modifier: Modifier = Modifier, pageName: String = "") {
    TopAppBar(
        modifier = modifier,
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (pageName != "") {
                    Text(
                        pageName,
                        style = F1Typography().titleLarge,
                        color = F1White,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                } else {
                    Image(painter = painterResource(Res.drawable.f1_logo), contentDescription = "")
                }
            }
        },
        colors = TopAppBarColors(
            containerColor = F1Red,
            scrolledContainerColor = Color.Transparent,
            navigationIconContentColor = Color.Transparent,
            titleContentColor = Color.Transparent,
            actionIconContentColor = Color.Transparent
        )
    )
}
