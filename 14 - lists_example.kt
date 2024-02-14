package com.example.kotlinnew

//collections in kotlin
fun main() {
    //create list
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
    //create a mutable list
    val myMutableList = mutableListOf(12, 34, 45, 123)
    //since this is a mutable list, you can dynamically manipulate the list in any way
        myMutableList.add(214)
        // or myMutableList.remove(12) etc

    //invoke for each method, same as a normal for loop
    myListOfNames.forEach{
          print(it)
    }
    //for (i in myListOfNames) {
    //    println("Names: $i")
    //}
}
