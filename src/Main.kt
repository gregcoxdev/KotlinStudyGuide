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
        val setOfStacks = makeSetOfStacks()
        for (i in 0..100) {
            setOfStacks.push(i)
        }
        val value = setOfStacks.pop()
    }
    println("Test completed in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain rationale here.
 */
fun makeSetOfStacks(): SetOfStacks {
    return SetOfStacks()
}

class SetOfStacks {

    fun push(value: Int): Unit {

    }

    fun pop(): Int {
        return -1
    }

}