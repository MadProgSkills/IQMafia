package ru.iqmafia.iqmafiaandroidapp.judge.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "common_rating_model")
data class CommonRatingModel(

    @PrimaryKey(autoGenerate = true)
    var playerId: Int,

    @ColumnInfo
    var games: Int = 0,
    @ColumnInfo
    var totalScore: Double = 0.0,
    @ColumnInfo
    var quality: Double = 0.000,
    @ColumnInfo
    var wins: Int = 0,
    @ColumnInfo
    var dops: Double = 0.00,

    @ColumnInfo
    var redCards: Int = 0,
    @ColumnInfo
    var redWins: Int = 0,
    @ColumnInfo
    var shCards: Int = 0,
    @ColumnInfo
    var shWins: Int = 0,
    @ColumnInfo
    var blCards: Int = 0,
    @ColumnInfo
    var blWins: Int = 0,
    @ColumnInfo
    var dnCards: Int = 0,
    @ColumnInfo
    var dnWins: Int = 0,

    @ColumnInfo
    var bm2: Int = 0,
    @ColumnInfo
    var mb3: Int = 0
)