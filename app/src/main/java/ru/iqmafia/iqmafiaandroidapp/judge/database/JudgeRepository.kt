package ru.iqmafia.iqmafiaandroidapp.judge.database

import androidx.lifecycle.LiveData
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

interface JudgeRepository {
    val allPlayers: LiveData<List<CurrentGamePlayerModel>>
    suspend fun insertCurrentGamePlayer(player: CurrentGamePlayerModel, onSuccess: () -> Unit)


}