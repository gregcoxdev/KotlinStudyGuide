import kotlin.time.measureTime

//TIP <b>1.2 Check Permutation:</b> Given two strings, write a method to decide if one is a permutation of the other.
fun main() {
    val testCases = listOf(Pair("a", ""), Pair("a", "b"), Pair("ab", "a"), Pair("abc", "cab"), Pair("ab c", "abc"))
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = isPermutation(test.first, test.second)
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun isPermutation(firstString: String, secondString: String): Boolean {
    if (firstString.length != secondString.length) return false
    val firstCharMap: MutableMap<Char, Int> = mutableMapOf()
    val secondCharMap: MutableMap<Char, Int> = mutableMapOf()
    firstString.forEach { char ->
        val occurrences = firstCharMap[char] ?: 0
        firstCharMap[char] = occurrences + 1
    }
    secondString.forEach { char ->
        val occurrences = secondCharMap[char] ?: 0
        secondCharMap[char] = occurrences + 1
    }
    return firstCharMap == secondCharMap
}