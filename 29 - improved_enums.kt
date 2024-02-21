package com.example.kotlinnew
import kotlin.Exception

//intro to enums and states
fun main() {
   Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())
}
fun getResult(result: Result) {
    return when(result) {
        is Error -> {
            println(result.exception.toString())
        }
        is Success ->{
            println(result.dataFetched?:"Ensure you start the fetch function first.")
        }
        is Loading ->{
            println("Loading..")
        }
        is NotLoading ->{
            println("Idle")
        }
        else -> {
            print("N/A")
        }
    }
}
object Repository{
    private var loadState: Result = NotLoading
    private var dataFetched:String? = null
    fun startFetch() {
        //fetch something, change state
        loadState = Loading
        dataFetched = "data is fetched"
    }
    fun finishedFetch(){
        loadState = Success(dataFetched)
        dataFetched = null
    }
    fun error(){
        loadState = Error(exception = Exception())
    }
    fun getCurrentState(): Result{
        return loadState
    }
}

abstract class Result

data class Success(val dataFetched: String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()
