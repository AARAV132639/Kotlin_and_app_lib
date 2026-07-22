# Coroutines in Kotlin

## Important Insights

### 1. What is a Coroutine?

- A *coroutine* is a lightweight unit of concurrent execution managed by Kotlin

- Unlike a thread: 
                    1. A thread is managed by the operating system
                    2. A coroutine is managed by the Kotlin runtime

- Thousands of coroutines can ruin using only a small number of threads.

### 2. Why Coroutines?

- Imagine downloading a file

- Without coroutines: Download ---> Wait---> UI freezes

- With Coroutines : Download starts ---> UI continues responding ---> Resume when data arrives

- This keeps applications responsive

    3. *launch* : starts a coroutine that does not return a value. Returns a *Job*

    4. *async* : Starts a coroutine that returns a value. Returns a *Deferred <T>*

    5. *delay() vs Thread.sleep()* : `delay(1000)` suspends only the coroutine, allowing the underlying thread to do other work. `Thread.sleep(1000)` blocks the entire thread, preventing it from doing anything else during that time

    6. *suspend* : a suspend function can pause and later resume its execution without blocking the thread.
                - It can only be called from another coroutine or another suspend function
    
    7. *Dispatchers* : Choose which thread pool executes the coroutine. 
                        
                        -`Dispatchers.Default`
                        - CPU intensive work
                        - E.g. sorting, image processing, mathematical computations
    
    8. *Structured Concurrency* : child coroutines belong to their patent scope. When the parent completes or is cancelled its children are managed automatically. 
    - This avoids "orphaned" background tasks and makes coroutine lifecycles predictable

## Android Relevance

- Coroutines are used extensively throughout modern Android:

1. Network Calls (retrofit)

2. Room databse operations

3. DataStore reads and write

4. Flow for asynchronous streams

5. ViewModel using *viewModelScope*

6. Jetpack Compose side effects

---
---

