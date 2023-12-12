package com.example.tdmmoviesapplication.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.tdmmoviesapplication.R
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    //private val viewModel: DashboardVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}