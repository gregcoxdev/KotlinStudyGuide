import kotlin.time.measureTime

//TIP <b>3.2 Stack Min:</b> Describe or implement how you would design a stack which, in addition to push and pop, has a
// function min which returns the minimum element? Push, pop, and min should all operate in O(1) time.
fun main() {
    var result: IntArray
    val durationSize = measureTime {
        result = makeMinStack()
    }
    println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
}

/**
 * You could use a separate stack to track minimum value as you go. When a value is pushed, if it's less than or equal
 * to the previous min, then push it to the min stack. When it's popped, you can pop the original stack and check if
 * it's equal to min, if it's equal to min, then pop the min stack too. This should always keep the lowest on top.
 */
fun makeMinStack(): IntArray {
    return intArrayOf()
}