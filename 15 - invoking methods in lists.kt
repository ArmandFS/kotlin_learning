package com.example.kotlinnew

//collections in kotlin
fun main() {
    //create list
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
    //create a mutable list
    val myMutableList = mutableListOf(12, 34, 45, 123)
    //since this is a mutable list, you can dynamically manipulate the list in any way
    //invoke removeAt method
    myMutableList.removeAt(0)
    println("Number of elements ${myMutableList.size}")
    //invoke get method to get index at 1
    println("Second element ${myMutableList.get(1)}") //or myMutableList.get[1]
    //invoke for each method, same as a normal for loop
    myListOfNames.forEach{
          print(it)
    }
    for (i in myListOfNames) {
        println("Names: $i")
    }
}
