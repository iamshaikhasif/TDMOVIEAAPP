package com.example.tdmmoviesapplication.dashboard

import com.example.tdmmoviesapplication.dashboard.model.NowMovieModel
import com.example.tdmmoviesapplication.network.ApiClient
import retrofit2.Call

class DashboardRepo {
    suspend fun getNowMovieRepo(page:Int): Call<NowMovieModel>
    {
        val apiService by lazy { ApiClient.getInstance()}
        return apiService.getNowMovie(page)
    }
}