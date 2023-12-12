package com.example.tdmmoviesapplication.dashboard.model

import com.google.gson.annotations.SerializedName

data class NowMovieModel(
    val dates: NowMovieDatesModel,
    val page: Int,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("total_results") val totalResults: Int,
    val results: List<NowMovieResultModel>,
)

data class NowMovieDatesModel(
    val maximum: String,
    val minimum: String,
)

data class NowMovieResultModel(
    val adult: Boolean,
    val id: Int,
    val overview: String,
    val popularity: Number,
    val title: String,
    val video: Boolean,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("genre_ids") val genreIds: List<Int>,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("original_title") val originalTitle: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("vote_average") val voteAverage: Number,
    @SerializedName("vote_count") val voteCount: Int,
)