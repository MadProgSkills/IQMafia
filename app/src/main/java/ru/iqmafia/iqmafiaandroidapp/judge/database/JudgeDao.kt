package ru.iqmafia.iqmafiaandroidapp.judge.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.iqmafia.iqmafiaandroidapp.judge.models.CurrentGamePlayerModel

@Dao
interface JudgeDao {

    @Query("SELECT * FROM user_game_table_model")
    fun getAllCurrentGamePlayers(): LiveData<List<CurrentGamePlayerModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrentGamePlayer(currentGamePlayerModel: CurrentGamePlayerModel)

}