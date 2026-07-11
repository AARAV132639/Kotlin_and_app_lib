fun greet(name: String): String
{
    return "Hello, $name!"
}

//Single-expression function
fun square(num:Int) = num*num

//Default arguments
fun displayStudent(name: String, course: String = "B.tech", year: Int =1)
{
    println("name: $name")
    println("course: $course")
    println("year: $year")
    println()
}

//vararg fuctnion

fun sum(vararg numbers: Int): Int{
    var total =0
    for(num in numbers) total+= num
    return total
}

//Higher order function

fun calculate(a: Int, b: Int, operation: (Int,Int)->Int): Int
{
    return operation(a,b)
}

//function returning another function
fun chooseOperation(choice: String):(Int, Int)-> Int
{
    return when(choice)
    {
        "add" -> {x,y->x+y}
        "sub"-> {x,y->x-y}
        "mul"-> {x,y-> x*y}
        else -> {_,_ ->0}
    }
}

//main function
fun main(){

println("===== BASIC FUNCTION =====")
    println(greet("Aarav"))

    println("\n===== SINGLE EXPRESSION FUNCTION =====")
    println("Square of 8 = ${square(8)}")


    println("\n===== DEFAULT ARGUMENTS =====")

    displayStudent("Rahul")
    displayStudent("Priya", "BCA")
    displayStudent("Aman", "MCA", 2)


    println("\n===== NAMED ARGUMENTS =====")

    displayStudent(
        year = 3,
        name = "Karan",
        course = "B.Tech"
    )


    println("\n===== VARARG FUNCTION =====")

    println("Sum = ${sum(1,2,3,4,5)}")
    println("Sum = ${sum(10,20,30)}")


    println("\n===== HIGHER ORDER FUNCTION =====")

    val addition = calculate(10, 5) { x, y -> x + y }
    val multiplication = calculate(10, 5) { x, y -> x * y }

    println("Addition = $addition")
    println("Multiplication = $multiplication")


    println("\n===== RETURNING FUNCTION =====")

    val add = chooseOperation("add")
    val multiply = chooseOperation("mul")

    println("15 + 6 = ${add(15, 6)}")
    println("15 * 6 = ${multiply(15, 6)}")
}
