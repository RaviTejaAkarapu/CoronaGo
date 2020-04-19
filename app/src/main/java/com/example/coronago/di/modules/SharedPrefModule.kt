package com.example.coronago.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.example.coronago.AppDatabase
import com.example.coronago.ApplicationContext
import com.example.coronago.LocalStorage
import dagger.Provides
import javax.inject.Singleton


abstract class SharedPrefModule {

    @Singleton
    @Provides
    fun provideSharedPreference(application: ApplicationContext): SharedPreferences {
        return application.getSharedPreferences("SharedPrefs", Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    fun provideAppDatabase(applicationContext: ApplicationContext): AppDatabase {
        return AppDatabase.getAppDatabase(applicationContext)
    }

    @Singleton
    @Provides
    fun provideLocalStorage(applicationContext: ApplicationContext): LocalStorage {
        return LocalStorage(applicationContext)
    }
}
