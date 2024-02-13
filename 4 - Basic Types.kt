package com.example.kotlinnew

//this function or 'fun' is how to run the kotlin (in main)
fun main() {
    /**
     * var - mutable
     * val - immutable
     * Best practice - In essence, use val > var
     */
   //initialize variable
    val name: String
    val age: Int
    val myByte: Byte
    val myShort: Short
    //example of a long value
    val oneLong = 1L // big numbers


    myByte = 120
    name = "James"
    age = 21
    myShort = 1290

    print("Hello my name is $name I'm $age years old.")
    print("My Byte is $myByte")
}
