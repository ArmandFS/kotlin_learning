package com.example.kotlinnew


//OOP example and Intro
fun main() {
   //this is the actual object
   val car = Car()
   //dot symbol can access the attribute
   print(car.color)
    //run the object behavior
   print(car.drive())
}

//classes follow uppercase naming conventions
class Car{
    val color: String = "Red"
    val model: String = "Honda GTR"
    //add behavior
    fun drive() {
        println("*Car Starts Driving*")
    }
}
