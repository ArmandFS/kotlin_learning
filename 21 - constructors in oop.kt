package com.example.kotlinnew
//OOP example and Intro
fun main() {
   //with constructors, we can just run the object like this:
    val car = Car(color = "Green", model = "LLM")
    //create another car object based on class
    val secondCar = Car(color = "Purple", model="Lamborghini55")
    println("Car color: ${car.color}, model: ${car.model}")
    car.drive()
    println("Second Car Color: ${secondCar.color}, model: ${secondCar.model}")
    car.drive()
}
//classes follow uppercase naming conventions
//add constructors, basically the arguments in the class
class Car(var color: String = "Blue", var model: String = "GTR"){
    fun drive() {
        println("*Car Starts Driving*")
    }
}
