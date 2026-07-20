/*

# Experiment 7: Classes, Objects, Constructors, Properties and Initalization blocks

*/

//Class

class Student(
    val name :String,
    var age: Int) //class is a blueprint
{
    //Initalization block

    init{
    println("Student object created for $name")
    }

    //Secondary constructor
    constructor(name:String): this(name,18)
    {   
    println("Secondary constructor called")
    }   

    //Member functin
    fun display()
    {
    println("Name: $name")
    println("Age: $age")
    }

    fun birthday()
    {
    age++
    println("$name is now $age year old")
    }

}

fun main()
{
    println("--Primary Constructor--")

    val student1 = Student("Aarav",20)
    student1.display()

    println("\n---Modify Properties---")

    student1.age = 21
    student1.display()

    println("\n---Secondary Constructor---")
    val student2 = Student("Rahul") //here no age was passed
    student2.display()
}