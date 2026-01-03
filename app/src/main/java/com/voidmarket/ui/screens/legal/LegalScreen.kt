package com.voidmarket.ui.screens.legal
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun LegalScreen(navController: NavHostController){
    Column(modifier=Modifier.padding(16.dp)){
        Text("Terms of Service Placeholder")
        Text("Privacy Policy Placeholder")
        Text("All features comply with Play Store policies")
    }
}
