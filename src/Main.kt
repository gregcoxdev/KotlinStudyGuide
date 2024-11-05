import kotlin.time.measureTime

//TIP <b>1.1 Is Unique:</b> Implement an algorithm to determine if a string has all unique characters. What if you cannot
//use additional data structures?
fun main() {
    val testCases = listOf("value1", "value2", "value3")
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = performTest(test)
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun performTest(test: String): Boolean {
    return false
}