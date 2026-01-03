package com.voidmarket.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.voidmarket.ui.screens.home.HomeScreen
import com.voidmarket.ui.screens.maps.LiveMapScreen
import com.voidmarket.ui.screens.maps.StaticMapScreen
import com.voidmarket.ui.screens.mesh.MeshScreen
import com.voidmarket.ui.screens.settings.SettingsScreen
import com.voidmarket.ui.screens.identity.IdentityScreen
import com.voidmarket.ui.screens.about.AboutScreen
import com.voidmarket.ui.screens.legal.LegalScreen

@Composable
fun NavGraph(){
    val navController = rememberNavController()
    NavHost(navController, startDestination="home"){
        composable("home"){ HomeScreen(navController) }
        composable("livemap"){ LiveMapScreen(navController) }
        composable("staticmap"){ StaticMapScreen(navController) }
        composable("mesh"){ MeshScreen(navController) }
        composable("identity"){ IdentityScreen(navController) }
        composable("settings"){ SettingsScreen(navController) }
        composable("about"){ AboutScreen(navController) }
        composable("legal"){ LegalScreen(navController) }
    }
}
