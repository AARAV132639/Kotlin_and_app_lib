/*

# Experiment 3 : Arrays, Lists, Sets and Maps using Kotlin collections

- Arrays
- Mutable and Immutable Lists
- Mutable and Immutable Sets
- Mutable and Immutable Maps
- Basic collection operations(add, remove, search, update, iteration)
*/

fun main()
{
    //array
    println("--Array--")

    val numbers = arrayOf(10,20,30,40,50)

    println("First element:$numbers[0]")
    numbers[2] = 100

    println("Modified Array:")
    for(num in numbers) print("$num")

    println()

    //list
    println("--List--")
    val fruits = listOf("Apple","Banana","Mango")
    println("immutable lists:")
    println(fruits)

    val mutableFruits = mutableListOf("Apple","banana")
    mutableFruits.add("Orange")
    mutableFruits.add("Guava")
    mutableFruits.remove("banana")

    println("Mutable lists:")
    println(mutableFruits)

    println("Contains Mango? ${mutableFruits.contains("Mango")}")

    //Set
    println("--Set--")

    val NumbersSet = mutableSetOf(10,20,30)

    NumbersSet.add(20)
    NumbersSet.add(40)

    println(NumbersSet)

    println("contains 30? ${NumbersSet.contains(30)}")

    //Map
    println("--MAP--")

    val students = mutableMapOf(
        101 to "Aarav",
        102 to "Rahul",
        103 to "Priya"
    )

    students[104] = "Ankit"
    students.remove(103)

    println(students)
    println("Student 101: ${students[101]}")

    //Iteration
    println("Lists")

    for(fruit in mutableFruits) println(fruit)

    println()

    println("Set:")

    for(item in NumbersSet) println(item)

    println()

    println("Map:")
    for((roll,name)in students) println("$roll->$name")
}