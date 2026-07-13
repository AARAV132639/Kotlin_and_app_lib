# Insights regarding exception handlings

## What is an exception?

- An *exception* is an object that reprents an error occuring during program execution

## try - catch, finally

- try catch: identical to Java

- finally used for: closing files, closing database connections, closing network sockets, releasing resources

- Even if an exception occurs, *finally* still executes

## throw

- Can throw exceptions yourself: `throw IllegalArgumentException("Invalid Input")`

- Very common for validating function arguments

## Custom Experience

Useful for domain-specific errors:

- InvalidPasswordException

- PaymentFailedException

- NetworkUnavailableException

- DatabaseException

## *try* is an Expressin

- Unlike Java: 
`String result;
try{result="Success"}
catch(...){result="Failure";}`

- Kotlin:
`val result = try{"Success"}
                catch(e:Exception){"Failure"}`

- Because *try* returns a value, it fits naturally into expressions

## Checked vs Unchecked Exceptions

- This Kotlin's biggest differences from Java

- There are no *throws* declaration required by compiler

- This keeps Kotlin code less verbose but places the responsibility on the developer to handle exceptions where appropriate

## Suggested Best Practices

- In modern Kotlin, exceptions are generally reserved for *exceptional situations*

- For exprected outcomes- such as validation failures or missing data- it's often better to return *null*, a sealed resutl type, or Kotlin's built-n *Result<T>* rather than throwing exceptions for normal control flow.

- This leads to clearer, more predictable code

---
---
