package ru.iqmafia.iqmafiaandroidapp.judge.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user_game_table_model")
data class CurrentGamePlayerModel(


    @PrimaryKey()
    var slot: Int = 0,

    @ColumnInfo
    var name: String = "",

    @ColumnInfo
    var card: String = "rd",

    @ColumnInfo
    var win: String = "loose",

    @ColumnInfo
    var rating: Double = 0.00

): Serializable