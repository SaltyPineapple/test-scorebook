package com.pineapple.testapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pineapple.testapp.models.games
import com.pineapple.testapp.ui.components.GameTiles
import com.pineapple.testapp.ui.components.TestAppScaffold
import com.pineapple.testapp.ui.theme.TestAppTheme

@Composable
fun TestApp(){
    TestAppTheme {
        TestAppScaffold() {
            GameTiles(gameCollection = games)
        }

    }
}