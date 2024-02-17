package com.example.kotlinnew
//Extension function example
fun main() {
    println("Hello John.".append(" How are you doing?"))
    //apply the removechar function
    println("!This is real fun!".removeFirstAndLastChars())
}
//create extension function
fun String.append(toAppend: String): String {
    //plus adds something else
    return this.plus(toAppend)
}
//create an extension function that removes first and last character
fun String.removeFirstAndLastChars(): String {
    return this.substring(1, this.length - 1)
}
