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
 * Explain rationale here.
 */
fun makeMinStack(): IntArray {
    return intArrayOf()
}