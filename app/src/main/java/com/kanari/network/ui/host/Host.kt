package com.kanari.network.ui.host

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kanari.network.ui.screens.chat.RootChatScreen
import com.kanari.network.ui.screens.home.RootHomeScreen
import com.kanari.network.ui.screens.notifications.RootNotifiScreen
import com.kanari.network.ui.screens.search.RootSearchScreen
import com.kanari.network.ui.screens.steamings.RootSteamingScreen

@Composable
fun Host(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "Home",
        Modifier.fillMaxSize()
    ) {
        composable( "Home") {
            RootHomeScreen(navController)
        }
        composable("Chat") {
            RootChatScreen(navController)
        }
        composable("Steaming") {
            RootSteamingScreen(navController)
        }
        composable("Not") {
            RootNotifiScreen(navController)
        }
        composable("Search") {
            RootSearchScreen(navController)
        }

    }
}