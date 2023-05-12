package com.pineapple.testapp.models

import androidx.compose.runtime.Immutable
import com.pineapple.testapp.R

data class Game (val id: Int, val title: String, val numberPlayers: Int, val imageUrl: Int, val players: List<Player>)

/**
 * Static Data
 */

val games = listOf(
    Game(
        id = 1,
        title = "Game 1",
        numberPlayers = 4,
        imageUrl = R.drawable.img_badminton,
        players = listOf(
            Player("Jerry", 0),
            Player("Bill", 0),
            Player("John", 0),
            Player("Manny", 0),
        )
    ),
    Game(
        id = 2,
        title = "Game 2",
        numberPlayers = 5,
        imageUrl = R.drawable.img_baseball,
        players = listOf(
            Player("Jerry", 0),
            Player("Bill", 0),
            Player("John", 0),
            Player("Manny", 0),
            Player("Frank", 0),
        )
    ),
    Game(
        id = 3,
        title = "Game 3",
        numberPlayers = 1,
        imageUrl = R.drawable.img_running,
        players = listOf(
            Player("Jerry", 0)
        )
    ),
    Game(
        id = 4,
        title = "Game 4",
        numberPlayers = 3,
        imageUrl = R.drawable.img_tabletennis,
        players = listOf(
            Player("Jerry", 0),
            Player("Bill", 0),
            Player("John", 0),
        )
    ),
    Game(
        id = 5,
        title = "Game 5",
        numberPlayers = 4,
        imageUrl = R.drawable.img_cycling,
        players = listOf(
            Player("Jerry", 0),
            Player("Bill", 0),
            Player("John", 0),
            Player("Manny", 0),
        )
    ),
    Game(
        id = 6,
        title = "Game 6",
        numberPlayers = 4,
        imageUrl = R.drawable.img_soccer,
        players = listOf(
            Player("Jerry", 0),
            Player("Bill", 0),
            Player("John", 0),
            Player("Manny", 0),
        )
    ),
    Game(
        id = 7,
        title = "Game 7",
        numberPlayers = 4,
        imageUrl = R.drawable.img_golf,
        players = listOf(
            Player("Jerry", 0),
            Player("Bill", 0),
            Player("John", 0),
            Player("Manny", 0),
        )
    ),
)