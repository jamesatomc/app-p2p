package com.kanari.network.ui.screens.chat

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.kanari.network.R


@Preview
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserChat() {
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
                    .height(60.dp),


                navigationIcon = {
                    Box(
                        Modifier
                            .width(60.dp)
                            .height(60.dp),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painter = painterResource(R.drawable.baseline_arrow_back_24),
                                contentDescription = "",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                },
                title = {
                    Box(
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    )
                    {

                        TextButton(
                            modifier = Modifier.width(300.dp),
                            onClick = {

                            }) {
                            Row {
                                Text(
                                    text = "usernames",
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
                                painter = painterResource(R.drawable.baseline_error_outline_24),
                                contentDescription = "",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
            )
        },
//        bottomBar = {
//            NavigationBar {
//
//            }
//        }
    ) {


    }
}






