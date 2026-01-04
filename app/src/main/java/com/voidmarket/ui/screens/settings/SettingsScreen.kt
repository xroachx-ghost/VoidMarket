package com.voidmarket.ui.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.voidmarket.ui.screens.maps.LocationMode

@Composable
fun SettingsScreen(navController: NavHostController) {
    var mode by remember { mutableStateOf(LocationMode.FUZZED) }
    
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Settings")
        Row {
            RadioButton(selected = (mode == LocationMode.REAL), onClick = { mode = LocationMode.REAL })
            Text("Real")
        }
        Row {
            RadioButton(selected = (mode == LocationMode.MANUAL), onClick = { mode = LocationMode.MANUAL })
            Text("Manual")
        }
        Row {
            RadioButton(selected = (mode == LocationMode.FUZZED), onClick = { mode = LocationMode.FUZZED })
            Text("Fuzzed")
        }
    }
}
