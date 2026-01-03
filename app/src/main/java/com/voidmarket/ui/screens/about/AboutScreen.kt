package com.voidmarket.ui.screens.about
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AboutScreen(navController: NavHostController){
    Column(modifier=Modifier.padding(16.dp)){
        Text("VOID MARKET")
        Text("© 2025 Roach Security Labs")
        Text("James Michael Roach Jr.")
        Text("Anonymous-first, offline-capable, encrypted mesh network app")
    }
}
