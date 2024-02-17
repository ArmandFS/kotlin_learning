package com.example.kotlinnew
//Interface Example
fun main() {
    val button = Button(label = "Button")
        button.onClick(message = "This is a button!")
        val superMario = Character(name = "Mario")
            superMario.onClick(message = "This is a button")

}
//create button variable with onClick function
class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked By $label and here's a message $message ")
    }
}
//create Interface
interface ClickEvent {
    fun onClick(message: String)
}
class Character(val name: String): ClickEvent{
    override fun onClick(message: String) {
        println("Clicked By $name and here's a message $message")
    }
}
