package com.voidmarket.mesh

import android.content.Context
import android.net.wifi.p2p.*
import android.net.wifi.p2p.WifiP2pManager.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.concurrent.Executors
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

class MeshManager(context: Context){
    private val manager = context.getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager
    private val channel = manager.initialize(context, context.mainLooper, null)
    private val peersFlow = MutableStateFlow<List<String>>(emptyList())
    val peers = peersFlow.asStateFlow()
    
    // AES encryption key (stub, in production generate securely)
    private val secretKey = SecretKeySpec("1234567890123456".toByteArray(),"AES")
    
    fun discoverPeers(){
        manager.discoverPeers(channel, object : ActionListener{
            override fun onSuccess() {}
            override fun onFailure(reason: Int) {}
        })
    }
    
    fun broadcastMessage(message: String){
        val encrypted = encrypt(message)
        // send encrypted message to all peers (stub)
    }
    
    fun encrypt(text:String): ByteArray {
        val cipher = Cipher.getInstance("AES")
        cipher.init(Cipher.ENCRYPT_MODE, secretKey)
        return cipher.doFinal(text.toByteArray())
    }
    
    fun decrypt(data:ByteArray): String {
        val cipher = Cipher.getInstance("AES")
        cipher.init(Cipher.DECRYPT_MODE, secretKey)
        return String(cipher.doFinal(data))
    }
}
