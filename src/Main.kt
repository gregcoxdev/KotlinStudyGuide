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
 * Explain your rationale here.
 */
fun makeMyQueue(): MyQueue {
    return MyQueue()
}

class MyQueue() {

}