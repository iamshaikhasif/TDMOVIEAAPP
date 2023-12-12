package com.example.tdmmoviesapplication.network

import com.example.tdmmoviesapplication.dashboard.model.NowMovieModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("discover/movie")
    suspend fun getNowMovie() : Response<NowMovieModel>
}