# Learning Insights : Classes Objects Constructors

## 1. Class vs Object

- A class is a blueprint

- An object is an instance of that blueprint.

- You can create many objects from the same class

## 2. Primary Constructor

- Kotlin allows constructor parameters directly in class header

- `class Student( val name: String, var age:Int)`

- This is equivalent to writing fields and a constructor manually in Java

## 3. init Block

- Runs immediately after the primary constructor

- Execution order : Primary constructor parameters --> Init block --> Secondary constructor body (if used)

- A class can have multiple *init* blocks. They execute in the order they appear.

## 4. Secondary Constructor

- Useful when you want multiple ways to create an object.

- `constructor (name:String) : this(name. 18)`

- Calls primary constructor first, then executes its own body

## 5. Properties vs Fields

- In Kotlin : `var age = 20` is a *property, not just field*

- By default, Kotlin generates:
                                - a backing field
                                - a getter
                                - a setter (for var)

- Conceptually, var age =20 behaves like:

`private int age =20;
public int getAge() {return age;}
public void setAge(int age){
    this.age = age;
}`

without writing the boilerplate.

## 6. Objects are created with Constructor calls

- Unlike Java: `Student s = new Student();`

- Kotlin has no *new* keyword.

- Simply write: `val s = Student("Aarav",20)`

- The constructor call itself creates the object.

## 7. Android Relevance:

- *Activities, Fragments and ViewModels* are classes

- *Data classes* represt API responses and database entities

- Dependency injection frameworks instantiate classes using constructors

- *Jetpack Compose* relies heavily on immutable(val) state and constructor based design.

---
---