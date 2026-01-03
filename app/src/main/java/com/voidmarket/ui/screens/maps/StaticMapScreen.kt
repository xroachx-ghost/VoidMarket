package com.voidmarket.ui.screens.maps
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun StaticMapScreen(navController: NavHostController){
    val manager = LiveMapManager() // reuse LiveMapManager for static coordinates
    Text("StaticMapScreen - Current Mode: ${manager.currentMode}")
}
