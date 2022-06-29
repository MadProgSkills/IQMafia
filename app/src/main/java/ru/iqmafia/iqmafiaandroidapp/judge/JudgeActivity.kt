package ru.iqmafia.iqmafiaandroidapp.judge

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
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

    @SuppressLint("UseCompatLoadingForDrawables")
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

        val tabIconsList: List<Drawable?> = listOf(
            getDrawable(R.drawable.ic_get_slot),
            getDrawable(R.drawable.ic_get_card),
            getDrawable(R.drawable.ic_day),
            getDrawable(R.drawable.ic_vote),
            getDrawable(R.drawable.ic_end),
            getDrawable(R.drawable.ic_stats)
        )

        val tabTextList: List<String> = listOf(
            getString(R.string.slot),
            getString(R.string.card),
            getString(R.string.day),
            getString(R.string.vote),
            getString(R.string.end),
            getString(R.string.stats)
        )

        val tabsMediator = TabLayoutMediator(mBinding.judgeBottomMenu, mBinding.judgeViewPager) { tab, position ->
            tab.icon = tabIconsList[position]!!
            tab.text = tabTextList[position]
        }

        tabsMediator.attach()
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


    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}