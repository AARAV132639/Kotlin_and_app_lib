/*

# Experiment 4: Null Safety using Nullable types, Safe calls, Elvis Operator and Smart Casts

- Nullable Types(?)
- Non null types
- Safe Call Operator (?.)
- Not-Null Assertion (!!)
- Smart Casts (is)
- Safe Type Cast (as?)

*/

fun printLength(text: String?)
{
    //safe call
    println("Lenght using Safe Call: ${text?.length}")

    //Elvis Operator
    println("lenght using Elvis: ${text?.length?:0}")

    //Smart Cast
    if(text!= null) println("smart cast lenght: ${text.length}")

    else println("Text is Null")
}

fun main()
{
    println("--Nullable Types--")

    var name: String? = "Aarav"
    println(name)

    name = null
    println(name)

    println("---Safe Call---")

    val city: String? = "Varanasi"
    println(city?.length)

    val country: String? = null
    println(country?.length)


    println("--Elvis Operator--")

    val language: String? = null

    val length = language?.length?:0

    println("Lenght= $length")

    println("--Smart Cast--")
    printLength("Kotlin")
    println()
    printLength(null)

    println("--Safe Type Cast--")

    val value: Any = "Programming"

    val text = value as? String

    println(text)

    val number = value as? Int

    println(number)

    println("--Not Null Assertion--")

    val message: String?= "Hello Kotlin"

    println(message!!.length)

    // To see Null pointer Exception

     // val another: String? = null
     // println(another!!.length)
}