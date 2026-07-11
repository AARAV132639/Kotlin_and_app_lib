# Insights : Basic Implementations of functions

1. Why should we prefer *val* over *var*?

- val makes code safer, easier to reason about and prevents accidental reassignment. 
- Use var only when mutation is required

---

2. Why does Kotlin need fewer overloaded mehtods than Java?

- Default argumenhts replace method overloading. Hence one function replaces multiple overloaded methods.

---

3. Named Arguments improve readability

- Instead of : displayStudent("Aarav","B.tech","3)

- write: displayStudent(
    year = 3,
    name = "Aarav",
    course = "B.tech"
)

- This makes calls self documenting

---

4. *Functions are First Class Citizens*

- Functions can be: Stored in variables||Passed as parameters|| Returned from functions

- This is foundation of Kotlin's functional programming style

---

5. *Lambdas are everywhere*

- Android APIs such as button click listeners use lambdas:
                                                
                                                `button.setOnClickListener{
                                                    println("Clicked")
                                                }`


- Instead of the verbose Java approach: 
                                      
                                      `button.setOnClickListener(newView.OnClickListener(){
                                        @Override
                                        public void onClick(View v)
                                        {

                                        }
                                      });`

- Understanding lambdas is essential for Android Development

---

6. Higher-order Functions

- functions that accept other functions

- Kotlin's standard library is built around higher-order functions

- E.g.: map() filter() forEach() sortedBy()


---

7. Trailing Lambda Syntax

- Instead of : calculate(5,6{a,b->a+b})

- Kotlin allows: calculate(5,6){a,b->a+b}

- This is called *trailing lambda syntax* and is extremely common in Kotlin codebases.

---

8. Single expression functions are concise and commonly seen in production types.

9. Function types

- A function itself has a type: {Int,Int}->Int

- Means: takes two IntS, returns one Int
---

10. vararg

- Instead of sum(1,2,3,4,5) passing an array requires the spread operator

- val arr = intArrayOf(1,2,3)   sum(*arr)

- The * (spread operator) is a unique in its own kind.

---

*Lambdas, Higher order functions and function types are used extensively in Android Developement (JetPack Compose, Coroutines, flow, collection APIs) and modern Kotlin code, hence making them the highest value topics to master*