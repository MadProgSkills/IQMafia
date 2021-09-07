package ru.iqmafia.iqmafiaandroidapp.judge.fragments.timer

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.*
import ru.iqmafia.iqmafiaandroidapp.R

class TimerViewModel(application: Application) : AndroidViewModel(application) {


    private val _mTimerRunningBool = MutableLiveData<Boolean>()
    val mTimerRunningBool: LiveData<Boolean>
        get() = _mTimerRunningBool


    private val _mPauseChronometerLong = MutableLiveData<Long>()
    val mPauseChronometerLong: LiveData<Long>
        get() = _mPauseChronometerLong

    private val _mStartPauseString = MutableLiveData<String>()
    val mStartPauseString: LiveData<String>
        get() = _mStartPauseString

    private val _mChronometerBackDrawable = MutableLiveData<Drawable>()
    val mChronometerBackDrawable: LiveData<Drawable>
        get() = _mChronometerBackDrawable

    private val _mOnPauseSystemTimeLong = MutableLiveData<Long>()
    val mOnPauseSystemTimeLong: LiveData<Long>
        get() = _mOnPauseSystemTimeLong


    init {
        _mTimerRunningBool.value = false
        _mPauseChronometerLong.value = 0L
        _mStartPauseString.value = "Start"
        _mChronometerBackDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_white )
        _mOnPauseSystemTimeLong.value = 0L
    }


    fun setChronometerBoolToTrue() {
        _mTimerRunningBool.value = true
        _mChronometerBackDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_yellow)
        _mStartPauseString.value = "Pause"
    }

    fun setChronometerBoolToFalse() {
        _mTimerRunningBool.value = false
        _mChronometerBackDrawable.value = AppCompatResources.getDrawable(getApplication(), R.drawable.my_border_white)
        _mStartPauseString.value = "Start"
    }


    fun setPauseLong(newValue: Long) {
        _mPauseChronometerLong.value = newValue
    }

    fun setOnPauseSystemTime(newValue: Long) {
        _mOnPauseSystemTimeLong.value = newValue
    }

}