package com.example.androidbasicswithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidbasicswithcompose.ui.theme.AndroidBasicsWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBasicsWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeCard()
                }
            }
        }
    }
}

@Composable
fun ComposeCard() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = androidx.compose.ui.graphics.Color.Green)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.title_up_left),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)

                )
                Text(
                    text = stringResource(id = R.string.text_up_left),
                    textAlign = TextAlign.Justify
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = androidx.compose.ui.graphics.Color.Yellow)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.title_up_right),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)

                )
                Text(
                    text = stringResource(id = R.string.text_up_right),
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(Modifier.weight(1f)) {

        Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = androidx.compose.ui.graphics.Color.Cyan)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.title_down_left),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)

                )
                Text(
                    text = stringResource(id = R.string.text_down_left),
                    textAlign = TextAlign.Justify
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = androidx.compose.ui.graphics.Color.Gray)
                    .padding(16.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.title_down_right),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)

                )
                Text(
                    text = stringResource(id = R.string.text_down_right),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}





@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidBasicsWithComposeTheme {
        ComposeCard()
    }
}