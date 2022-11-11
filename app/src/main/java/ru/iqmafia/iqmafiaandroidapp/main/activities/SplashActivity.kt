package ru.iqmafia.iqmafiaandroidapp.main.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    val coroutine = CoroutineScope(Dispatchers.Main + Job())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        coroutine.launch {
            delay(1500)
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}