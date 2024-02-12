package com.kanari.network.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanari.network.R
import com.kanari.network.ui.navigation.NavigationAppBar
import com.kanari.network.ui.screens.home.HomeScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Relay(){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(
            Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
    topBar = {
        CenterAlignedTopAppBar(
            scrollBehavior = scrollBehavior,
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
            ),
            modifier = Modifier
                .padding(10.dp)
                .clip(
                    RoundedCornerShape(20.dp)
                ),
            title = {
                Box(
                    Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {

                    TextButton(onClick = {

                    }) {
                        Row {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_search_24),
                                contentDescription = "",
                                modifier = Modifier.size(25.dp)
                            )
                            Text(
                                text = "Search",
                                fontSize = 18.sp
                            )
                        }
                    }
                }
            },
            navigationIcon = {
                Box(
                    Modifier
                        .width(60.dp)
                        .height(60.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description",
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                }
            },
            actions = {
                Box(
                    Modifier
                        .width(60.dp)
                        .height(60.dp),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.baseline_south_america_24),
                            contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            }
        )
    },
    floatingActionButton = {
        FloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "Add")
        }
    },
    bottomBar = {

    },
    content = {

        HomeScreen()

    },
    )
}


