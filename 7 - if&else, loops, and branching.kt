package com.example.kotlinnew

//loops and branching
fun main() {
    /*if Amount is equal to 1000, then you are wealthy, else you are
    * getting by just fine */
    val amount = 1900
    if (amount == 1000) {
        print("You are wealthy")
    } else if (amount > 1000) {
        print("Wow you are so rich")
    } else {
        print("You are getting by")
    }
    //add more branches to the tree
      when(amount) {
        100 -> print("You have 100")
        125 -> print("You have 125")
        999 -> print("You are close")
        1010 -> print("You are rich!")
          else ->{
              print("$amount is not enough my guy")
          }
    }
}
