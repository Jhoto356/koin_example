package com.example.koin_example.di

import com.example.koin_example.core.example.ExampleModel
import com.example.koin_example.core.example.ExampleRepository
import com.example.koin_example.core.example.ExampleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val modulesApp = module {
    single { ExampleModel() }
    single { ExampleRepository() }
    viewModel { ExampleViewModel() }

}
