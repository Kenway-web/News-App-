package com.shoaib.myapplication.data.repository

import com.shoaib.myapplication.data.api.NetworkService
import com.shoaib.myapplication.data.model.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService) {

    fun getTopHeadLines(country:String): Flow<List<Article>>{
        return flow {
            emit(networkService.getTopHeadlines(country))
        }.map{
            it.articles
        }
    }

}