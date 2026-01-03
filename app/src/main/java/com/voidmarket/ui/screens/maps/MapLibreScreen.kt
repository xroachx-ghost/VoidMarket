package com.voidmarket.ui.screens.maps

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.mapbox.maps.MapView
import com.mapbox.maps.Style
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController

@Composable
fun MapLibreScreen(navController: NavHostController, modifier: Modifier = Modifier){
    AndroidView(factory = { context ->
        MapView(context).apply {
            getMapboxMap().loadStyleUri(Style.DARK) // hacker-style dark theme
        }
    }, modifier = modifier)
}
