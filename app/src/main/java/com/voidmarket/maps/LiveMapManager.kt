package com.voidmarket.maps

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.voidmarket.ui.screens.maps.LocationMode
import kotlin.random.Random

object LiveMapManager {
    private val locationLive = MutableLiveData<Pair<Double, Double>>()
    
    fun getLocation(): LiveData<Pair<Double, Double>> = locationLive
    
    fun updateLocation(lat: Double, lon: Double, mode: LocationMode) {
        val (fLat, fLon) = when (mode) {
            LocationMode.FUZZED -> lat + Random.nextDouble() * 0.01 to lon + Random.nextDouble() * 0.01
            LocationMode.MANUAL -> lat to lon
            LocationMode.REAL -> lat to lon
        }
        locationLive.postValue(fLat to fLon)
        broadcastLocation(fLat, fLon)
    }
    
    private fun broadcastLocation(lat: Double, lon: Double) {
        // Stub: broadcast location via mesh network
        val msg = "LOC|$lat|$lon"
        // MeshManager.getPeers().value?.forEach { peer -> MeshManager.sendMessage(peer, msg) }
    }
}
