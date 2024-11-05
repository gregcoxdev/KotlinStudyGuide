import kotlin.time.measureTime

//TIP <b>1.1 Is Unique:</b> Implement an algorithm to determine if a string has all unique characters. What if you cannot
//use additional data structures?
fun main() {
    val testCases = listOf("", "a", "ab", "abba", "abc", "a?2", "abcdefgha")
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = isUnique(test)
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun isUnique(test: String): Boolean {
    val charSet: MutableSet<Char> = mutableSetOf()
    test.forEach { char ->
        if (charSet.contains(char)) return false else charSet.add(char)
    }
    return true
}