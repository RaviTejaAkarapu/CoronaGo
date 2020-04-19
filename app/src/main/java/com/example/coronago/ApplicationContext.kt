package com.example.coronago

import android.app.Application
import com.example.coronago.di.component.DaggerAppComponent

class ApplicationContext: Application() {

    override fun onCreate() {
        super.onCreate()
        val localStorage = LocalStorage(this)
//        localStorage.saveConfigs()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }

}