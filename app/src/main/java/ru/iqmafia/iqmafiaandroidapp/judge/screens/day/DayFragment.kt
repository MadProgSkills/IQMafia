package ru.iqmafia.iqmafiaandroidapp.judge.screens.day

import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentDayBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity
import ru.iqmafia.iqmafiaandroidapp.judge.fragments.vote.VoteViewModel

class DayFragment : Fragment() {
    // TODO:кнопка результаты голосования


    private var _mBinding: FragmentDayBinding? = null
    private val mBinding get() = _mBinding!!

    //VOTE-BEST MOVE VIEW MODEL
    private lateinit var mVoteViewModel: VoteViewModel
    private lateinit var mJudgeActivity: JudgeActivity


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is JudgeActivity) {
            mJudgeActivity = context as JudgeActivity
        }
    }


    //BUZZ
    private val buzzVote_pattern = longArrayOf(0, 200)
    private val buzzEnd_pattern = longArrayOf(0)

    //VOTE
    var votingPlayer = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _mBinding = FragmentDayBinding.inflate(layoutInflater)
        
        setHasOptionsMenu(true)


        //VOTE VIEW MODEL INIT
        mVoteViewModel = ViewModelProvider(mJudgeActivity).get(VoteViewModel::class.java)

        //VOTED ARRAY OBSERVE
        val mVotedArrayString1Observer = Observer<String>{mBinding.dayPl1VoteButton.text = it}
        val mVotedArrayString2Observer = Observer<String>{mBinding.dayPl2VoteButton.text = it}
        val mVotedArrayString3Observer = Observer<String>{mBinding.dayPl3VoteButton.text = it}
        val mVotedArrayString4Observer = Observer<String>{mBinding.dayPl4VoteButton.text = it}
        val mVotedArrayString5Observer = Observer<String>{mBinding.dayPl5VoteButton.text = it}
        val mVotedArrayString6Observer = Observer<String>{mBinding.dayPl6VoteButton.text = it}
        val mVotedArrayString7Observer = Observer<String>{mBinding.dayPl7VoteButton.text = it}
        val mVotedArrayString8Observer = Observer<String>{mBinding.dayPl8VoteButton.text = it}
        val mVotedArrayString9Observer = Observer<String>{mBinding.dayPl9VoteButton.text = it}
        val mVotedArrayString10Observer = Observer<String>{mBinding.dayPl10VoteButton.text = it}

        mVoteViewModel.mVotedArrayString1.observe(this, mVotedArrayString1Observer)
        mVoteViewModel.mVotedArrayString2.observe(this, mVotedArrayString2Observer)
        mVoteViewModel.mVotedArrayString3.observe(this, mVotedArrayString3Observer)
        mVoteViewModel.mVotedArrayString4.observe(this, mVotedArrayString4Observer)
        mVoteViewModel.mVotedArrayString5.observe(this, mVotedArrayString5Observer)
        mVoteViewModel.mVotedArrayString6.observe(this, mVotedArrayString6Observer)
        mVoteViewModel.mVotedArrayString7.observe(this, mVotedArrayString7Observer)
        mVoteViewModel.mVotedArrayString8.observe(this, mVotedArrayString8Observer)
        mVoteViewModel.mVotedArrayString9.observe(this, mVotedArrayString9Observer)
        mVoteViewModel.mVotedArrayString10.observe(this, mVotedArrayString10Observer)

        //choose player for vote
        mBinding.dayPl1VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl1VoteButton)
        }

        mBinding.dayPl2VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl2VoteButton)
        }

        mBinding.dayPl3VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl3VoteButton)
        }

        mBinding.dayPl4VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl4VoteButton)
        }

        mBinding.dayPl5VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl5VoteButton)
        }

        mBinding.dayPl6VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl6VoteButton)
        }

        mBinding.dayPl7VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl7VoteButton)
        }

        mBinding.dayPl8VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl8VoteButton)
        }

        mBinding.dayPl9VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl9VoteButton)
        }

        mBinding.dayPl10VoteButton.setOnClickListener {
            timerForVote(mBinding.dayPl10VoteButton)
        }

        //set vote result to table
        mBinding.dayResult0Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.ow)
                2 -> mBinding.dayCount2Button.setText(R.string.ow)
                3 -> mBinding.dayCount3Button.setText(R.string.ow)
                4 -> mBinding.dayCount4Button.setText(R.string.ow)
                5 -> mBinding.dayCount5Button.setText(R.string.ow)
                6 -> mBinding.dayCount6Button.setText(R.string.ow)
                7 -> mBinding.dayCount7Button.setText(R.string.ow)
                8 -> mBinding.dayCount8Button.setText(R.string.ow)
                9 -> mBinding.dayCount9Button.setText(R.string.ow)
                10 -> mBinding.dayCount10Button.setText(R.string.ow)
            }
        }

        mBinding.dayResult1Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.one)
                2 -> mBinding.dayCount2Button.setText(R.string.one)
                3 -> mBinding.dayCount3Button.setText(R.string.one)
                4 -> mBinding.dayCount4Button.setText(R.string.one)
                5 -> mBinding.dayCount5Button.setText(R.string.one)
                6 -> mBinding.dayCount6Button.setText(R.string.one)
                7 -> mBinding.dayCount7Button.setText(R.string.one)
                8 -> mBinding.dayCount8Button.setText(R.string.one)
                9 -> mBinding.dayCount9Button.setText(R.string.one)
                10 -> mBinding.dayCount10Button.setText(R.string.one)
            }
        }

        mBinding.dayResult2Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.two)
                2 -> mBinding.dayCount2Button.setText(R.string.two)
                3 -> mBinding.dayCount3Button.setText(R.string.two)
                4 -> mBinding.dayCount4Button.setText(R.string.two)
                5 -> mBinding.dayCount5Button.setText(R.string.two)
                6 -> mBinding.dayCount6Button.setText(R.string.two)
                7 -> mBinding.dayCount7Button.setText(R.string.two)
                8 -> mBinding.dayCount8Button.setText(R.string.two)
                9 -> mBinding.dayCount9Button.setText(R.string.two)
                10 -> mBinding.dayCount10Button.setText(R.string.two)
            }
        }

        mBinding.dayResult3Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.three)
                2 -> mBinding.dayCount2Button.setText(R.string.three)
                3 -> mBinding.dayCount3Button.setText(R.string.three)
                4 -> mBinding.dayCount4Button.setText(R.string.three)
                5 -> mBinding.dayCount5Button.setText(R.string.three)
                6 -> mBinding.dayCount6Button.setText(R.string.three)
                7 -> mBinding.dayCount7Button.setText(R.string.three)
                8 -> mBinding.dayCount8Button.setText(R.string.three)
                9 -> mBinding.dayCount9Button.setText(R.string.three)
                10 -> mBinding.dayCount10Button.setText(R.string.three)
            }
        }

        mBinding.dayResult4Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.four)
                2 -> mBinding.dayCount2Button.setText(R.string.four)
                3 -> mBinding.dayCount3Button.setText(R.string.four)
                4 -> mBinding.dayCount4Button.setText(R.string.four)
                5 -> mBinding.dayCount5Button.setText(R.string.four)
                6 -> mBinding.dayCount6Button.setText(R.string.four)
                7 -> mBinding.dayCount7Button.setText(R.string.four)
                8 -> mBinding.dayCount8Button.setText(R.string.four)
                9 -> mBinding.dayCount9Button.setText(R.string.four)
                10 -> mBinding.dayCount10Button.setText(R.string.four)
            }
        }

        mBinding.dayResult5Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.five)
                2 -> mBinding.dayCount2Button.setText(R.string.five)
                3 -> mBinding.dayCount3Button.setText(R.string.five)
                4 -> mBinding.dayCount4Button.setText(R.string.five)
                5 -> mBinding.dayCount5Button.setText(R.string.five)
                6 -> mBinding.dayCount6Button.setText(R.string.five)
                7 -> mBinding.dayCount7Button.setText(R.string.five)
                8 -> mBinding.dayCount8Button.setText(R.string.five)
                9 -> mBinding.dayCount9Button.setText(R.string.five)
                10 -> mBinding.dayCount10Button.setText(R.string.five)
            }
        }

        mBinding.dayResult6Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.six)
                2 -> mBinding.dayCount2Button.setText(R.string.six)
                3 -> mBinding.dayCount3Button.setText(R.string.six)
                4 -> mBinding.dayCount4Button.setText(R.string.six)
                5 -> mBinding.dayCount5Button.setText(R.string.six)
                6 -> mBinding.dayCount6Button.setText(R.string.six)
                7 -> mBinding.dayCount7Button.setText(R.string.six)
                8 -> mBinding.dayCount8Button.setText(R.string.six)
                9 -> mBinding.dayCount9Button.setText(R.string.six)
                10 -> mBinding.dayCount10Button.setText(R.string.six)
            }
        }

        mBinding.dayResult7Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.seven)
                2 -> mBinding.dayCount2Button.setText(R.string.seven)
                3 -> mBinding.dayCount3Button.setText(R.string.seven)
                4 -> mBinding.dayCount4Button.setText(R.string.seven)
                5 -> mBinding.dayCount5Button.setText(R.string.seven)
                6 -> mBinding.dayCount6Button.setText(R.string.seven)
                7 -> mBinding.dayCount7Button.setText(R.string.seven)
                8 -> mBinding.dayCount8Button.setText(R.string.seven)
                9 -> mBinding.dayCount9Button.setText(R.string.seven)
                10 -> mBinding.dayCount10Button.setText(R.string.seven)
            }
        }

        mBinding.dayResult8Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.eight)
                2 -> mBinding.dayCount2Button.setText(R.string.eight)
                3 -> mBinding.dayCount3Button.setText(R.string.eight)
                4 -> mBinding.dayCount4Button.setText(R.string.eight)
                5 -> mBinding.dayCount5Button.setText(R.string.eight)
                6 -> mBinding.dayCount6Button.setText(R.string.eight)
                7 -> mBinding.dayCount7Button.setText(R.string.eight)
                8 -> mBinding.dayCount8Button.setText(R.string.eight)
                9 -> mBinding.dayCount9Button.setText(R.string.eight)
                10 -> mBinding.dayCount10Button.setText(R.string.eight)
            }
        }

        mBinding.dayResult9Button.setOnClickListener {
            when (votingPlayer) {
                1 -> mBinding.dayCount1Button.setText(R.string.nine)
                2 -> mBinding.dayCount2Button.setText(R.string.nine)
                3 -> mBinding.dayCount3Button.setText(R.string.nine)
                4 -> mBinding.dayCount4Button.setText(R.string.nine)
                5 -> mBinding.dayCount5Button.setText(R.string.nine)
                6 -> mBinding.dayCount6Button.setText(R.string.nine)
                7 -> mBinding.dayCount7Button.setText(R.string.nine)
                8 -> mBinding.dayCount8Button.setText(R.string.nine)
                9 -> mBinding.dayCount9Button.setText(R.string.nine)
                10 -> mBinding.dayCount10Button.setText(R.string.nine)
            }
        }

        //day result table reset
        mBinding.dayCount1Button.setOnClickListener {
            mBinding.dayCount1Button.text = ""
        }

        mBinding.dayCount2Button.setOnClickListener {
            mBinding.dayCount2Button.text = ""
        }

        mBinding.dayCount3Button.setOnClickListener {
            mBinding.dayCount3Button.text = ""
        }

        mBinding.dayCount4Button.setOnClickListener {
            mBinding.dayCount4Button.text = ""
        }

        mBinding.dayCount5Button.setOnClickListener {
            mBinding.dayCount5Button.text = ""
        }

        mBinding.dayCount6Button.setOnClickListener {
            mBinding.dayCount6Button.text = ""
        }

        mBinding.dayCount7Button.setOnClickListener {
            mBinding.dayCount7Button.text = ""
        }

        mBinding.dayCount8Button.setOnClickListener {
            mBinding.dayCount8Button.text = ""
        }

        mBinding.dayCount9Button.setOnClickListener {
            mBinding.dayCount9Button.text = ""
        }

        mBinding.dayCount10Button.setOnClickListener {
            mBinding.dayCount10Button.text = ""
        }

        //RESET day
        mBinding.dayVoteResetButton.setOnClickListener {
            mVoteViewModel.resetThisShit()
            mBinding.dayCount1Button.text = ""
            mBinding.dayCount2Button.text = ""
            mBinding.dayCount3Button.text = ""
            mBinding.dayCount4Button.text = ""
            mBinding.dayCount5Button.text = ""
            mBinding.dayCount6Button.text = ""
            mBinding.dayCount7Button.text = ""
            mBinding.dayCount8Button.text = ""
            mBinding.dayCount9Button.text = ""
            mBinding.dayCount10Button.text = ""
        }


        return mBinding.root
    }



    //countDown timer for voting
    fun timerForVote(button: Button) {
        val timer = object : CountDownTimer(2000, 100) {
            override fun onTick(p0: Long) {
                button.setBackgroundResource(R.drawable.my_border_red)
                votingPlayer = 0
            }

            override fun onFinish() {
                button.setBackgroundResource(R.drawable.my_border_blue)
                when (button) {
                    mBinding.dayPl1VoteButton -> votingPlayer = 1
                    mBinding.dayPl2VoteButton -> votingPlayer = 2
                    mBinding.dayPl3VoteButton -> votingPlayer = 3
                    mBinding.dayPl4VoteButton -> votingPlayer = 4
                    mBinding.dayPl5VoteButton -> votingPlayer = 5
                    mBinding.dayPl6VoteButton -> votingPlayer = 6
                    mBinding.dayPl7VoteButton -> votingPlayer = 7
                    mBinding.dayPl8VoteButton -> votingPlayer = 8
                    mBinding.dayPl9VoteButton -> votingPlayer = 9
                    mBinding.dayPl10VoteButton -> votingPlayer = 10
                }
//                buzz(buzzVote_pattern)
//                buzz(buzzEnd_pattern)
            }
        }
        timer.start()
    }


//    private fun buzz(pattern: LongArray) {
//
//        val buzzer = activity?.getSystemService(Context.VIBRATOR_SERVICE)
//
//
//        buzzer.let {
//        }
//            if (Build.VERSION.SDK_INT >= 26) {
//                buzzer?.vibrate(VibrationEffect.createWaveform(pattern, -1))
//            } else {
//                buzzer?.vibrate(pattern, -1)
//            }
//        }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }

    companion object {
        fun newInstance() =
            DayFragment()
    }
}