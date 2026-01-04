package com.voidmarket.ui.screens.identity

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.voidmarket.identity.AnonymousIdentity

@Composable
fun IdentityScreen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Identity Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { AnonymousIdentity.rotateId() }) {
            Text("Rotate Anonymous ID")
        }
    }
}
