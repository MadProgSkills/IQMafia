package ru.iqmafia.iqmafiaandroidapp.judge.screens.names

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentNamesBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity
import ru.iqmafia.iqmafiaandroidapp.judge.screeens.night.NightViewModel


class NamesFragment : Fragment() {

    private var _mBinding: FragmentNamesBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var mNightViewModel: NightViewModel
    private lateinit var mJudgeActivity: JudgeActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is JudgeActivity) {
            mJudgeActivity = context as JudgeActivity
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _mBinding = FragmentNamesBinding.inflate(layoutInflater)

        mNightViewModel = ViewModelProvider(mJudgeActivity).get(NightViewModel::class.java)

        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
        val mName1TextObserver = Observer<String> { mBinding.namesName1Edit.setText(it) }
        val mName2TextObserver = Observer<String> { mBinding.namesName2Edit.setText(it) }
        val mName3TextObserver = Observer<String> { mBinding.namesName3Edit.setText(it) }
        val mName4TextObserver = Observer<String> { mBinding.namesName4Edit.setText(it) }
        val mName5TextObserver = Observer<String> { mBinding.namesName5Edit.setText(it) }
        val mName6TextObserver = Observer<String> { mBinding.namesName6Edit.setText(it) }
        val mName7TextObserver = Observer<String> { mBinding.namesName7Edit.setText(it) }
        val mName8TextObserver = Observer<String> { mBinding.namesName8Edit.setText(it) }
        val mName9TextObserver = Observer<String> { mBinding.namesName9Edit.setText(it) }
        val mName10TextObserver = Observer<String> { mBinding.namesName10Edit.setText(it) }

        mNightViewModel.name1String.observe(this, mName1TextObserver)
        mNightViewModel.name2String.observe(this, mName2TextObserver)
        mNightViewModel.name3String.observe(this, mName3TextObserver)
        mNightViewModel.name4String.observe(this, mName4TextObserver)
        mNightViewModel.name5String.observe(this, mName5TextObserver)
        mNightViewModel.name6String.observe(this, mName6TextObserver)
        mNightViewModel.name7String.observe(this, mName7TextObserver)
        mNightViewModel.name8String.observe(this, mName8TextObserver)
        mNightViewModel.name9String.observe(this, mName9TextObserver)
        mNightViewModel.name10String.observe(this, mName10TextObserver)
    }


    override fun onPause() {
        val namesList: List<String> = listOf<String>(
            mBinding.namesName1Edit.text.toString(),
            mBinding.namesName2Edit.text.toString(),
            mBinding.namesName3Edit.text.toString(),
            mBinding.namesName4Edit.text.toString(),
            mBinding.namesName5Edit.text.toString(),
            mBinding.namesName6Edit.text.toString(),
            mBinding.namesName7Edit.text.toString(),
            mBinding.namesName8Edit.text.toString(),
            mBinding.namesName9Edit.text.toString(),
            mBinding.namesName10Edit.text.toString()
        )

            mNightViewModel.setNames(namesList)
        super.onPause()
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }

    companion object {
        @JvmStatic
        fun newInstance() = NamesFragment()
    }
}