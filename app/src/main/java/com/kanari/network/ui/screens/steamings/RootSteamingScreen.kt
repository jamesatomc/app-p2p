package com.kanari.network.ui.screens.steamings

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.kanari.network.R
import com.kanari.network.ui.navigation.CardPro
import com.kanari.network.ui.navigation.NavigationAppBar
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootSteamingScreen(navController: NavHostController) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold () {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet() {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        CardPro()
                        Column(
                            Modifier
                                .verticalScroll(rememberScrollState())
                                .padding(16.dp)
                        ) {
                            NavigationDrawerItem(
                                icon = { Icon(painter = painterResource(R.drawable.baseline_home_24), contentDescription = "") },
                                label = { Text(text = "Home") },
                                selected = false,
                                onClick = { /*TODO*/ })

                            NavigationDrawerItem(
                                icon = { Icon(painter = painterResource(R.drawable.baseline_home_24), contentDescription = "") },
                                label = { Text(text = "Home") },
                                selected = false,
                                onClick = { /*TODO*/ })

                            NavigationDrawerItem(
                                icon = { Icon(painter = painterResource(R.drawable.baseline_home_24), contentDescription = "") },
                                label = { Text(text = "Home") },
                                selected = false,
                                onClick = { /*TODO*/ })

                            NavigationDrawerItem(
                                icon = { Icon(painter = painterResource(R.drawable.baseline_home_24), contentDescription = "") },
                                label = { Text(text = "Home") },
                                selected = false,
                                onClick = { /*TODO*/ })

                            NavigationDrawerItem(
                                icon = { Icon(painter = painterResource(R.drawable.baseline_settings_24), contentDescription = "") },
                                label = { Text(text = "Setting") },
                                selected = false,
                                onClick = { /*TODO*/ })
                        }
                    }
                }
            }
        ) {
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
                        navigationIcon = {
                            Box(
                                Modifier
                                    .width(60.dp)
                                    .height(60.dp),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                IconButton(
                                    onClick = {
                                        scope.launch {
                                            drawerState.apply {
                                                if (isClosed) open() else close()
                                            }
                                        }
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
                    NavigationAppBar(navController)
                },
                content = {

                },
            )
        }
    }
}