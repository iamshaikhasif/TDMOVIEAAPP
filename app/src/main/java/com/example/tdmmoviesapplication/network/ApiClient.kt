package com.example.tdmmoviesapplication.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {
    val baseUrl = "https://api.themoviedb.org/3/"
        var apiService: ApiService? = null
    fun getInstance(): ApiService {
        if(apiService == null){
            val retrofit = Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            apiService = retrofit.create(ApiService::class.java)
        }
        return apiService!!
    }
}