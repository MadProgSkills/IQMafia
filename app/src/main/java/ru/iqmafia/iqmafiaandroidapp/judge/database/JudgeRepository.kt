package ru.iqmafia.iqmafiaandroidapp.judge.database

import androidx.lifecycle.LiveData
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

interface JudgeRepository: JudgeDao {
    val allPlayers: LiveData<List<CurrentGamePlayerModel>>
    override suspend fun insertCurrentGamePlayer(player: CurrentGamePlayerModel)
}