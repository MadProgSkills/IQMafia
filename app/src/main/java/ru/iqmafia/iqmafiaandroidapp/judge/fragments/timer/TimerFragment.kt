package ru.iqmafia.iqmafiaandroidapp.judge.fragments.timer

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Chronometer
import androidx.lifecycle.Observer
import ru.iqmafia.iqmafiaandroidapp.R
import ru.iqmafia.iqmafiaandroidapp.databinding.FragmentTimerBinding
import ru.iqmafia.iqmafiaandroidapp.judge.JudgeActivity

class TimerFragment : Fragment() {

    //TODO:: Таймер во время паузы не сбрасывается на ноль

    private var _mBinding: FragmentTimerBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var mStringStartPauseObserver: Observer<String>
    private lateinit var mDrawableObserver: Observer<Drawable>

    private var mTimerRunningBool: Boolean = false
    private var mPauseChronometerLong: Long = 0L
    private var mOnStopBool = false
    private var mOnPauseSystemTime = 0L

    private lateinit var mTimerViewModel: TimerViewModel
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
        _mBinding = FragmentTimerBinding.inflate(layoutInflater)
        mTimerViewModel = ViewModelProvider(mJudgeActivity).get(TimerViewModel::class.java)



        mStringStartPauseObserver = Observer<String> { mBinding.timerStartPauseButton.text = it }
        mTimerViewModel.mStartPauseString.observe(this, mStringStartPauseObserver)

        mDrawableObserver = Observer<Drawable> { mBinding.timerText.background = it }
        mTimerViewModel.mChronometerBackDrawable.observe(this, mDrawableObserver)

        mTimerRunningBool = mTimerViewModel.mTimerRunningBool.value!!
        mPauseChronometerLong = mTimerViewModel.mPauseChronometerLong.value!!



        //CHRONOMETER ONClick
        mBinding.timerText.setOnChronometerTickListener(Chronometer.OnChronometerTickListener { chronometer ->
            val elapsedMillis = SystemClock.elapsedRealtime() - chronometer.base
        })

        if (mTimerViewModel.mTimerRunningBool.value!! == true) {
            mBinding.timerText.setBase(SystemClock.elapsedRealtime() + mPauseChronometerLong)
            mBinding.timerText.start()
            mBinding.timerStartPauseButton.setText(R.string.pause)
        }



        mBinding.timerStartPauseButton.setOnClickListener {
            startPauseTimer()
        }

        mBinding.timerResetButton.setOnClickListener {
            resetTimer()
        }

        return mBinding.root
    }


    fun startPauseTimer() {

        mTimerRunningBool = mTimerViewModel.mTimerRunningBool.value!!
        mPauseChronometerLong = mTimerViewModel.mPauseChronometerLong.value!!


        if (mTimerRunningBool == false) {
            mTimerViewModel.setChronometerBoolToTrue()
            //mBinding.timerStartPauseButton.setText(R.string.pause)
            mBinding.timerText.setBase(SystemClock.elapsedRealtime() + mPauseChronometerLong)
            mBinding.timerText.start()

        } else {
            mTimerViewModel.setChronometerBoolToFalse()
            //mBinding.timerStartPauseButton.setText(R.string.start)

            mOnPauseSystemTime = SystemClock.elapsedRealtime()
            mPauseChronometerLong = mBinding.timerText.getBase() - mOnPauseSystemTime
            mBinding.timerText.stop()

            mTimerViewModel.setOnPauseSystemTime(mOnPauseSystemTime)
            mTimerViewModel.setPauseLong(mPauseChronometerLong)
        }
    }

    fun resetTimer() {

        mTimerViewModel.setPauseLong(0)

        mBinding.timerText.setBase(SystemClock.elapsedRealtime())
    }


    override fun onPause() {
        super.onPause()

        if (mTimerViewModel.mTimerRunningBool.value!! == false) {
            mBinding.timerText.stop()
        } else {
            mPauseChronometerLong = mBinding.timerText.getBase() - SystemClock.elapsedRealtime()
        }
        mTimerViewModel.setPauseLong(mPauseChronometerLong)
    }

    override fun onStop() {
        super.onStop()

        mTimerRunningBool = mTimerViewModel.mTimerRunningBool.value!!
        mPauseChronometerLong = mTimerViewModel.mPauseChronometerLong.value!!

        if (mTimerViewModel.mTimerRunningBool.value!! == true) {
            mBinding.timerText.setBase(SystemClock.elapsedRealtime() + mPauseChronometerLong)
            mBinding.timerText.start()
           // mBinding.timerStartPauseButton.setText(R.string.pause)
        } else if (mTimerViewModel.mTimerRunningBool.value!! == false) {
            mBinding.timerText.stop()
            mBinding.timerText.setBase(SystemClock.elapsedRealtime() + mPauseChronometerLong)
            //mBinding.timerStartPauseButton.setText(R.string.start)

        }
        mOnStopBool = true
    }


    override fun onResume() {
        super.onResume()

        if (mOnStopBool == false) {
            mTimerRunningBool = mTimerViewModel.mTimerRunningBool.value!!
            mPauseChronometerLong = mTimerViewModel.mPauseChronometerLong.value!!

            if (mTimerViewModel.mTimerRunningBool.value!! == true) {
                mBinding.timerText.setBase(SystemClock.elapsedRealtime() + mPauseChronometerLong)
                mBinding.timerText.start()
            } else if (mTimerViewModel.mTimerRunningBool.value!! == false) {
                mBinding.timerText.stop()
                mBinding.timerText.setBase(SystemClock.elapsedRealtime() + mPauseChronometerLong)
            }
        } else {
            mOnStopBool = false
        }
    }
    

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}