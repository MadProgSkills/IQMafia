package ru.iqmafia.iqmafiaandroidapp.judge.fragments.vote

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentVoteBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity

class VoteFragment : Fragment() {

    private var _mBinding: FragmentVoteBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var mVoteViewModel: VoteViewModel
    private lateinit var mJudgeActivity: JudgeActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is JudgeActivity) {
            mJudgeActivity = context as JudgeActivity}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _mBinding = FragmentVoteBinding.inflate(layoutInflater)
        mVoteViewModel = ViewModelProvider(mJudgeActivity).get(VoteViewModel::class.java)

        mBinding.voteText.setOnClickListener {
            mVoteViewModel.resetThisShit()
        }


        //BUTTON VIEW MODEL OBSERVE
        val mButtonVote1DrawableObserver = Observer<Drawable> {mBinding.votePl1Button.background = it}
        val mButtonVote2DrawableObserver = Observer<Drawable> {mBinding.votePl2Button.background = it}
        val mButtonVote3DrawableObserver = Observer<Drawable> {mBinding.votePl3Button.background = it}
        val mButtonVote4DrawableObserver = Observer<Drawable> {mBinding.votePl4Button.background = it}
        val mButtonVote5DrawableObserver = Observer<Drawable> {mBinding.votePl5Button.background = it}
        val mButtonVote6DrawableObserver = Observer<Drawable> {mBinding.votePl6Button.background = it}
        val mButtonVote7DrawableObserver = Observer<Drawable> {mBinding.votePl7Button.background = it}
        val mButtonVote8DrawableObserver = Observer<Drawable> {mBinding.votePl8Button.background = it}
        val mButtonVote9DrawableObserver = Observer<Drawable> {mBinding.votePl9Button.background = it}
        val mButtonVote10DrawableObserver = Observer<Drawable> {mBinding.votePl10Button.background = it}

        mVoteViewModel.mButton1Drawable.observe(this, mButtonVote1DrawableObserver)
        mVoteViewModel.mButton2Drawable.observe(this, mButtonVote2DrawableObserver)
        mVoteViewModel.mButton3Drawable.observe(this, mButtonVote3DrawableObserver)
        mVoteViewModel.mButton4Drawable.observe(this, mButtonVote4DrawableObserver)
        mVoteViewModel.mButton5Drawable.observe(this, mButtonVote5DrawableObserver)
        mVoteViewModel.mButton6Drawable.observe(this, mButtonVote6DrawableObserver)
        mVoteViewModel.mButton7Drawable.observe(this, mButtonVote7DrawableObserver)
        mVoteViewModel.mButton8Drawable.observe(this, mButtonVote8DrawableObserver)
        mVoteViewModel.mButton9Drawable.observe(this, mButtonVote9DrawableObserver)
        mVoteViewModel.mButton10Drawable.observe(this, mButtonVote10DrawableObserver)

        //NIGHT KILL INDICATE
        mBinding.votePl1Button.setOnClickListener { mVoteViewModel.vote1Flag() }
        mBinding.votePl2Button.setOnClickListener { mVoteViewModel.vote2Flag() }
        mBinding.votePl3Button.setOnClickListener { mVoteViewModel.vote3Flag() }
        mBinding.votePl4Button.setOnClickListener { mVoteViewModel.vote4Flag() }
        mBinding.votePl5Button.setOnClickListener { mVoteViewModel.vote5Flag() }
        mBinding.votePl6Button.setOnClickListener { mVoteViewModel.vote6Flag() }
        mBinding.votePl7Button.setOnClickListener { mVoteViewModel.vote7Flag() }
        mBinding.votePl8Button.setOnClickListener { mVoteViewModel.vote8Flag() }
        mBinding.votePl9Button.setOnClickListener { mVoteViewModel.vote9Flag() }
        mBinding.votePl10Button.setOnClickListener { mVoteViewModel.vote10Flag() }

        return mBinding.root
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}
