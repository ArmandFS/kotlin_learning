package com.example.kotlinnew

fun main() {
    //creating a lambda function
    name("Armand")
}
//the lambda function
//structure of the lambda: val lambdaName: Type = {parameterList -> codeBody}
val add:(Int,Int) -> Int = {a, b-> a + b} //after the arrow, is the logic
//^same as below
fun sum(a: Int, b:Int): Int{
    return a + b
}
//calculate cat age turned into a lambda function
fun calculateCatAge(age: Int): Int = age * 7
//the lambda function
val calc:(Int) -> Int = {age -> age * 7}
//using the it keyword for the lambda function, same thing
val calc2:(Int) -> Int = {it * 7}

//lambda function to return unit-void
val name: (String) -> Unit = {name -> print(name)}
