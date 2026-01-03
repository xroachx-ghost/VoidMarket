package com.voidmarket.ui.screens.maps
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
class LiveMapManager {
    var currentMode by mutableStateOf(LocationMode.FUZZED)
    fun setMode(mode: LocationMode){ currentMode = mode }
    fun getLocation(): Pair<Double,Double> { return Pair(0.0,0.0) } // stub
}
enum class LocationMode { REAL, MANUAL, FUZZED }
