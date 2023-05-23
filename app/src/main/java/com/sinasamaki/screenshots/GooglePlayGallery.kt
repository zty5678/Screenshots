package com.sinasamaki.screenshots

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sinasamaki.screenshots.ui.theme.ScreenshotsTheme

@Composable
@Preview
fun previewTheme() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(x = 10.dp, y = 30.dp)
                .size(200.dp)
                .background(color = MaterialTheme.colors.secondary, shape = CircleShape)
        )
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 40.dp, y = 140.dp)
                .size(50.dp)
                .background(color = MaterialTheme.colors.primary, shape = CircleShape)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Text(
                text = "Light or Dark",
                textAlign = TextAlign.Center,
                fontSize = 48.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 94.dp)
            )

            val config = LocalConfiguration.current

            Row(
                modifier = Modifier
                    .requiredWidth(config.screenWidthDp.dp * 2)
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(config.screenWidthDp.dp)
                        .padding(horizontal = 30.dp)
                        .shadow(elevation = 18.dp, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Green)
                ) {
                    ScreenshotsTheme(darkTheme = false) {
                        App()
                    }

                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(config.screenWidthDp.dp)
                        .padding(horizontal = 30.dp)
                        .shadow(elevation = 18.dp, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Green)
                ) {
                    ScreenshotsTheme(darkTheme = true) {
                        App()
                    }

                }
            }
        }
    }
}

@Composable
@Preview
fun previewSubTitle() {

    ScreenshotsTheme {
        Box(
            Modifier
                .background(Color.White)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(x = 10.dp, y = 30.dp)
                    .size(200.dp)
                    .background(color = MaterialTheme.colors.secondary, shape = CircleShape)
            )
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .offset(x = (-40).dp, y = (-130).dp)
                    .size(50.dp)
                    .background(color = MaterialTheme.colors.primary, shape = CircleShape)
            )
            Column(
                modifier = Modifier
                    .verticalScroll(state = rememberScrollState(), reverseScrolling = true)
                    .fillMaxSize()
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(800.dp)
                        .padding(horizontal = 30.dp)
                        .shadow(elevation = 18.dp, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                ) {
                    App()
                }

                Text(
                    text = "Manage tasks",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 94.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun previewTitle() {

    ScreenshotsTheme {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {

            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 10.dp, y = 30.dp)
                    .size(200.dp)
                    .background(color = MaterialTheme.colors.secondary, shape = CircleShape)
            )
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 40.dp, y = 130.dp)
                    .size(50.dp)
                    .background(color = MaterialTheme.colors.primary, shape = CircleShape)
            )
            Column(
                modifier = Modifier
                    .verticalScroll(state = rememberScrollState(), reverseScrolling = false)
                    .fillMaxSize()
            ) {

                Text(
                    text = "Tasks app",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 94.dp)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(640.dp)
                        .padding(horizontal = 30.dp)
                        .shadow(elevation = 18.dp, shape = RoundedCornerShape(10.dp))
                        .clip(RoundedCornerShape(10.dp))
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
@Preview
fun previewMainApp() {
    ScreenshotsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .shadow(elevation = 18.dp, shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
        ) {
            App()
        }
    }
}