package com.shoaib.myapplication.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import dagger.Provides

class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

}