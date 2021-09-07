package ru.iqmafia.iqmafiaandroidapp.judge.screens.stats

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ru.iqmafia.iqmafiaandroidapp.judge.database.IqDatabase
import ru.iqmafia.iqmafiaandroidapp.judge.database.JudgeRoomRepository

class StatsFragmentViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application
    private val mDDao = IqDatabase.getInstance(mContext).getDao()
    private val mRepo = JudgeRoomRepository(mDDao)

    val listCurrentGamePlayerModel = mRepo.allPlayers
}