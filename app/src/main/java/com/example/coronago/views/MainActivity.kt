package com.example.coronago.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.coronago.R
import com.example.coronago.viewmodels.MainActivityViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel =
            ViewModelProviders.of(this).get<MainActivityViewModel>(MainActivityViewModel::class.java)
        setContentView(R.layout.activity_main)

        (viewModel).testmethod()
    }
}
