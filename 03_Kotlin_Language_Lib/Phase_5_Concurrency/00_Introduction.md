# Concurrecny in Kotlin

- Ability of a program to perform multiple tasks at the same time (or appear to do so) without blocking the entire application

- The goal is efficient utilization of CPU and resources, making applications responsive, scalable and faster

## Need for Concurrency

- Image the app has to:
                        1. Download a file from the internet
                        2. Read a large database
                        3. Process an image
                        4. Wait for user input

- If everything happens to *one thread* every waiting operations blocks everything else.

- With concurrency: UI stays responsive while background work continues.

## Real World Examples

### 1. WhatsApp:
                - Receive messages
                - Send messages
                - Download images
                - Upload status
                - Play voice notes

All happen concurrently.

### 2. Browser:
                - Download HTMl
                - Download CSS
                - Download JavaScript
                - Load images
                - Play videos
These tasks run concurrently

### 3. Food Delivery App
                        - Fetch nearby restraunts
                        - Load Menu Images
                        - Check offers
                        - Refresh GPS

## Problmes Concurrency solves

- Without Concurrency:
                        o Frozen UI

                        o Wasted CPU time

                        o Poor responsiveness

                        o Slow applications

- With concurrency:
                        o Responsive UI

                        o Better CPU utilization

                        o Faster execution for independent tasks

                        o Better user experience

## How Kotlin achieves concurrency

1. Threads (Thread)

2. Coroutines

3. Executors/Thread Pools (Java Interoperatbility)

Coroutines are Kotlin's preferred solution because they are *lightweight* easy to write and can suspend without blocking threads

## Key Terms

1. Process : A running program

2. Thread : A lighweight unit of execution inside a process

3. Concurrency : Multiple tasks making a progress together

4. Parallelism : Tasks execution simultaneously on different CPU cores

5. Blocking : A thread waits and cannot do other work

6. Non blocking : A task waits without occupying the thread (common with coroutines)

## Important Points to remember:

1. Concurrency is the ability of a program to execute multiple independent tasks in an overlapping manner, improving responsiveness and resource utiliztion

2. Kotlin primarily achieves concurrency using lightweight coroutines instead of creating many heavyweights threads.

3. Concurrency improves *responsiveness* not necessarily speed

4. Parallelism requires multiple CPU cores

5. Threads are *heavyweight* (higher memory and context switching cost)

6. The biggest use case is handling *I/O bound tasks* (network, database, file operations) without blocking the main thread.

---
---