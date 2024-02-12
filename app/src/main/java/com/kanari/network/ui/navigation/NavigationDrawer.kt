package com.kanari.network.ui.navigation


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanari.network.R

@Preview
@Composable
fun CardPro() {
    Card (
        Modifier
            .fillMaxWidth()
            .height(190.dp)
            .padding(10.dp)
            .clickable {  }
    ){
        Column {
            Row (Modifier
                .padding(all = 8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "",
                    Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)

                )
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(text =
                    "james",
                        color = MaterialTheme.colorScheme.secondary,
                        style = MaterialTheme.typography.titleSmall,
                        fontSize = 24.sp
                    )
                    Text(text = "@jamsatoc")
                }
            }
            Spacer(Modifier.height(20.dp))
            Box {
                Row {
                    Spacer(
                        Modifier
                            .width(20.dp))
                    Text(
                        text = "0 Following",
                    )
                    Spacer(
                        Modifier.width(20.dp))
                    Text(
                        text = "1 Followers"
                    )
                }
            }
        }
    }
}
