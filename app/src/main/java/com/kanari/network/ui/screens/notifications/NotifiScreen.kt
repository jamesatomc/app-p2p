package com.kanari.network.ui.screens.notifications

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kanari.network.R
import com.kanari.network.ui.navigation.NavigationAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NotifiScreen(navController: NavHostController) {

    Scaffold(
        bottomBar = { NavigationAppBar(navController) }
    ) {
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
        ) {
            Nothui()
            Nothui()
        }
    }

}

@Preview
@Composable
fun Nothui(
) {
    Box(modifier = Modifier.fillMaxSize()){

            Card(
                Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {

                
                    Row {
                        Icon(
                            painter = painterResource(R.drawable.baseline_notifications_none_24),
                            contentDescription = null
                        )
                        Text(text = "jirradaspdadasdaa")
                    }

                
            }
            Spacer(modifier = Modifier.height(10.dp))
            TextButton(

                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),

                onClick = { /*TODO*/ }) {
                
            }

    }
}