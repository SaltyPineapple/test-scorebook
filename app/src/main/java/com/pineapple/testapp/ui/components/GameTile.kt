package com.pineapple.testapp.ui.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.pineapple.testapp.models.Game
import com.pineapple.testapp.models.games
import com.pineapple.testapp.ui.theme.TestAppTheme
import com.pineapple.testapp.R

@Composable
fun GameTile(
    game: Game,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
            .background(Color.LightGray)
            .shadow(elevation = 1.dp, clip = false)
            .clickable(onClick = { onClick() })
            .shadow(2.dp)) {
        Box(modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()) {
            GameImage(
                imageUrl = game.imageUrl,
                contentDescription = "Game Image",
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            )
        }
        Text(text = game.title, maxLines = 1,)
        Text(text = game.numberPlayers.toString(), maxLines = 1,)
    }
}

@Composable
fun GameImage(
    imageUrl: Int,
    contentDescription: String?,
    modifier: Modifier = Modifier,
){
    Surface(
    color = Color.LightGray,
        shape = RectangleShape,
        modifier = modifier
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = contentDescription,
            placeholder = painterResource(imageUrl),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
fun GameTiles(
    gameCollection: List<Game>,
    modifier: Modifier = Modifier
){
    val context = LocalContext.current;
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 1.dp)
    ) {
       items(gameCollection) { game -> GameTile(game, { OpenGame(context, game) })}
    }
}

// navigate to game screen
private fun OpenGame(context: Context, game: Game){
    Toast.makeText(context, game.title, Toast.LENGTH_SHORT).show()
}


@Preview("Game Tile")
@Composable
fun GameTilePreview(){
    TestAppTheme {
        val game = games.first()
        GameTile(game = game, {})
    }
}

@Preview("Game Collection")
@Composable
fun GameTilesPreview(){
    TestAppTheme {
        val games = games
        GameTiles(gameCollection = games)
    }
}
