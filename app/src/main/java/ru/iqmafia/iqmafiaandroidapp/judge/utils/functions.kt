package ru.iqmafia.iqmafiaandroidapp.judge.utils

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.replaceActivity(activity: Activity) {
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
    this.finish()
}