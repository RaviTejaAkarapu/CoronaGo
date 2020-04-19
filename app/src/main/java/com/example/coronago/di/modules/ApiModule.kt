package com.example.coronago.di.modules

import com.example.coronago.ApplicationContext
import com.example.coronago.LocalStorage
import com.example.coronago.remote.apiLib.ApiServiceFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideApiService(localStorage: LocalStorage, applicationContext: ApplicationContext) =
        ApiServiceFactory.generateApiService(localStorage, applicationContext)
}