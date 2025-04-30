package com.f1.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
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
        displayLarge = displayLarge.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        displayMedium = displayMedium.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        displaySmall = displaySmall.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        titleLarge = titleLarge.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        titleMedium = titleMedium.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        titleSmall = titleSmall.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        bodyLarge = bodyLarge.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        bodySmall = bodySmall.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        labelLarge = labelLarge.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        labelMedium = labelMedium.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em)),
        labelSmall = labelSmall.copy(fontFamily = fontFamily, lineHeight = TextUnit(value = 1f, type = TextUnitType.Em))
    )
}