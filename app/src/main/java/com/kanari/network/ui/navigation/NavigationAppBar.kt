package com.kanari.network.ui.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kanari.network.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationAppBar(navController: NavHostController) {


    NavigationBar(
        Modifier
            .padding(12.dp)
            .clip(RoundedCornerShape(40.dp))
            .height(60.dp)

    ) {
        NavigationBarItem(
            // The icon resource
            icon = {
                Icon(
                    painterResource(id = R.drawable.baseline_sort_24),
                    contentDescription = "Feed"
                )
            },
            selected =  navController.currentDestination?.route == "Home",
            onClick = {
                navController.navigate("Home")
            },
            )
        NavigationBarItem(
            // The icon resource
            icon = {
                Icon(
                    painterResource(id = R.drawable.baseline_chat_bubble_outline_24),
                    contentDescription = "Chat"
                )
            },
            selected =  navController.currentDestination?.route == "Chat",
            onClick = {
                navController.navigate("Chat") {

                }
            },
        )
        NavigationBarItem(
            // The icon resource
            icon = {
                Icon(
                    painterResource(id = R.drawable.baseline_podcasts_24),
                    contentDescription = "Steam"
                )
            },
            selected = navController.currentDestination?.route == "Steaming",
            onClick = {
                navController.navigate("Steaming") {
                }
            },
        )
        NavigationBarItem(
            // The icon resource
            icon = {
                Icon(
                    painterResource(id = R.drawable.baseline_notifications_none_24),
                    contentDescription = "Notificat"
                )
            },
            selected = navController.currentDestination?.route == "Not",
            onClick = {
                navController.navigate("Not") {
                }
            },
        )
    }
}




