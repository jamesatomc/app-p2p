package com.kanari.network.ui.screens.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanari.network.R


@Preview
@Composable
fun MessageCard() {
    (1 .. 100).forEach { _ ->
        Box(Modifier.padding(10.dp)) {
            Box(Modifier.clickable {  }) {
                Card(
                    Modifier.fillMaxWidth()
                ) {
                    Row(Modifier.padding(all = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.ic_launcher_foreground),
                            contentDescription = "",
                            Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)

                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text =
                                "james",
                                color = MaterialTheme.colorScheme.secondary,
                                style = MaterialTheme.typography.titleSmall,
                                fontSize = 18.sp
                            )
                            Text(text = "ข้อความ")
                        }
                    }
                }
            }
        }
    }
}






