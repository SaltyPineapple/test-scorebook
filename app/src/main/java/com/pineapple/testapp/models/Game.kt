package com.pineapple.testapp.models

import androidx.compose.runtime.Immutable
import com.pineapple.testapp.R

data class Game (val id: Int, val title: String, val numberPlayers: Int, val imageUrl: Int)

/**
 * Static Data
 */

val games = listOf(
    Game(
        id = 1,
        title = "Game 1",
        numberPlayers = 4,
        imageUrl = R.drawable.img_badminton
    ),
    Game(
        id = 2,
        title = "Game 2",
        numberPlayers = 5,
        imageUrl = R.drawable.img_baseball
    ),
    Game(
        id = 3,
        title = "Game 3",
        numberPlayers = 1,
        imageUrl = R.drawable.img_running
    ),
    Game(
        id = 4,
        title = "Game 4",
        numberPlayers = 3,
        imageUrl = R.drawable.img_tabletennis
    ),
    Game(
        id = 5,
        title = "Game 5",
        numberPlayers = 4,
        imageUrl = R.drawable.img_cycling
    ),
    Game(
        id = 6,
        title = "Game 6",
        numberPlayers = 4,
        imageUrl = R.drawable.img_soccer
    ),
    Game(
        id = 7,
        title = "Game 7",
        numberPlayers = 4,
        imageUrl = R.drawable.img_golf
    ),
)