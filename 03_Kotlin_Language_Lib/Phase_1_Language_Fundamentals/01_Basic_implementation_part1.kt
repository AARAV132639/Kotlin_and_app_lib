//Implementation of program demonstrating variables, data types, operators, control statements and loops

fun main()
{
    println("--Variables--")


    val college = "HBTU"
    var year = 3

    println("college: $college")
    println ("Year : $year")

    year++
    println("Updated Year: $year")

    //Switch statement. When statement in case of Kotlin
    val day = 3

    when(day)
    {
        1-> println("Monday")
        2-> println("Tuesday")
        3-> println("Thursday")
        else-> println("Invalid")
    }

    //Loops

    for(i in 1..5) println(i)

    var count = 1
    while(count<=5)
    {
        println(count)
        count++
    }

    
}