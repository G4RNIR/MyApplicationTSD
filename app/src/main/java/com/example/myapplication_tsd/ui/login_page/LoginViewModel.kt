package com.example.myapplication_tsd.ui.login_page

import androidx.lifecycle.ViewModel
import com.example.myapplication_tsd.LoginRequest
import com.example.myapplication_tsd.LoginResponse
import com.example.myapplication_tsd.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel : ViewModel() {
    fun loginUser(login: String, password: String, onResult: (String) -> Unit) {
        val request = LoginRequest(login, password)
        RetrofitInstance.api.login(request).enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful) {
                    onResult(response.body()?.message ?: "Неизвестная ошибка")
                } else {
                    onResult("Ошибка входа")
                }
            }
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                onResult("Ошибка подключения к серверу")
            }
        })
    }
}
