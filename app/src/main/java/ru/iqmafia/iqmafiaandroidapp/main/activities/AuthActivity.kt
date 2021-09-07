package ru.iqmafia.iqmafiaandroidapp.main.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vk.api.sdk.VK
import com.vk.api.sdk.auth.VKAccessToken
import com.vk.api.sdk.auth.VKAuthCallback
import com.vk.api.sdk.auth.VKScope
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.databinding.ActivityAuthBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity
import ru.iqmafia.iqmafiaandroidapp.main.utils.replaceActivity

class AuthActivity : AppCompatActivity() {

    private var _mBinding: ActivityAuthBinding? = null
    private val mBinding get() = _mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        initialization()
    }

    private fun initialization() {
        title = getString(R.string.autentification)
        mBinding.vkAuthButton.setOnClickListener {
            VK.login(this, arrayListOf(VKScope.FRIENDS, VKScope.AUDIO, VKScope.PHOTOS, VKScope.GROUPS))
        }

        mBinding.noAuthButton.setOnClickListener {
            replaceActivity(JudgeActivity())
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        val callback = object : VKAuthCallback {
            override fun onLogin(token: VKAccessToken) {
                replaceActivity(JudgeActivity())
            }

            override fun onLoginFailed(errorCode: Int) {
            }
        }

        if (!VK.onActivityResult(requestCode, resultCode, data, callback)) {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}