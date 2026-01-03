package com.voidmarket.ui.screens.maps
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
@Composable fun LiveMapScreen(navController: NavHostController){
    val manager = LiveMapManager()
    Text("LiveMapScreen - Mode: ${manager.currentMode}")
}
