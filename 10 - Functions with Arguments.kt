package com.example.kotlinnew

//loops and branching
fun main() {
    //creating a simple kotlin function and pass arguments
    calculate(1, 1000, multipleOf = 3)
}

//pass a parameter in the function
fun calculate(first: Int,second: Int,multipleOf: Int){
    for (i in first..second){
        if(i%multipleOf ==0){
            println("$i is multiple of 2!")
        }
    }

}
