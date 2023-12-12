package com.example.tdmmoviesapplication.network

import com.example.tdmmoviesapplication.dashboard.model.NowMovieModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/now_playing")
    suspend fun getNowMovie(
        @Query("page") page: Int,
    ) : Call<NowMovieModel>
}