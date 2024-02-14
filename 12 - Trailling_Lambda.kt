package com.example.kotlinnew

fun main() {
    enhancedMessage(message = "Hello there,"){
        12
    }
}
//trailing lambda function
//have the lambda function invoked as a parameter
fun enhancedMessage(message: String, funAsParameter: () -> Int) {
    println("$message ${funAsParameter()}")
}
