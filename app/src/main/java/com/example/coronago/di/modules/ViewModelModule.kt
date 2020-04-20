package com.example.coronago.di.modules

import androidx.lifecycle.ViewModel
import com.example.coronago.di.scopes.ViewModelKey
import com.example.coronago.viewmodels.MainActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    internal abstract fun bindMainActivityViewModel(viewModel : MainActivityViewModel) : ViewModel?

}