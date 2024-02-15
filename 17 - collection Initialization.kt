package com.example.kotlinnew

//collections in kotlin
fun main() {
    //create list example
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
    //create a mutable list
    val myMutableList = mutableListOf(12, 34, 45, 123)

    //sets example
    val mySet = setOf("US", "MZ", "AU")
    val myMutableSet = mutableSetOf(1,3,4,5)
    myMutableSet.add(6)
    println(myMutableSet)

    //initializing a list example with specifying a string/int:
    val myNewList = mutableListOf<String>()
    myNewList.add("Hello")
    for (i in 1..10) {
        myNewList.add(i, "Hello $$i")
    }
    println(myNewList)
    
    val myNewImlist = listOf<Int>(1, 4, 5)

    //map example
    val secretMap = mapOf("Up" to 1,"Down" to 2, "Left" to 3, "Right" to 4)
    //mutable map example
    val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2,"Three" to 3, "Four" to 4)
    //maps use put method or square assignment brackets
    myMutableSecretMap.put("Five",5)
    println(secretMap)
    println(secretMap.keys) //will print the keys
    if ("Up" in secretMap) println("Yes it is in in!")
    //output is {Up=1, Down=2, Left=3,Right=4}
}
