package com.example.koin_example.core.example

import org.koin.java.KoinJavaComponent.inject

class ExampleRepository {
    private val exampleModel: ExampleModel  by inject(ExampleModel::class.java)

    fun printMsg() {
        exampleModel.printMsg()
    }

}