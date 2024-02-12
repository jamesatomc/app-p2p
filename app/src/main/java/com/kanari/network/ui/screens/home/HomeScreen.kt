package com.kanari.network.ui.screens.home


import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanari.network.R

@Preview
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {

   Column(
       Modifier
           .fillMaxSize()
           .verticalScroll(rememberScrollState())
           .padding(10.dp)
    ) {
       Spacer(Modifier.height(80.dp))
           Card()
       Spacer(Modifier.height(80.dp))
    }
}


@Composable
fun Card() {

    Column() {
        (1 .. 5).forEach { _ ->
            Card(
                Modifier
                    .height(400.dp)

                    .clip(RoundedCornerShape(20.dp))
            ) {
                Column {
                    Column {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(all = 8.dp),
                                 Arrangement.SpaceBetween
                        ) {
                            Box (Modifier.clickable {  }) {
                                Row {
                                    Image(
                                        painter = painterResource(R.drawable.ic_launcher_foreground),
                                        contentDescription = "",
                                        Modifier
                                            .size(50.dp)
                                            .clip(CircleShape)
                                            .border(
                                                1.dp,
                                                MaterialTheme.colorScheme.primary,
                                                CircleShape
                                            )
                                    )
                                    Spacer(
                                        Modifier
                                            .width(10.dp)
                                    )
                                    Column {
                                        Text(
                                            text =
                                            "james",
                                            color = MaterialTheme.colorScheme.secondary,
                                            style = MaterialTheme.typography.titleSmall,
                                            fontSize = 18.sp
                                        )
                                        Text(text = "@jiraphon")
                                    }
                                }
                            }
                            Box(
                                Modifier,
                                Alignment.CenterEnd
                            ) {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        painter = painterResource(R.drawable.baseline_south_america_24),
                                        contentDescription = "",
                                        modifier = Modifier.size(40.dp)
                                    )
                                }
                            }

                        }
                        Box(
                            Modifier
                                .height(300.dp)
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        Row {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_mode_comment_24),
                                    contentDescription = ""
                                )

                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_repeat_24),
                                    contentDescription = ""
                                )

                            }

                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_favorite_border_24),
                                    contentDescription = ""
                                )
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(20.dp))
        }
    }
}

