package com.example.coronago.di.component

import com.example.coronago.ApplicationContext
import com.example.coronago.di.modules.*
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CacheModule::class, SharedPrefModule::class, RepositoryModule::class, RemoteModule::class]
)

interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: ApplicationContext): Builder
    }

    fun inject(applicationContext: ApplicationContext)

}
