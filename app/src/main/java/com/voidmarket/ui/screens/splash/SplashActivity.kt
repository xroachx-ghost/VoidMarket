package com.voidmarket.ui.screens.splash
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.voidmarket.MainActivity
import com.voidmarket.R

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { SplashScreen() }
        window.decorView.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2500)
    }
}

@Composable
fun SplashScreen(){
    Box(modifier=Modifier.fillMaxSize().background(Color.Black), contentAlignment=Alignment.Center){
        Column(horizontalAlignment=Alignment.CenterHorizontally){
            Image(painter=painterResource(id=R.drawable.guyfawks_mask), contentDescription="Splash Logo", modifier=Modifier.size(200.dp))
            Spacer(modifier=Modifier.height(16.dp))
            Text("VOID MARKET", color=Color.Green, fontSize=32.sp, fontWeight=FontWeight.Bold)
            Text("© 2025 Roach Security Labs", color=Color.Gray, fontSize=14.sp)
            Text("James Michael Roach Jr.", color=Color.Gray, fontSize=12.sp)
        }
    }
}
