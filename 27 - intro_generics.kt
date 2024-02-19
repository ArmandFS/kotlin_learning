fun main() {
    val listofItems = listOf("Armand", "Gina", "James", "John")
    val finder = Finder(listofItems)
    finder.findItem(element = "John"){
        //put trailling lambda example
        println("Found $it")
    }
}
//private class
class Finder(private val list: List<String>) {
    //private means that it is not accesible
    //input lambda function
    fun findItem(element: String, foundItem: (element:String?)->Unit){
        //don't forget the filter method
        val itemFoundList = list.filter{
            it == element
        }
        //if item empty then null else item first
        if (itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }
}
