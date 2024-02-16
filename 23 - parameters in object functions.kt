package com.example.kotlinnew
//OOP example and Intro
fun main() {
   //with constructors, we can just run the object like this:
    val car = Car(color = "Green", model = "LLM")
    car.speed(60, 120)
}
//classes follow uppercase naming conventions
//the init can initialize variables in the class
class Car(var color: String = "Blue", var model: String = "GTR"){
    init{
        if (color == "Green") {
            println("Green color.")
        }else{
            println("$color is not Green.")
        }
    }
    //adding parameters to the function
    fun speed(minSpeed:Int, maxSpeed:Int){
        println("Minimum speed is: $minSpeed and Maximum speed is: $maxSpeed")
    }
}
