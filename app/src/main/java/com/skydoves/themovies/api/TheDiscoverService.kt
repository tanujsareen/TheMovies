package com.skydoves.themovies.api

import android.arch.lifecycle.LiveData
import android.support.annotation.NonNull
import com.skydoves.themovies.models.DiscoverMovieResponse
import com.skydoves.themovies.models.DiscoverTvResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Developed by skydoves on 2018-08-07.
 * Copyright (c) 2018 skydoves rights reserved.
 */

interface TheDiscoverService {
    /**
     * [Movie Discover](https://developers.themoviedb.org/3/discover/movie-discover)
     *
     *  Discover movies by different types of data like average rating, number of votes, genres and certifications.
     *  You can get a valid list of certifications from the  method.
     *
     *  @param [apiKey] Validations.
     *  @param [page] Specify the page of results to query.
     *
     *  @return [DiscoverMovieResponse] response
     */
    @GET("/3/discover/movie")
    fun fetchDiscoverMovie(@Query("api_key") @NonNull apiKey: String,
                           @Query("page") page: Int): LiveData<ApiResponse<DiscoverMovieResponse>>

    /**
     * [Tv Discover](https://developers.themoviedb.org/3/discover/tv-discover)
     *
     *  Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.
     *
     *  @param [apiKey] Validations.
     *  @param [page] Specify the page of results to query.
     *
     *  @return [DiscoverTvResponse] response
     */
    @GET("/3/discover/tv")
    fun fetchDiscoverTv(@Query("api_key") @NonNull apiKey: String,
                        @Query("page") page: Int): LiveData<ApiResponse<DiscoverTvResponse>>
}