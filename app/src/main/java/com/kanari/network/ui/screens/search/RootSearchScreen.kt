package com.kanari.network.ui.screens.search

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kanari.network.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RootSearchScreen(navController: NavHostController) {
    var text by remember {
        mutableStateOf("")
    }
    var active by remember { mutableStateOf(false) }
    val items = remember {
        mutableStateListOf(
            ""
        )
    }

    Scaffold {
        SearchBar(
            modifier = Modifier.fillMaxWidth(),
            query = text,
            onQueryChange = {
                text = it
            },
            onSearch = { active = false },
            active = active,
            onActiveChange = { active = it },
            placeholder = {Text(text = "Search")},
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription = "")
            },
            trailingIcon = { Icon(
                modifier = Modifier.clickable {
                    if (text.isNotEmpty()) {
                        text = ""
                    } else {
                        active = false
                    }
                },
                painter = painterResource(id = R.drawable.baseline_close_24),
                contentDescription = "")
            }
        ) {
           items.forEach { _ ->
               Row(
                  Modifier
                      .padding(20.dp)
               ) {
               }
           }
        }
    }
}