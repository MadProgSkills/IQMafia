package ru.iqmafia.iqmafiaandroidapp.judge.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "all_games_model")
data class AllGamesModel(
    @PrimaryKey(autoGenerate = true)
    var gameId: Int,

    var player1_score: Double = 0.0,
    var player1_name: String = "",
    var player1_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player1_win: Boolean = false,
    var player1_best_move: Int = 0,

    var player2_score: Double = 0.0,
    var player2_name: String = "",
    var player2_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player2_win: Boolean = false,
    var player2_best_move: Int = 0,

    var player3_score: Double = 0.0,
    var player3_name: String = "",
    var player3_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player3_win: Boolean,
    var player3_best_move: Int = 0,


    var player4_score: Double = 0.0,
    var player4_name: String = "",
    var player4_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player4_win: Boolean,
    var player4_best_move: Int = 0,

    var player5_score: Double = 0.0,
    var player5_name: String = "",
    var player5_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player5_win: Boolean = false,
    var player5_best_move: Int = 0,

    var player6_score: Double = 0.0,
    var player6_name: String = "",
    var player6_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player6_win: Boolean = false,
    var player6_best_move: Int = 0,


    var player7_score: Double = 0.0,
    var player7_name: String = "",
    var player7_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player7_win: Boolean = false,
    var player7_best_move: Int = 0,

    var player8_score: Double = 0.0,
    var player8_name: String = "",
    var player8_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player8_win: Boolean = false,
    var player8_best_move: Int = 0,

    var player9_score: Double = 0.0,
    var player9_name: String = "",
    var player9_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player9_win: Boolean = false,
    var player9_best_move: Int = 0,


    var player10_score: Double = 0.0,
    var player10_name: String = "",
    var player10_card: String = "", //rd - red, sh - sheriff, bl - black, dn - don
    var player10_win: Boolean = false,
    var player10_best_move: Int = 0


)