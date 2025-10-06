package com.shoaib.myapplication.di.component

import com.shoaib.myapplication.MainActivity
import com.shoaib.myapplication.di.ActivityScope
import com.shoaib.myapplication.di.module.ActivityModule
import dagger.Component


@ActivityScope
@Component(dependencies = [ActivityComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}