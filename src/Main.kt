import kotlin.time.measureTime

//TIP <b>3.1 Three in One:</b> Implement (or describe) three stacks using one array.
fun main() {
    var result: IntArray
    val durationSize = measureTime {
        result = makeTripleStackArray()
    }
    println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain rationale here.
 */
fun makeTripleStackArray(): IntArray {
    return intArrayOf()
}