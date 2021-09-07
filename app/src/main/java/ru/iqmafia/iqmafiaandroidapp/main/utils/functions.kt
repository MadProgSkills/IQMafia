package ru.iqmafia.iqmafiaandroidapp.main.utils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import ru.iqmafia.iqmafiaandroidapp.R


fun AppCompatActivity.replaceActivity(activity: AppCompatActivity) {
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
    this.finish()
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, addStack: Boolean = true) {
    if (addStack) {
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.nav_host_fragment_container, fragment)
            .commit()
    } else {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_container, fragment)
            .commit()
    }
}

fun Fragment.replaceFragment(fragment: Fragment) {
    this.fragmentManager?.beginTransaction()
        ?.addToBackStack(null)
        ?.replace(R.id.nav_host_fragment_container, fragment)
        ?.commit()
}