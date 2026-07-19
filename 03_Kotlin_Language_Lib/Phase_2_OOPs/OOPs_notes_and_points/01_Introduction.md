# Introduction to OOPs

## 1. Why OOP?

- OOP(Object-oriented programming) organizes software around *objects*(data+behaviour) instead of just functions.

### Goals:

- Improve code reusabitlity
- Improve maintainability
- Reduce code duplication
- Model real-world entities
- Make large projects easier to manage

---

## 2. Procedural vs OOPs

### Procedural Programming

- Program centred around functions
- Data and functions are seperate
- Less secure
- Harder to maintain large projects
- E.g. C

### Object Oriented Programming

- Program centred around objects
- Data and methods are bundled together
- Better data handling through encapsulation
- Easier to scale and maintain
- E.g. C++, Java, Kotlin, python

---

## 3. Object

1. *An object is an instance of a class*

- Think of *class* as a blueprint to be precise or rather a recipe. 

- It isn't the actual thing but a plan that defines what *attributes* (data) and *methods*(behaviour) that thing will have

- An *object* is the actual, physical thing built from that blueprint. When one creates an object from a class, that specific objet is called an *instance* of that class.

- The process of creating an object from a class is called *instantiation*

- *No memory is allocated for a class itself* (except for static members)

- *Memory is allocated when objects are created*

---

## 4. Attributes

- Attribute ( also called *data members*, *fields*, *properties*) store the state of an object.

` class student{
    public:
            string name;
            int age;
};`

- name & age are attributes

---

## 5. Methods

- Methods (also called *member functions*) define the behaviour of an object.

` class Student{
    public:
            void study(){
                cout<<"Studying";
            }
};

- study() is a method

---

## 6. Consructor

- A constructor is a *specical member* function that is automatically called when object is created

### Properties:

1. Same name as the class
2. No return type
3. Initalizes object data

### Types:

1. Default constructor
2. Parameterized constructor
3. Copy constructor (C++)

---

## 7. Destructor (C++)

- A destructor is a special member function that is automatically called when object is destroyed.

### Properties:

1. Name starts with ~
2. No parameters
3. No return type
4. Used to release resources (memory, files, sockets, etc)

*There is only one destructor per class* (cannot ber overloaded).

---
---