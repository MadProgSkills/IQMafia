package ru.iqmafia.iqmafiaandroidapp.judge

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.ads.AdsActivity
import ru.iqmafia.iqmafiaandroidapp.databinding.ActivityJudgeBinding
import ru.iqmafia.iqmafiaandroidapp.judge.screens.card.CardFragment
import ru.iqmafia.iqmafiaandroidapp.judge.screens.day.DayFragment
import ru.iqmafia.iqmafiaandroidapp.judge.screens.names.NamesFragment
import ru.iqmafia.iqmafiaandroidapp.judge.screens.night.NightFragment
import ru.iqmafia.iqmafiaandroidapp.judge.screens.slot.SlotFragment
import ru.iqmafia.iqmafiaandroidapp.judge.screens.stats.StatsFragment
import ru.iqmafia.iqmafiaandroidapp.judge.utils.replaceActivity

class JudgeActivity : AppCompatActivity() {

    private var _mBinding: ActivityJudgeBinding? = null
    private val mBinding get() = _mBinding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mBinding = ActivityJudgeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        initialization()

    }

    private fun initialization() {

        val fragmentsList = arrayListOf(
            SlotFragment.newInstance(),
            CardFragment.newInstance(),
            NamesFragment.newInstance(),
            DayFragment.newInstance(),
            NightFragment.newInstance(),
            StatsFragment.newInstance()
        )
        mBinding.judgeViewPager.adapter = JudgeVPFragmentStateAdapter(this, fragmentsList)

        //mBinding.judgeBottomMenu.selectedItemId = R.id.JudgeAct
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.AdvertAct -> replaceActivity(AdsActivity())
        }
        return true
    }



    //    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.bottom_menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.AdvertAct -> JudgeActivity().replaceActivity(AdsActivity())
//        }
//        return true
//    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}