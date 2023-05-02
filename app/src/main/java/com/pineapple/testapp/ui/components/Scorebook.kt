package com.pineapple.testapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pineapple.testapp.models.Game
import com.pineapple.testapp.models.games
import com.pineapple.testapp.ui.theme.TestAppShapes

@Composable
fun Scorebook(game: Game){
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 1.dp)
    ) {
        items(game.numberPlayers) { game -> PlayerCard(3,  {}, {}) }
    }

}

@Composable
fun PlayerCard(
    score: Int,
    incrementScore: () -> Unit,
    decrementScore: () -> Unit,
){
    Row(
        modifier = Modifier
            .background(color = Color.White)
            .padding(vertical = 5.dp)) {
        ScoreButton(adjustScore = decrementScore, icon = Icons.Default.Delete)
        Box(modifier = Modifier
            .padding(40.dp, 10.dp)
        ){
            Text(text = score.toString(), textAlign = TextAlign.Center)
        }
        ScoreButton(adjustScore = incrementScore, icon = Icons.Default.Add)
    }
}

@Composable
fun ScoreButton(adjustScore: () -> Unit, icon: ImageVector){
    Surface(
        modifier = Modifier
            .clickable(
                onClick = adjustScore,
            )
            .border(width = 0.5.dp, color = Color.Blue)
            .height(80.dp)
            .width(30.dp),
        shape = TestAppShapes.large
    ){
        Icon(
            imageVector = icon,
            contentDescription = "score adjustment button",
        )
    }

}

@Preview("Add Score Button")
@Composable
fun ScoreButtonAddPreview(){
    ScoreButton({}, icon = Icons.Default.Add)
}

@Preview("Remove Score Button")
@Composable
fun ScoreButtonRemovePreview(){
    ScoreButton({}, icon = Icons.Default.Delete)
}

@Preview
@Composable
fun PlayerCardPreview(){
    PlayerCard(5, {}, {})
}

@Preview
@Composable
fun ScorebookPreview(){
    Scorebook(game = games[0])
}