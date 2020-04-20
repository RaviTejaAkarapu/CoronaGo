package com.example.coronago.di.scopes;

import androidx.lifecycle.ViewModel;

import dagger.MapKey;


@MapKey
public @interface ViewModelKey {
    Class<? extends ViewModel> value();
}

