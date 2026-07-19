# Pillars of OOPs

## 1. Encapsulation

- Encapsulatio is the process of building data (attributes) and the methods that operate on that data into a singal unit(*class*) while *restricting* direct access to data

- Achieved using *access modifiers*: private, protected, public

### Purpose:

- Hide internal data

- Protect object state

- control data access

- Improve maintainability

- Prevent invalid modifications

### Access Modifiers

#### private:

- Accessible only inside the same class

- Used for sensitive data

#### public:

- accessible from anywhere

- Used for methods that form the class interface

#### protected

- Accessible inside the class and its derived class

- Mainly used in inheritance

### Getters & Setters

- Instead of allowing direct access to private data, provide controlled access through methods.

- Benefit: Validation can be added before modifying data

- Advantages:
            - Hiding data
            - Controlled access
            - Better Security
            - Easier maintainance
            - Flexibility to change internal implementation without affecting users of the class

### Real world example

- A BankAccount object keeps *balance* private.
- Users cannot directly modify it

- They must use methods like:
                            - deposit()
                            - withdraw()
                            - getBalance()

- This ensures rules(e.g. no negative balance) are enforced.

Note: *Encapsulation is the wrapping data and methods into a class. Data hiding is a result/part of encapsulation*

---
---

## 2. Abstraction

- Abstraction is process of hiding implementation details and exposing only the essential functionality to the user

- The user knows *what an object* does, not *how it does*

### Purpose:

- Hide complexity

- Expose only necessary features

- Reduce dependency on implementation

- Improve maintainability

### How it is achieved?

            1. In C++
                    - Abstract Classes (using pure virtual functions)
                    - Interfaces (through abstract classes)
            
            2. In Java/Kotlin:
                                - Abstract Classes
                                - Interface

### Abstract Class (C++)

- An abstract class is a class that contains *atleast one pure virtual* function

- Cannot create objects of an abstract class

- Used as a base class

- A derived class must implementa all inherited pure virtual functions to become a concrete(instatiable) class.

### Pure Virtual Function

- A function declared with *=0*

- `virtual void draw()=0;`

- *It must be overrided* by derived classes.

### Abstraction vs Encapsulation

- Encapsulation:
                1. Hides data
                2. Achieved using access modifiers
                3. Focuses on protecting object state

- Abstraction:
            1. Hides implementation
            2. Achieved using abstract classes/interfaces
            3. Focuses on simplifying usage

### Advantages:

- Reduces complexity
- Easier code maintenance
- Loose coupling
- Better scalability
- Allows changing implementation without affecting users

### Real- world Example

- A car:
        1. You use accelerator, brake, steering
        - You dont need to know how the engine, transmission or fuel injection works.

- The controls are the *abstraction* the engine internals are hidden

---
---

