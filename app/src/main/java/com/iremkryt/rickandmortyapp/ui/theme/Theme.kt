package com.iremkryt.rickandmortyapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalatte = darkColors(
    primary = Purple1,
    primaryVariant = Purple3,
    secondary = Purple4
)
private val LightColorPalette = lightColors(
    primary = Purple2,
    primaryVariant = Purple3,
    secondary = Purple4
)
@Composable
fun RickAndMortyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit){
    val colors = if (darkTheme) {
        DarkColorPalatte
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}