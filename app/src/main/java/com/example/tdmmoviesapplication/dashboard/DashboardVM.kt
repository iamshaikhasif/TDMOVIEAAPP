package com.example.tdmmoviesapplication.dashboard

import androidx.lifecycle.ViewModel
import com.example.tdmmoviesapplication.dashboard.model.NowMovieModel
import com.example.tdmmoviesapplication.network.ApiClient
import com.example.tdmmoviesapplication.utils.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class DashboardVM @Inject constructor(private val repo: DashboardRepo) : ViewModel() {

    init {
        getData()
    }

    private fun getData(){
        CoroutineScope(Dispatchers.IO).launch {
            repo.getNowMovieRepo(1).enqueue(object : Callback<NowMovieModel>{
                override fun onResponse(call: Call<NowMovieModel>, response: Response<NowMovieModel>) {
                    Utils.getInstance().logDebug(tag = "getNowMovie", msg = "${response.body()}")
                }

                override fun onFailure(call: Call<NowMovieModel>, t: Throwable) {
                    Utils.getInstance().logDebug(tag = "getNowMovie", msg = "Error --> ${t.message}")
                }
            })
        }

    }
}