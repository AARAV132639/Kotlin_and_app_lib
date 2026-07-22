/*
Experiment : Kotlin Coroutines for asynchronous programming

- Gradle dependency: implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
*/

import kotlinx.coroutines.*

suspend fun downloadData(): String{
    delay(2000) //simulate network delay
    return "Data downloaded"
}

fun main() = runBlocking{

    println("--Launch---")

    val job = launch{
        repeat(5)
        {
            println("Working.... $it")
            delay(500)
        }
    }

    job.join()

    println("--Async/await---")

    val deferred = async {
        downloadData()
    }

    println("Waiting for result...")

    val result = deferred.await()

    println(result)

    println("\n---Dispatchers---")

    launch(Dispatchers.Default)
    {
        println("running on default dispatcher")
    }.join()


    lauch(Dispatcher.IO)
    {
        println("Running on IO dispatcher")
    }.join()

    println("\n Main Coroutine Finished")
}

/*

# Sample Output:



*/



