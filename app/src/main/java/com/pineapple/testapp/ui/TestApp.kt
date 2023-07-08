package com.pineapple.testapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pineapple.testapp.models.games
import com.pineapple.testapp.ui.components.BottomNavBar
import com.pineapple.testapp.ui.components.GameTiles
import com.pineapple.testapp.ui.components.TestAppScaffold
import com.pineapple.testapp.ui.theme.TestAppTheme

@Composable
fun TestApp(){
    TestAppTheme {
        var currentScreen: TestDestination by remember { mutableStateOf(HomeScreen) }
        val navController = rememberNavController()
        TestAppScaffold(
            bottomBar = {
                BottomNavBar(
                    allScreens = testRowScreens,
                    onTabSelected = { screen -> currentScreen = screen },
                    currentScreen = currentScreen)
            }
        ) { innerPadding ->
            NavHost(navController = navController,
            startDestination = HomeScreen.route,
            modifier = Modifier.padding(innerPadding)) {
                composable(route = HomeScreen.route){
                    HomeScreen.screen
                }
                composable(route = DiceScreen.route){
                    DiceScreen.screen
                }
            }
            GameTiles(gameCollection = games)
        }

    }
}