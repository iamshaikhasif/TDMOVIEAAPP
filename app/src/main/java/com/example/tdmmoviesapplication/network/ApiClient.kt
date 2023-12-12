package com.example.tdmmoviesapplication.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

object ApiClient {
    private const val baseUrl = "https://api.themoviedb.org/3/"
    private var apiService: ApiService? = null
    fun getInstance(): ApiService {
        if (apiService == null) {
            val gson = GsonBuilder()
                .create()
            val mHttpLoggingInterceptor = HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY)
            val okHttpClient = OkHttpClient.Builder()
                .readTimeout(100, TimeUnit.SECONDS)
                .connectTimeout(100, TimeUnit.SECONDS)
                .addInterceptor(mHttpLoggingInterceptor)
                .addInterceptor(HttpInterceptorClass.getInstance())
                .build()
            val retrofit = Retrofit.Builder().baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            apiService = retrofit.create(ApiService::class.java)
        }
        return apiService!!
    }
}