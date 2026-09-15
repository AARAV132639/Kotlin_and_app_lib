# Asynchronous Programming in Javascript

## 1. Must remember 5 rules

- Javascript execution is primarily single-threaded.

- Async operation don't block the main call stack.

- Promises represent eventual completion/failure.

- *async/await* is syntax built around promises

- Independent async work can often run concurrently with *Promise.all()*


2. **Javascript is single-threaded, but asynchronous**

- Asynchronous behaviour is provided by JavaScript Runtime(browser or Node.js) which handles operations outside the call stack.

3. **Event Loop**

- The event loop coordinates: 1. Call stack 
                              2. Web/Node APIs
                              3. Task(macrotask) queue
                              4. Microtask queue

- The event loop keeps checking when the call stack is empty and then schedules the queued work.

3. *Callbacks are the oldest pattern*

- A callback is a function executed after an asynchronous operation completes.
- The problem with many dependent callbacks is callback hell.
- Promise & async/await largely solve this readability problem.

4. *Promises represent future results*

- Promise has three states: Pending followed by Fullfilled or Rejected

- Promise itself is not the asynchronous operation. 

- It is an object representing the eventual result of an asynchronous operation

5. *async/await* is the preferred syntax for many cases.

- *async* function always returns a Promise

- *await* pauses the async function, not the entire Javascript program

6. *Important Promise Combinators*

- *Promise.all()* : Wait for everything: reject if one rejects.

- *Promise.allSettled()*: wait for everything, regardless of success/failure. Useful when outcome of every task is needed.

- *Promise.race()*: returns the first promise that settles.

- *Promise.any()*: returns the first promise that fulfills.

7. *Microtasks vs macrotasks*

- Promise callbacks are *microtasks*
- Generally : Synchronous code --> microtasks --> next task/macrotask
- This explains many seemingly confusing event-loop questions

8. *await* doesn't make code synchronous

- *await* causes the rest of the async function to continue later, via the Promise/microtask mechanism

9. Don't serialize indepenendent work

10. Async opertions can finish in any order. If ordering matters, explicity enforce it with *await*, promise chaining, or another synchronization mechanism.