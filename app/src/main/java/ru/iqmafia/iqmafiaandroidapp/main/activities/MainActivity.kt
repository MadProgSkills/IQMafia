package ru.iqmafia.iqmafiaandroidapp.main.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vk.api.sdk.VK
import com.vk.api.sdk.utils.VKUtils
import ru.iqmafia.iqmafiaandroidapp.databinding.ActivityMainBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity
import ru.iqmafia.iqmafiaandroidapp.main.utils.ACTIVITY
import ru.iqmafia.iqmafiaandroidapp.main.utils.replaceActivity

class MainActivity : AppCompatActivity() {
    private var _mBinding: ActivityMainBinding? = null
    val mBinding get() = _mBinding!!
    //lateinit var navController: NavController
    //private var vkFingerprint: Array<String?>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        initialize()
    }

    override fun onDestroy() {
        super.onDestroy()
        _mBinding = null
    }

    private fun initialize() {
        val vkFingerprint = VKUtils.getCertificateFingerprint(this, this.packageName)
        Log.e("vkFingerprint", "${vkFingerprint!![0]}")

        ACTIVITY = this

        if (VK.isLoggedIn()) {
            replaceActivity(JudgeActivity())
        } else {
            replaceActivity(AuthActivity())
        }
    }

}