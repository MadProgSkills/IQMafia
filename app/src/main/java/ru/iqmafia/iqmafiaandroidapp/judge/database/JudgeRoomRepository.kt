package ru.iqmafia.iqmafiaandroidapp.judge.database

import androidx.lifecycle.LiveData
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

class JudgeRoomRepository(private val judgeDao: JudgeDao): JudgeRepository {
    override val allPlayers: LiveData<List<CurrentGamePlayerModel>>
        get() = judgeDao.getAllCurrentGamePlayers()

    override suspend fun insertCurrentGamePlayer(
        player: CurrentGamePlayerModel,
    ) {
        judgeDao.insertCurrentGamePlayer(player)
    }

    override fun getAllCurrentGamePlayers(): LiveData<List<CurrentGamePlayerModel>> {
        TODO("Not yet implemented")
    }


}