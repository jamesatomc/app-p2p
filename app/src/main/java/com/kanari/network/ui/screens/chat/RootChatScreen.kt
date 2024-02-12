package com.kanari.network.ui.screens.chat

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.navigation.NavHostController
import com.kanari.network.R
import com.kanari.network.ui.navigation.NavigationAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootChatScreen(navController: NavHostController) {
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
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    )
                    {

                        TextButton(
                            modifier = Modifier.width(300.dp),
                            onClick = {
                                navController.navigate("Search") {
                                }
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
        bottomBar = {
            NavigationAppBar(navController)
        },
        content = {
                  Column(
                      Modifier
                          .fillMaxSize()
                          .verticalScroll(rememberScrollState())
                          .padding(10.dp)
                  ) {
                      Spacer(Modifier.height(80.dp))
                      MessageCard()
                      Spacer(Modifier.height(60.dp))
                  }
        },
    )
}



