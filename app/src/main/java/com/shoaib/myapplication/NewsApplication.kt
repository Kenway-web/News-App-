package com.shoaib.myapplication

import android.app.Application
import com.shoaib.myapplication.di.component.ApplicationComponent
import com.shoaib.myapplication.di.component.DaggerApplicationComponent
import com.shoaib.myapplication.di.module.ApplicationModule

class NewsApplication: Application() {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
      applicationComponent = DaggerApplicationComponent
          .builder()
          .applicationModule(ApplicationModule(this))
          .build()
      applicationComponent.inject(this)
    }

}