package com.example.coronago.di.component

import com.example.coronago.di.module.MainModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent?
    }

}
