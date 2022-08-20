package ru.iqmafia.iqmafiaandroidapp.judge.screens.stats

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.iqmafia.iqmafiaandroidapp.judge.database.IqDatabase
import ru.iqmafia.iqmafiaandroidapp.judge.database.JudgeRoomRepository

class StatsViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application

    private val _blackTeam = MutableLiveData<List<Int>>()
    val blackTeam: LiveData<List<Int>> get() = _blackTeam
    private val _redTeam = MutableLiveData<List<Int>>()
    val redTeam: LiveData<List<Int>> get() = _redTeam
    private val _sheriff = MutableLiveData<Int>()
    val sheriff: LiveData<Int> get() = _sheriff
    private val _don = MutableLiveData<Int>()
    val don: LiveData<Int> get() = _don



//    private val mDDao = IqDatabase.getInstance(mContext).getDao()
//    private val mRepo = JudgeRoomRepository(mDDao)
//
//    val listCurrentGamePlayerModel = mRepo.allPlayers
}