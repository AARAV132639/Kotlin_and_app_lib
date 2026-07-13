/*

# Experiment 6: Exception Handling and Custom Exceptions

1. try-catch 
2. Multiple catch blocks
3. finally
4. throw
5. Custom exception class
6. *try* as an exception
*/

class InvalidAgeException (message:String): Exception(message)

fun validateAge(age:Int)
{
    if(age<18)
    {
        throw InvalidAgeException("age must be 18 or above")

    }
    println("Age is valid.")
}

//main function

fun main()
{
    println("--Try-Catch--")

    try{
        val a = 10
        val b =0
        println(a/b)
    }
    catch(e:ArithmeticException)
    {
        println("Arithmetic Exception:${e.message}")
    }

    //multiple catch blocks
    try{
        val arr = arrayOf(10,20,30)
        println(arr[5])
    }
    catch(e:ArrayIndexOutOfBoundsException) {println("Array Index Exception")}
    catch(e: Exception) {println("General Exception")}

    // Finally block
try {
    println("Performing Operation...")
} finally {
    println("Resources released.")
}

// Custom Exception
println("--Custom Exception--")

try {
    validateAge(16)
} catch (e: InvalidAgeException) {
    println(e.message)
}

try {
    validateAge(22)
} catch (e: InvalidAgeException) {
    println(e.message)
} finally {
    println("bye bye")
}
}