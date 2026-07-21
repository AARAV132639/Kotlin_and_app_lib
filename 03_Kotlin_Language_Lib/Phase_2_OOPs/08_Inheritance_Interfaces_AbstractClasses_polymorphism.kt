// Experiment 8: Inheritance, Interfaces, Abstract Classes and Polymorphism

//Inheritance

open class Animal(val name: String)
{
    open fun sound()
    {
        println("$name makes a sound")
    }
}

//---Child class---

class Dog(name:String): Animal(name)
{
    override fun sound()
    {
        println("$name barks")
    }
}

class Cat(name:String): Animal(name)
{
    override fun sound(){
        println("$name meows")
    }
}

//---Abstract class

abstract class Shape{

    abstract fun area()

    fun display(){
        println("Calculating area")
    }
}

class Circle(private val radius: Double):Shape(){
    override fun area()
    {
        println("Area = ${3.14*radius*radius}")
    }
}

//---Interface

interface Flyable{
    
    fun fly()

    fun takeOff()
    {
        println("Taking off...")
    }
}

class Bird: Flyable{
    override fun fly()
    {
        println("Bird is flying")
    }
}

//---Main--

fun main()
{
    println("---Inheritance---")

    val dog = Dog("Tommy")
    dog.sound()

    val cat = Cat("kitty")
    cat.sound()

    println("--Polymorphism--")

    val animal1: Animal = Dog("Bruno")
    val animal2: Animal = Cat("Lucy")

    animal1.sound()
    animal2.sound()

    println("---Abstract Class---")
    val circle = Circle(7.0)

    circle.display()
    circle.area()

    println("--Interface--")
    val bird = Bird()
    bird.takeOff()
    bird.fly()
}