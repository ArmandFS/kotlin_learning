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
    car.speed(60, 120)
    //Truck class usage and inherit from other class
    val truck = Truck(color = "Purple", model = "Ford16")
    truck.drive()
    truck.speed(minSpeed = 20, maxSpeed = 90)

}
//classes follow uppercase naming conventions
//the init can initialize variables in the class
open class Car(var color: String = "Blue", var model: String = "GTR"){
    //adding parameters to the function
    //open function too
    open fun speed(minSpeed:Int, maxSpeed:Int){
        println("Minimum speed is: $minSpeed and Maximum speed is: $maxSpeed")
    }
    open fun drive() {
        println("*Car Starts Driving*")
    }
}

//adding more classes in kotlin and inherting from previous class
class Truck(color: String, model: String): Car(color, model){
    override fun speed(minSpeed: Int, maxSpeed: Int){
    }
    override fun drive(){
        println("**Truck Noises**")
    }
}

