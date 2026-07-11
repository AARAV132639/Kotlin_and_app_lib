# Learning Insights

1. The default *mutableSetOf()* in Kotlin is backed by *LinkedHashSet*, so it preserves insertion order in practice, but the important property of a set is uniqueness, not ordering

2. One of the Kotlin's biggest desing choices is the distinction between *read-only* and *mutable* collections. [to be looked up further]

3. The act of iterating over a map uses Kotlin's *destructuring declaration* a concise feature frequently encountered in production code

4. For Android and modern Kotlin development higher order functions with collections will be used more instead of explicit loops

`val nums = listOf(1,2,3,4,5)

println(nums.filter{it%2==0}) //{2,4}
println(nums.map(it*it)) //{1,4,9,16,25}
println(nums.any{it>4}) //true
println(nums.sum()) //15`

- These functional operations (map, filter, reduce, fold etc) are used extensively in Android, Jetpack compose and Kotlin backend development.

---
---