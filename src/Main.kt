import java.util.*
import kotlin.time.measureTime

//TIP <b>3.4 Queue via Stacks:</b> Implement a MyQueue class which implements a queue using two stacks.
fun main() {
    val duration = measureTime {
        val myQueue = makeMyQueue()
    }
    println("Test completed in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * One way would be to push everything into a single stack, then as we pop, pop everything up until the last node, which
 * would give us the "top" of the queue. Put the rest in the stack again. There are ways to optimize this, by
 * potentially keeping a sorted stack after the first pop (sort when you add it all back in the stack again) and then
 * going through that stack until it's empty then re-sorting again when you pop.
 */
fun makeMyQueue(): MyQueue {
    return MyQueue()
}

class MyQueue() {

}