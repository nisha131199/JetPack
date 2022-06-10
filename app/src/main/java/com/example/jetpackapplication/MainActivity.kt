package com.example.jetpackapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.graphicsLayer
import com.example.jetpackapplication.ui.theme.JetPackApplicationTheme
import com.example.jetpackapplication.ui.theme.Purple200
import com.example.jetpackapplication.ui.theme.Teal700
import com.example.jetpackapplication.ui.theme.White

class MainActivity : AppCompatActivity()

@Preview
@Composable
fun DefaultPreview() {
    JetPackApplicationTheme {
        Row(modifier = Modifier
            .padding(all = 4.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = White, shape = RectangleShape),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
                    .fillMaxWidth()
            )

            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Message("Hello Jetpack")
                Spacer(modifier = Modifier.height(10.dp))
                Message("Charlie")
            }
        }
    }
}

@Preview
@Composable
fun SplashScreen() {
    JetPackApplicationTheme {
        Row (modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column (verticalArrangement = Arrangement.spacedBy((-100).dp)) {
                Circle()
                Title()
            }
        }
    }
}

@Preview
@Composable
fun Profile() {
    JetPackApplicationTheme {
        Row (modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column (
                modifier = Modifier
                    .background(White)
                    .border(width = 5.dp, color = Teal700, RoundedCornerShape(100.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(all = 5.dp)
                        .border(width = 5.dp, color = White, RoundedCornerShape(100.dp))
                        .size(100.dp)
                        .graphicsLayer {
                            shape = RoundedCornerShape(100.dp)
                            clip = true
                        }
                        .background(color = Color.Transparent)
                )
            }
        }
    }
}

@Composable
fun Message(name: String) {
    Text(
        text = "$name!",
        color = Purple200,
        fontSize = 30.sp,
        maxLines = 1,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Circle() {
    Box(
        modifier = Modifier
            .border(width = 4.dp, color = Teal700, RoundedCornerShape(100.dp))
            .size(100.dp)
            .graphicsLayer {
                CutCornerShape(32.dp)
                clip = true
            }
            .background(color = Color.Transparent),
    )
}

@Composable
fun Title() {
    Text(
        fontSize = 60.sp,
        text = "r o w n d",
        color = Teal700,
        style = typography.body1
    )
}

private val fontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.comfortaa_bold,
            weight = FontWeight.W900,
            style = FontStyle.Normal
        )
    )
)

private val defaultTypography = Typography()
val typography = Typography(
    h1 = defaultTypography.h1.copy(fontFamily = fontFamily),
    subtitle1 = defaultTypography.subtitle1.copy(fontFamily = fontFamily),
    body1 = defaultTypography.body1.copy(fontFamily = fontFamily)
)
