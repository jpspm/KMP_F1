package com.f1.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import f1app.f1app.generated.resources.Res
import f1app.f1app.generated.resources.orbitron_bold
import f1app.f1app.generated.resources.orbitron_extrabold
import f1app.f1app.generated.resources.orbitron_medium
import f1app.f1app.generated.resources.orbitron_regular
import f1app.f1app.generated.resources.orbitron_semibold
import org.jetbrains.compose.resources.Font

@Composable
fun OrbitronFontFamily() = FontFamily(
    Font(Res.font.orbitron_regular, weight = FontWeight.Normal),
    Font(Res.font.orbitron_medium, weight = FontWeight.Medium),
    Font(Res.font.orbitron_semibold, weight = FontWeight.SemiBold),
    Font(Res.font.orbitron_bold, weight = FontWeight.Bold),
    Font(Res.font.orbitron_extrabold, weight = FontWeight.ExtraBold)
)

@Composable
fun F1Typography() = Typography().run {

    val fontFamily = OrbitronFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = fontFamily),
        displayMedium = displayMedium.copy(fontFamily = fontFamily),
        displaySmall = displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = titleLarge.copy(fontFamily = fontFamily),
        titleMedium = titleMedium.copy(fontFamily = fontFamily),
        titleSmall = titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = bodySmall.copy(fontFamily = fontFamily),
        labelLarge = labelLarge.copy(fontFamily = fontFamily),
        labelMedium = labelMedium.copy(fontFamily = fontFamily),
        labelSmall = labelSmall.copy(fontFamily = fontFamily)
    )
}