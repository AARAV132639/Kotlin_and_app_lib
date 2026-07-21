# Functional Programming

- Describe what should happen by transforming values instead of instructing the computer how to mutate state.

## 1. Four Ideas To Remember

1. *Pure Function* : Predictable, testable, no side effects

2. *Immutability*: avoid changing existing data, create new values instead

3. *Higher Order Functions* pass behaviour(functions) around as values

4. *Function Composition* solve problems by chaining small transformations into larger ones

---

## 2. Core Collection Operations in Kotlin

1. *map* : Transform every element

2. *mapNotNull* : Transform while discarding null results

3. *filter* : Keep mathcing elements

4. *filterNot*: Remove matching elements

5. *flatMap* : Transform and flatten nested collections

6. *associateBy* : Build a map keyed by a property

7. *groudBy* : Group elements into lists by a key

8. *partition*: split into matching and non-matching elements

9. *zip* : combine two collections element-wise

10. *fold* : reduce with an initial value

11. *reduce* : Reduce without an explicity inital value

12. *Count* : Count matching elements

13. *any* : check is any element matches

14. *all* : Check if all elements match

15. *none* : Check if no elements match

---

## 3. Important Definitions and Key terms

1. **Function** : A reusable block of code that takes input and returns output. 
`fun square(x:Int)=x*x`

2. **Pure Function** : A function that always produces the same output for the same input and has no side effects.
`fun add(a:Int, b: Int) = a+b`

3. **Impure Function** : A function that depends on or modifies external state.
`println(x)` or modifying a global variable

4. **Side Effect** : Any observable effect besides returning a vaule. 
- Printing, database, writes, file I/O, network calls

5. **Immutable** : Cannot be changed after creating.
` val numbers = listOf(1,2,3)`

6. **Immutable** : Cannot be changed after creating
`val numbers = mutableListOf(1,2,3)`

7. **Referntial Transparency** :  An expression can be replaced by its value without changing program behaviour
`square(5) --> 25`

8. **Expression** : Produces a value
`if(x>0) "yes" or "no"`

9. **Statement** : Performs an action but doesn't primarily produce a value.
- Traditional for loop

10. **Higher Order Function**: A function that accepts or returns another function
- map, filter, fold

11. **Lambda** : an anonymous function
`{x->x*2}`

12. **Function type** : A type representing a function
`(Int)->String`

13. **Closure** : A lambda that captures variables from its surrounding scope
`{count++}`

14. **Pipeline** : A sequence of tranformations.
`list.filter{}.map{}.sum()`

15. **Lazy Evaluation**: Computer value only when needed. `asSequence`

16. **Mapping** : Transform each element independently. `map{it*2}`

17. **Filtering** : Keep only elements satisfying a condition `filter{it>10}`

18. **Flat mapping** : Transform and flatten nested collections. `flatMap{it.items}`

19. **Reduction** : Combine many values into one. fold||reduce

20. **Fold** : Reduce with an explicit initial value. `fold(0){acc, x->acc+x}`

21. **Reduce**: Reduce using the first element as the initial accumulaor `reduce {a,b -> a+b}`

22. **Accumulator** : The running result during a fold or reduce. 
- acc in fold

---

## 4. Mental Model

1. Instead of: Program --> Variables --> Mutation --> Loops --> State

2. Think: Input --> Transformation --> Transformation -->....--> Output

---
---