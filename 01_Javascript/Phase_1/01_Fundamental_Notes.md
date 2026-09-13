# Phase 1: Important Points

## 1. Variables

1. Use *const* by default. Const prevents reassignment, not mutation.

2. Use *let* when the variable need resassignement.

3. Avoid *var* in modern Javascript unless you specifically need to understand legacy code

## 2. Data types

1. *Primitive* : string number boolean undefined null bigint symbol

2. *Reference types* : object array function

- *typeof null* return object [historical javascript behaviour]

## 3. Operators

- Prefer a===b over a==b because == performs type coercion

## 4. Arrow Functions

- Arrow functions have different behaviour for *this, arguments, constructors* etc.

- There are not always interchangeable with regular function.

## 5. Default Parameters
- Provide a fallback parameter: function pwer(number,exponent =2){...}

- Here if no value is passed in exponent it will take value as 2

## 6. Rest Paramets

- Collects multiple arguments into an array
- Rest collects, spread expands

## 7. Spread Operator [...]
- Spread creates a shallow copy.
- It does not deeply clone nested objects.

## 8. Arrays methods

push()  pop()   shift()   unshift() slice() splice()    includes()  indexof()   find()  filter()    map()   reduce()    some()  every()

- *map()* transforms every item.

- *filter()* keeps matching items.

- *find()* returns the first matching element.

- *reduce()* reduces an array to one value.

## 9. Destructuring

- Extract values from arrays/objects.

## 10. Optional Chaining

- Safely access nested properties

## 11. Nullish Coalescing ??

- Provides a fallback only for: null undefined

- E.g: const precision = user.precison??2;
        - if user.precision = undefined; then precision =2

## 12. ES Modules
- Modules allow us to split a project into manageable files.
