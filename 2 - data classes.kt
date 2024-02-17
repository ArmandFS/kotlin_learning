package com.example.kotlinnew
//data class example
fun main() {
    val human = Human(
        name = "Joe",
        lastName = "Ball",
        age = 23,
        gender = "Male")
    println(human)
}
data class Human(val name: String, val lastName: String, val age: Int, val gender: String)
