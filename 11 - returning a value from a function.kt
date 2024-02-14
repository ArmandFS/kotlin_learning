package com.example.kotlinnew

//loops and branching
fun main() {
    //creating a simple kotlin function and pass arguments
    val catAge = calculateCatAge(age=12)
    print("This cat is $catAge years old")
}

//pass a parameter in the function
//the other Int will return an integer
//returning a value simplifies the function
fun calculateCatAge(age: Int): Int{
    return age*7
}

//same thing can be written here: fun calculateCatAge(age: Int): Int = age * 7
