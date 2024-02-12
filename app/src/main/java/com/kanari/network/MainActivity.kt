package com.kanari.network

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanari.network.ui.theme.KariP2PTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KariP2PTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }

    @Preview
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun Login() {
        Surface(
            Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(fraction = 0.30f),
                    Alignment.TopEnd,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shape), contentDescription = "",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds
                    )
                    Column(
                        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(horizontal = 20.dp, vertical = 50.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Kanari P2P", fontSize = 20.sp, color = Color.White)
                    }

                }
                Box(contentAlignment = Alignment.BottomCenter) {
                    Card(
                        Modifier.padding(horizontal = 10.dp).fillMaxWidth().height(500.dp),
                    ) {
                        Column(Modifier.verticalScroll(rememberScrollState())) {

                            val email = remember { mutableStateOf(TextFieldValue()) }
                            val pass = remember { mutableStateOf(TextFieldValue()) }

                            Text(text = "Login",  Modifier.padding(start = 20.dp, top = 20.dp), fontSize = 25.sp, fontFamily = FontFamily.Serif)
                            Spacer(modifier = Modifier.height(30.dp))
                            OutlinedTextField(
                                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                                value = email.value,
                                onValueChange = { email.value = it },
                                label = { Text("Email") })

                            Spacer(modifier = Modifier.height(10.dp))
                            OutlinedTextField(
                                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                                value = pass.value,
                                onValueChange = { pass.value = it },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                label = { Text("Password") })

                            TextButton(
                                onClick = { /*TODO*/ },
                                Modifier.padding(start = 10.dp)
                            ) {
                                Text(text = "Forgot Password?")
                            }
                            Box(modifier = Modifier) {

                                Column(Modifier.padding(horizontal = 40.dp)) {
                                    Button(
                                        onClick = {
                                            val navigate = Intent(this@MainActivity, RootActivity::class.java)
                                            startActivity(navigate)
                                    },
                                        modifier = Modifier.fillMaxWidth(),
                                        shape = RoundedCornerShape(10.dp),
                                    ) {
                                        Text("Login")
                                    }
                                    Spacer(
                                        modifier = Modifier.height(16.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        Arrangement.Center,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(text = "Don't have account?",fontSize = 14.sp)
                                        TextButton(
                                            onClick = {
                                                val navigate = Intent(this@MainActivity, RegisterActivity::class.java)
                                                startActivity(navigate)
                                            }
                                        ) {
                                            Text(text = "Register")
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}



