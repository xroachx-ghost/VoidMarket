package com.voidmarket.ui.screens.mesh
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
@Composable fun MeshScreen(navController: NavHostController){
    val mesh = MeshManager()
    Text("MeshScreen - Peers: ${mesh.discoverPeers().size}")
}
