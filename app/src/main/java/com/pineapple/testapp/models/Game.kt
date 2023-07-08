package com.pineapple.testapp.models

import androidx.compose.runtime.Immutable
import com.pineapple.testapp.R

data class Game (val id: Int, val title: String, val numberPlayers: Int, val imageUrl: Int, val players: List<Player>)

/**
*   In reality, this function would call a data layer db call to get the games
*/
fun getGame(gameId: Int?): Game{
    return games.first { it.id == gameId }
}

fun createGame(title: String, numberPlayers: Int){
    val game = Game(id = games.size + 1, title = title, numberPlayers = numberPlayers, imageUrl = addGameImage(), players = createPlayers(numberPlayers))
    games.add(game)
}

/**
 * FUTURE TODO: make this grab a random image from the cool sports images
 */
fun addGameImage() : Int{
    return R.drawable.img_tabletennis
}


fun createPlayers(numberPlayers: Int) : List<Player>{
    var playerList = mutableListOf<Player>()
    var x = 0;
    while(x < numberPlayers){
        playerList.add(Player("Steve", 0))
        x++
    }
    return playerList
}

/**
 * Static Data
 * In reality, this list would be grabbed from the db
 */

val games = mutableListOf(
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