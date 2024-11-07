import java.util.*
import kotlin.time.measureTime

//TIP <b>3.5 Sort Stack:</b> Write a program to sort a stack such that the smallest items are on the top. You can use an
// additional temporary stack, but you may not copy the elements into any other data structure (such as an array). The
// stack supports the following operations: push, pop, peek and isEmpty.
fun main() {
    val duration = measureTime {
        val sortedStack = SortedStack()
        sortedStack.push(5)
        sortedStack.push(3)
        sortedStack.push(7)
        sortedStack.push(24)
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
    }
    println("Test completed in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Write your rationale here.
 */
fun makeSortedStack(): SortedStack {
    return SortedStack()
}

class SortedStack {

    fun push(value: Int) {

    }

    fun pop(): Int {
        return -1
    }

    fun peek(): Int {
        return -1
    }

    fun isEmpty(): Boolean {
        return true
    }
}