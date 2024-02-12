package com.kanari.network.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    private val apiService = retrofit.create(ApiService::class.java)

    val _registerState = MutableLiveData<RegisterState>()

    fun register(username: String, password: String, email: String) {
        viewModelScope.launch {
            viewModelScope.launch {
                try {
                    _registerState.value = RegisterState.Loading
                    val response = apiService.register(RegisterRequest(username, password, email))
                    if (response.isSuccessful) {
                        _registerState.value = RegisterState.Success(response.body()!!)
                    } else {
                        _registerState.value = RegisterState.Error(response.errorBody()?.string() ?: "Unknown Error")
                    }
                } catch (e: Exception) {
                    _registerState.value = RegisterState.Error(e.message ?: "Unknown Error")
                }
            }
        }
    }
}

sealed class RegisterState {
    object Loading : RegisterState()
    data class Success(val user: User) : RegisterState()
    data class Error(val message: String) : RegisterState()
}


