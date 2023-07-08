package com.pineapple.testapp.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.twotone.Build
import androidx.compose.material.icons.twotone.Create
import androidx.compose.material.icons.twotone.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.pineapple.testapp.models.games
import com.pineapple.testapp.ui.components.GameTiles
import com.pineapple.testapp.ui.components.Scorebook

interface TestDestination {
    val text: String
    val icon: ImageVector
    val route: String
    val screen: @Composable () -> Unit
}

object HomeScreen: TestDestination {
    override val text = "All Games"
    override val icon = Icons.TwoTone.Home
    override val route = "HomeScreen"
    override val screen: @Composable () -> Unit = { GameTiles(gameCollection = games) }
}

object DiceScreen: TestDestination {
    override val text = "Roll Dice"
    override val icon = Icons.TwoTone.Build
    override val route = "DiceScreen"
    override val screen: () -> Unit
        get() = TODO("Not yet implemented")
}

object CurrentGameScreen: TestDestination {
    override val text = "Scorebook"
    override val icon = Icons.TwoTone.Create
    override val route = "CurrentGameScreen"
    override val screen: @Composable () -> Unit = { Scorebook()}
    const val selectedGame = "game_id"
}

val testRowScreens = listOf(HomeScreen, CurrentGameScreen, DiceScreen)