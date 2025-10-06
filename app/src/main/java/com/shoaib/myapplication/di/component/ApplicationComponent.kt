package com.shoaib.myapplication.di.component

import android.content.Context
import com.shoaib.myapplication.NewsApplication
import com.shoaib.myapplication.data.api.NetworkService
import com.shoaib.myapplication.data.repository.TopHeadlineRepository
import com.shoaib.myapplication.di.module.ApplicationContext
import com.shoaib.myapplication.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadLineRepository(): TopHeadlineRepository

}