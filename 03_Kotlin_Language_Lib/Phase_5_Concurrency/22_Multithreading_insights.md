# Multithreading using Kotlin Threads

## Important Learning Insights

1. What is a thread?

- A thread is the smallest unit of execution within a process

- Multiple threads allow tasks to run concurrently

2. Why use multithreading?

- Without threads each task wait for the previous ones

- With multiple threads improves responsiveness and resource utilization

3. Creating Threads in Kolin

- Using Kotlin helper: thread{ println("Hello")}

- Or using the JVM Thread class : Thread{ println("Hello")}.start()

- The *thread{}* function is a Kotlin conveniece wrapper around Thread.

4. start() vs run()

- *thread.start()* creates a new thread

- *thread.run()* executes on the current thread like a normal function call.

5. sleep()

- *Thread.sleep(1000)* pauses the current thread for approximately one second

6. join()

- *join()* The calling thread waits until worker finishes execution

- without join() the main thread may finish before background threads complete

7. Synchronization

- Synchroniaztion ensures only one thread executes the method at a time, preventing race conditions

---

## Android & Modern Kotlin Note

- For *Android Development* one should rarely create raw threads yourself.

- Modern Kotlin favours *coroutines* because they are lightweight, easier to read and integrate well with Android architecture components.

---
---