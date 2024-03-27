package com.example.koin_example.core.example

import androidx.lifecycle.ViewModel
import org.koin.java.KoinJavaComponent.inject

class ExampleViewModel: ViewModel() {
    private val exampleRepository: ExampleRepository by inject(ExampleRepository::class.java)

    fun printMsg() {
        exampleRepository.printMsg()
    }

}