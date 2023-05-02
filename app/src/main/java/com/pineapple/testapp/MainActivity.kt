package com.pineapple.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pineapple.testapp.models.games
import com.pineapple.testapp.ui.TestApp
import com.pineapple.testapp.ui.components.GameTiles
import com.pineapple.testapp.ui.components.LandingScreen
import com.pineapple.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var showLandingScreen by remember { mutableStateOf(true) }
            if (showLandingScreen){
                LandingScreen(onTimeout = {showLandingScreen = false})
            }
            else {
                TestApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestApp()
}