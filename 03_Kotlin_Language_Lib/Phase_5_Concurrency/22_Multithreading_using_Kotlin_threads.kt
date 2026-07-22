//Experiment 9: Mutlithreading using kotlin threads
/*
- Creating threads
- Using thread{}
- Using a thread object
- sleep()
- join()
- Synchronization(@Synchronized)
*/

import kotlin.concurrent.thread

class Counter{
    var count =0

    @Synchronized
    fun increment(){
        count++
    }
}

fun main()
{
    println("--Using thread{}--")
    val t1 = thread{
        for( i in 1..5)
        {
            println("Thread-1:$i")
            Thread.sleep(500)
        }
    }

    println("\n---Using Thread Class---")

    val t2 = Thread{
        for(i in 1..5)
        {
            println("Thread-2: $i")
            Thread.sleep(500)
        }
    }

    t2.start()

    //wait for both threads
    t1.join()
    t2.join()

    println("--Synchronization---")

    val counter = Counter()

    val worker1 = thread{
        repeat(1000)
        {
            counter.increment()
        }
    }


    val worker2 = thread{
        repeat(1000)
        {
            counter.increment()
        }
    }

    worker1.join()
    worker2.join()

    println("final count= ${counter.count}")
    println("\n Main Thread Finished")
}

