package com.example.kotlinnew


//collections in kotlin
fun main() {
    //filtering collections in kotlin
    val myListOfNames = listOf("James", "Paul", "Rafael", "George")
    val found = myListOfNames.filter {
        it == "Paul"
        //can check length with:
        //it == length > 4
    }
    val foundStart = myListOfNames.filter{
        //check starting letter and ignore casing
        it.startsWith("r", ignoreCase = true) && it.endsWith("L")
    }
    print(found)
    print(foundStart)
    //if item in list not found, it returns an empty array
}
