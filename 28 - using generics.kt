package com.example.kotlinnew

import javax.swing.JMenuItem

//intro to generics
fun main() {
    val listofItems = listOf("Armand", "Gina", "James", "John")
    val listOfNumbers = listOf(69, 410,420, 666)
    val finder = Finder(listOfNumbers)
    finder.findItem(element = 69){
        //put trailling lambda example
        println("Found $it")
    }
}
//private class
//generic types are shown as T (type)
class Finder<T>(private val list: List<T>) {
    //private means that it is not accesible
    //input lambda function
    fun findItem(element: T, foundItem: (element:T?) -> Unit){
        //don't forget the filter method
        val itemFoundList = list.filter{
            it == element
        }
        //if item empty then null else item first
        if (itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }
}
