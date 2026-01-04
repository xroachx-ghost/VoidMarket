package com.voidmarket.ui.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        val tiles = listOf(
            "Offline Mode" to "staticmap",
            "Live Map" to "livemap",
            "Static Map" to "staticmap",
            "Mesh Network" to "mesh",
            "Identity" to "identity",
            "Settings" to "settings",
            "About" to "about",
            "Legal" to "legal"
        )
        tiles.forEach { (label, route) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { navController.navigate(route) }
            ) {
                Box(modifier = Modifier.padding(16.dp)) {
                    Text(label)
                }
            }
        }
    }
}
