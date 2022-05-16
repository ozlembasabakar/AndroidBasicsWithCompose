package com.example.androidbasicswithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    AppCard(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.CenterHorizontally),
                        full_name = stringResource(id = R.string.full_name),
                        title = stringResource(id = R.string.title),
                        stringResource(id = R.string.email),
                        stringResource(id = R.string.github),
                        stringResource(id = R.string.linkedin),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Composable
fun InfoCardText(text: String, fontWeight: FontWeight) {
    Text(
        text = text, modifier = Modifier
            .padding(
                start = 16.dp,
                bottom = 8.dp
            ),
        fontWeight = fontWeight
    )
}

@Composable
fun InfoCard(
    mail: String,
    github_link: String,
    linkedin_link: String,
    modifier: Modifier,
    fontWeight: FontWeight
) {
    val email = painterResource(id = R.drawable.ic_baseline_email_24)
    val github = painterResource(id = R.drawable.github_svgrepo_com)
    val linkedin = painterResource(id = R.drawable.linkedin_logo_svgrepo_com)

    Column(modifier = modifier)
    {
        Row {
            Image(painter = email, contentDescription = "")
            InfoCardText(mail, fontWeight)
        }

        Row {
            Image(painter = github, contentDescription = "")
            InfoCardText(github_link, fontWeight)
        }

        Row {
            Image(painter = linkedin, contentDescription = "")
            InfoCardText(linkedin_link, fontWeight)
        }
    }

}


@Composable
fun LogoCardImage(modifier: Modifier) {
    val image = painterResource(id = R.drawable.logo_photo)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .padding(top = 90.dp)
    )
}

@Composable
fun LogoCardInfo(full_name: String, title: String, modifier: Modifier, fontWeight: FontWeight) {
    Column {
        Text(
            text = full_name,
            modifier = modifier
                .padding(top = 36.dp),
            fontSize = 36.sp,
            fontWeight = fontWeight
        )
        Text(
            text = title,
            modifier = modifier
                .padding(top = 4.dp, bottom = 64.dp),
            fontWeight = fontWeight
        )
    }
}

@Composable
fun AppCard(
    modifier: Modifier,
    full_name: String,
    title: String,
    mail: String,
    github_link: String,
    linkedin_link: String,
    fontWeight: FontWeight
) {
    Column {
        LogoCardImage(
            modifier
        )
        LogoCardInfo(
            full_name,
            title,
            modifier,
            fontWeight
        )

        InfoCard(mail, github_link, linkedin_link, modifier, fontWeight)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidBasicsWithComposeTheme {
        AppCard(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally),
            full_name = stringResource(id = R.string.full_name),
            title = stringResource(id = R.string.title),
            stringResource(id = R.string.email),
            stringResource(id = R.string.github),
            stringResource(id = R.string.linkedin),
            fontWeight = FontWeight.Bold

        )
    }
}
