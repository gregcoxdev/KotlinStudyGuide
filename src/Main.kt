import java.util.*
import kotlin.time.measureTime

//TIP <b>3.3 Stack of Plates:</b> Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
// Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. Implement
// a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a
// new stack once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave identically
// to a single stack (that is, pop() should return the same values as it would if there were just a single stack).
//<br><br>
// FOLLOW-UP<br>
// Implement a function popAt(index: Int) which performs a pop operation on a specific sub-stack.
fun main() {
    val duration = measureTime {
        val setOfStacks = makeSetOfStacks(20)
        for (i in 0..100) {
            setOfStacks.push(i)
        }
        val value = setOfStacks.pop()
    }
    println("Test completed in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * To accomplish this, create a list of stacks.
 *
 * When you push, if the list is empty, create a stack and push to it, then add that to the list. If the list isn't
 * empty, check the first stack if it exceeds the threshold, if it does, create a new stack and add that item to it.
 * Then insert that stack at the 0th index of the list so it's at the front.
 *
 * When you pop, look at the 0th index of the list, pop from that stack. If the stack is empty, remove it from the list.
 *
 * When you popAt, access the index of the list and pop from that stack.
 */
fun makeSetOfStacks(threshold: Int): SetOfStacks {
    return SetOfStacks(threshold)
}

class SetOfStacks(threshold: Int) {

    private val listOfStacks: List<Stack<Int>> = listOf()

    fun push(value: Int): Unit {
    }

    fun pop(): Int {
        return -1
    }

}