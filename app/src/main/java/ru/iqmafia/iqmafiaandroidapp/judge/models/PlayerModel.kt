package ru.iqmafia.iqmafiaandroidapp.judge.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "player_model")
data class PlayerModel(
    @PrimaryKey(autoGenerate = true)
    var playerId: Int,

    var playerVkId: String,
    var playerNick: String,
    var playerRealName: String
)