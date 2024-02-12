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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.kanari.network.ui.theme.KariP2PTheme
import com.kanari.network.viewmodel.RegisterState
import com.kanari.network.viewmodel.RegisterViewModel

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KariP2PTheme {
              Surface(
                  modifier = Modifier.fillMaxSize(),
                  color = MaterialTheme.colorScheme.background
              ) {
                  Register()
              }
            }
        }
    }


    //Register
    @Preview
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun Register() {
        val viewModel = hiltViewModel<RegisterViewModel>()
        // Observe the state
        Surface(
            Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(fraction = 0.30f),
                    Alignment.TopEnd,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shape), contentDescription = "",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(horizontal = 20.dp, vertical = 50.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Kanari P2P", fontSize = 20.sp, color = Color.White)
                    }

                }
                Box(contentAlignment = Alignment.BottomCenter) {
                    Card(
                        Modifier
                            .padding(horizontal = 10.dp)
                            .fillMaxWidth()
                            .height(550.dp),
                    ) {
                        Column {

                            val username = remember { mutableStateOf(TextFieldValue()) }
                            val email = remember { mutableStateOf(TextFieldValue()) }
                            val pass  = remember { mutableStateOf(TextFieldValue()) }
                            val pass2  = remember { mutableStateOf(TextFieldValue()) }


                            Text(text = "Register",  Modifier.padding(start = 20.dp, top = 20.dp), fontSize = 25.sp, fontFamily = FontFamily.Serif)
                            Spacer(modifier = Modifier.height(30.dp))
                            OutlinedTextField(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 20.dp, end = 20.dp),
                                value = username.value,
                                onValueChange = { username.value = it },
                                label = { Text("Username") }
                            )
                            OutlinedTextField(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 20.dp, end = 20.dp),
                                value = email.value,
                                onValueChange = { email.value = it },
                                label = { Text("Email") }
                            )
                            OutlinedTextField(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 20.dp, end = 20.dp),
                                value = pass.value,
                                onValueChange = {pass.value = it },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                label = { Text("Password") }
                            )
                            OutlinedTextField(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 20.dp, end = 20.dp),
                                value = pass2.value,
                                onValueChange = {pass2.value = it },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                label = { Text("Password") }
                            )
                            TextButton(onClick = { /*TODO*/ }, Modifier.padding(start = 10.dp)) {
                                Text(text = "Forgot Password?")
                            }
                            Box(modifier = Modifier) {

                                Column(Modifier.padding(horizontal = 40.dp)) {
                                    Button(
                                        onClick = {

                                        },
                                        modifier = Modifier.fillMaxWidth(),
                                        shape = RoundedCornerShape(10.dp),
                                    ) {
                                        Text("Register")
                                    }
                                    Spacer(modifier = Modifier.height(16.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        Arrangement.Center,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(text = "account?",fontSize = 14.sp)
                                        TextButton(
                                            onClick = {
//                                                 code ต่อกับ api
                                                    val username = username.value.text
                                                    val email = email.value.text
                                                    val password = pass.value.text
                                                    viewModel.register(username, password, email)
                                                val navigate = Intent(this@RegisterActivity, MainActivity::class.java)
                                                startActivity(navigate)
                                            }
                                        ) {
                                            Text(text = "Login")
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

