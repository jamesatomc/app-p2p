package com.kanari.network.viewmodel


import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

interface ApiService {
    @POST("/users")
    suspend fun register(request: RegisterRequest): Response<User>


}

data class RegisterRequest(
    val username: String,
    val password: String,
    val email: String
)

data class User(
    val id: Int,
    val name: String,
    val email: String
)

val retrofit = Retrofit.Builder()
    .baseUrl("http://localhost:8080")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

