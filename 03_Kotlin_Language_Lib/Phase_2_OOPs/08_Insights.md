# Learning Insights

## 1. Classes are Final by default

- Unlike Java: class Animal is inheritable

- In Kotlin: class Animal cannot be inherited

- Must explicity state: open class Animal

- This prevents accidental inheritance and encourages composition over inheritance

## 2. Method overriding

- Parent: open fun sound()

- Child: override fun sound()

- Parent method: open || Child method: Override

## 3. Runtime Polymorphism

- val animal: Animal = Dog("Tommy")

- The variable type is Animal

- The actual object is *Dog*

- Calling: animal.sound() || Output: Tommy barks

- The method is chosen based on the runtime object. Not the reference type

- This is called *dynamic dispatch*

## 4. Abstract Class

- Cannot be instantiated : abstract class Shape

- Illegal: Shape()

- Abstract classes are meant to provide:
                                        - Common implementation
                                        - Abstract methods that subclasses must implement

## 5. Interface

- Interfaces define behavior that classea agree to implement : interface Flyable

- Unlike Java before version 8, Kotlin interface can create concrete methods

## 6. Multiple Interfaces

- A class can implement multiple interfaces

- But it can inherit only one class

## 7. Abstract Class vs Interface

- Abstract class:
                1. Represents "is-a" relationship
                2. Can store state (properties with backing fields)
                3. Can have constructors
                4. One superclass only

- Inerface:
            1. Represents "can-do" capability
            2. Cannot store data
            3. Cannot have constructors
            4. Multiple interfaces allowed

## 8. Android Relevance

- Activity, Fragment, ViewModel rely on inheritance

- Interfaces are common for callbacks, listeneres, and dependendcy inversion

- Polymorphism allows Android to treat different implementations through a common type

- Modern Android APIs also favor interfces and composition, making these concepts foundation for writing clean, extensible Kotlin code

---
---