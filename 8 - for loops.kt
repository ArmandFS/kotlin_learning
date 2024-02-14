package com.example.kotlinnew

//loops and branching
fun main() {
    /*the for loop in kotlin example*/
    //the ".." stands for range
     for(i in 1..1000){
         if (i%3 === 0)
             //println is for printing in different lines
             println("$i is multiple of 3")
         else{
             print("--")
         }
     }
}
