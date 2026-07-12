# String manipulation and extension function 

1. String Manipulation

2. Extension Function ( a Kotlin specific feature heavily used in Android development)

## Important Insights

1. String are Immutable: uppercase() does not modify s. Instead, it returns a new String. Just like Java

2. String Interpolaton : One of the nicest features of Kotlin

3. Extension functions: Normally one cannot modify the *string* calss but Kotlin allows: `fun String.isPalindrome():Boolean` Now every string appears to have a new function: "mada".isPalindrome()

4. Extension functions cannot access private members. Since they are not true class members, they only have access to the class's public API

5. Extension Properties: *val String.firstCharacter* looks like a real property: text.firstCharacter but it's implemented as a *getter*

- Extensionn properties cannot have backing fields, so they cannot store data.

6. Extension functions use *static dispatch* not *dynamic dispatch* [look up]


---
---