package com.example.tdmmoviesapplication.service

import com.example.tdmmoviesapplication.dashboard.DashboardRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModules {

    @Provides
    @Singleton
    fun getDashboardRepo() : DashboardRepo = DashboardRepo()
}