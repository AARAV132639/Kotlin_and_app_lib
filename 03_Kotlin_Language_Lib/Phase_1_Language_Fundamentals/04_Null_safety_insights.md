# Points & Insights regarding Null safety

## What is NullPointerException?

- An object reference in memory either: points to a valid object OR points to nothing (NULL)


- Suppose we call println(name.length) 

- To compute lenght, the runtime must follow the reference to a String object.

- Let's suppose there is no object. JVM cannot execute *lenght* on "nothing" so it throws an exception: *NullPointerException*

- Meaning: You tried to use an object, but there isn't one

## Why was this a pain point in Java?

- In Java, every object reference can be *null*.

- Example:
            - String name = null; This compiles perfectly
            - Later: System.out.println(name.length()); //The compiler says nothing
            - Only when the program runs do you get : *Exception in thread "main" java.lang.NullPointerException*

- The problem is that compiler cannot distinguish between: This variable can never be null and This variable *may* become null

- So Java programmers constantly write : if(person!= null){...} throughout the code

## How Kotlin Solves this?

- Kotlin changes the *type system* itself.

- there are now *two different kinds of types* : 1. Non-null type   2.Nullable Type

- *Non-Null Type*: E.g.: var name: String = "Aarav"

                    - This means this variable will always reference a string
                    - Trying to do: name = null results in a *compile time error*

- *Nullable Type* : var name: String?= null

                    - This ? means: "This variable may contain a String or it may be null"

                    - With this Kotlin forces to acknowledge that possibility and thus compiler stops before the program runs

## Safe Call (?.)

- Instead of crashing, println(name?.lenght)

- workds like:
            `if(name!=null) print(name.lenght)
            else print(null)`

- No exception is thrown.

## Elvis Operator(?:)

- Often you don't want Null but a default value: val len = name?.lenght?:0

## Smart Cast

- if(name!=null) println(name.lenght)

## Bigger Idea

- Java says *Every reference might be null*

- Kotling says *Tell me whether this reference can be null. I'll enforce that choice*

- So Kotlin bascially shifts null handling from *runtime* to *compile* time

## Why this matters?

Many values in Android can legitimately be absent:

1. Inten extras

2. Network resposnes

3. Databases fields

4. User input

5. Optional API fields

- Kotlin mnakes those possibilities explicit with nullable types(?) and forces you to handle them safely. A

- As a result, a large class of *NullPointerException* that were common in Java Android apps is eliminated before the app is ever run.


---
---