/*

# Experiment 5: String Manipulation and Extension Functions

- String creation
- String Properties
- String interpolation
- String comparision
- Substrings
- Splitting and replacing
- Extension functions
- Extension properties
*/

//Extension function
fun String.isPalindrome(): Boolean{
    val cleaned = this.lowercase().replace("","")
    return cleaned == cleaned.reversed()
}

//Extension function
fun String.countVowels():Int{
    var count =0

    for (ch in this.lowercase()){
        if(ch in "aeiou") count++
    }

    return count
}

//Extension property
val String.firstCharacter: Char
get()= this[0]

fun main() {

    val text = "Hello Kotlin"

    println("===== STRING PROPERTIES =====")

    println("Original : $text")
    println("Length : ${text.length}")
    println("Uppercase : ${text.uppercase()}")
    println("Lowercase : ${text.lowercase()}")


    println("\n===== STRING CONCATENATION =====")

    val language = "Programming"

    println(text + " " + language)

    println("I am learning $language")


    println("\n===== STRING COMPARISON =====")

    val s1 = "Kotlin"
    val s2 = "kotlin"

    println(s1 == s2)
    println(s1.equals(s2, ignoreCase = true))


    println("\n===== SUBSTRING =====")

    println(text.substring(0, 5))
    println(text.substring(6))


    println("\n===== REPLACE =====")

    println(text.replace("Kotlin", "Java"))


    println("\n===== SPLIT =====")

    val sentence = "Apple,Banana,Mango"

    val fruits = sentence.split(",")

    for (fruit in fruits)
        println(fruit)


    println("\n===== EXTENSION FUNCTION =====")

    println("madam".isPalindrome())
    println("Hello".isPalindrome())

    println("Education".countVowels())


    println("\n===== EXTENSION PROPERTY =====")

    println(text.firstCharacter)
}