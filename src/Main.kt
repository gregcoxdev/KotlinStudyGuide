import kotlin.time.measureTime

//TIP <b>1.3 URLify:</b> Write a method to replace all spaces in a string with '%20'. You may assume that the
//string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of
//the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in
//place.)
//<br><br>
//TIP <b>EXAMPLE</b>
//<br>Input: string=["Mr John Smith      "], length=[13]
//<br>Output: string=["Mr%20John%20Smith"]
fun main() {
    val testCases = listOf(Pair("Mr John Smith      ", 13), Pair("a  ", 2), Pair("a b", 3), Pair("     ", 3))
    testCases.forEach { test ->
        val result: String
        val duration = measureTime {
            result = urlify(test.first, test.second)
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun urlify(stringToUrlify: String, size: Int): String {
    val newString = StringBuilder().apply {
        stringToUrlify.forEachIndexed { index, char ->
            if (index >= size) return@forEachIndexed
            val newString = if (char == ' ') "%20" else char
            append(newString)
        }
    }
    return newString.toString()
}