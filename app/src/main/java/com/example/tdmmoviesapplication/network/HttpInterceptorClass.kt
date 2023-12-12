package com.example.tdmmoviesapplication.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class HttpInterceptorClass : Interceptor {
    companion object {
        private var instant: HttpInterceptorClass? = null
        fun getInstance() = instant ?: synchronized(this) {
            HttpInterceptorClass().also { instant = it }
        }
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        request = request.newBuilder()
            .addHeader("Content-Type", "application/json")
            .addHeader("Accept", "application/json")
            .build()
        val response: Response = chain.proceed(request)
        if (response.code == 200) {
            val customBuilder = response.newBuilder()
            customBuilder.code(200)
            return customBuilder.build()
        } else if (response.code == 500) {
            val customBuilder = response.newBuilder()
            customBuilder.code(500)
            return customBuilder.build()
        }
        return response
    }
}