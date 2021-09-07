package ru.iqmafia.iqmafiaandroidapp.judge

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class JudgeVPFragmentStateAdapter(fa: FragmentActivity, private val frags: ArrayList<Fragment>) : FragmentStateAdapter(fa) {

    override fun createFragment(position: Int): Fragment = frags[position]


    override fun getItemCount(): Int = frags.size

}
