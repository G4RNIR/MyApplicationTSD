package com.example.myapplication_tsd

import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Call

data class LoginRequest(val login: String, val password: String)
data class LoginResponse(val status: String, val message: String)

interface ApiService {
    @POST("/login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}
