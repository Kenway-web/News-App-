package com.shoaib.myapplication.data.api

import com.shoaib.myapplication.data.model.TopHeadlinesResponse
import com.shoaib.myapplication.utils.AppConstant.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface NetworkService {


    @Headers("X-Api-Key:$API_KEY","User-Agent: ABC")
    @GET("top-headlines")
    suspend fun getTopHeadlines(@Query("country") country: String) : TopHeadlinesResponse
}