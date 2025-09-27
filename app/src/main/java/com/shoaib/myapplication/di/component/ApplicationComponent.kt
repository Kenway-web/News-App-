package com.shoaib.myapplication.di.component

import android.content.Context
import com.shoaib.myapplication.NewsApplication
import com.shoaib.myapplication.di.module.ApplicationContext
import com.shoaib.myapplication.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

}