import java.util.*
import kotlin.time.measureTime

//TIP <b>3.5 Sort Stack:</b> Write a program to sort a stack such that the smallest items are on the top. You can use an
// additional temporary stack, but you may not copy the elements into any other data structure (such as an array). The
// stack supports the following operations: push, pop, peek and isEmpty.
fun main() {
    val duration = measureTime {
        val sortedStack = SortedStack()
        sortedStack.push(5)
        println("Peek at the top: ${sortedStack.peek()}")
        sortedStack.push(3)
        println("Peek at the top: ${sortedStack.peek()}")
        sortedStack.push(7)
        println("Peek at the top: ${sortedStack.peek()}")
        sortedStack.push(4)
        println("Peek at the top: ${sortedStack.peek()}")
        sortedStack.push(6)
        println("Peek at the top: ${sortedStack.peek()}")
        sortedStack.push(10)
        println("Stack sorted: ${sortedStack.stack}")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
        println("Sorted Stack Peek: value=[${sortedStack.peek()}]")
        println("Sorted Stack Pop: value=[${sortedStack.pop()}], isEmpty=[${sortedStack.isEmpty()}]")
    }
    println("Test completed in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * You probably should do the sorting in the peek or pop methods so that way you can push multiple times with extra
 * overhead.
 */
fun makeSortedStack(): SortedStack {
    return SortedStack()
}

class SortedStack {

    val stack: Stack<Int> = Stack()
    val sortingStack: Stack<Int> = Stack()

    fun push(value: Int) {
        if (stack.isEmpty() || value <= stack.peek()) {
            stack.push(value)
            println("Pushed $value, stack=[$stack].")
        } else {

            while (stack.isNotEmpty() && stack.peek() < value) {
                println("Value [$value] is higher than the top of the stack. stack=[$stack]")
                val popped = stack.pop()
                println("Popped stack: $stack")
                sortingStack.push(popped)
                println("Pushed sorting stack: $sortingStack")
            }

            sortingStack.push(value)
            println("Pushed actual value to sorting stack: $sortingStack")

            while(sortingStack.isNotEmpty()) {
                val popped = sortingStack.pop()
                println("Popped sorting stack: $sortingStack")
                stack.push(popped)
                println("Pushed stack: $stack")
            }
        }
    }

    fun pop(): Int {
        return stack.pop()
    }

    fun peek(): Int {
        return stack.peek()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }
}