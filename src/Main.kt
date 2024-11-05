import kotlin.time.measureTime

//TIP <b>1.6 String Compression:</b> Implement a method to perform basic string compression using the counts of repeated
//characters. For example, the string ["aabcccccaaa"] would become ["a2b1c5a3"]. If the "compressed" string would not
//become smaller than the original string, your method should return the original string. You can assume the string has
//only uppercase and lowercase letters (a-z).
fun main() {
    val testCases = listOf(Pair("aabcccccaaa", "a2b1c5a3"), Pair("abcdefg", "abcdefg"), Pair("aBbC", "aBbC"), Pair("aabcccccCcccaaa", "a2b1c5C1c3a3"), Pair("aa", "aa"))
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = stringCompressed(test.first) == test.second
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun stringCompressed(uncompressedString: String): String {
    var lastCharCount = 0
    var lastChar = uncompressedString.first()
    val compressedStringBuilder = StringBuilder()
    uncompressedString.forEach { char ->
        if (char == lastChar) {
            lastCharCount += 1
            lastChar = char
        } else {
            compressedStringBuilder.append("$lastChar$lastCharCount")
            lastCharCount = 1
            lastChar = char
        }
    }

    // The loop finished but we didn't add the last step because nothing had changed, it just simply finished the loop.
    compressedStringBuilder.append("$lastChar$lastCharCount")

    // Build the string and compare it against the length of the uncompressed string.
    val compressedString = compressedStringBuilder.toString()
    return if (compressedString.length < uncompressedString.length) compressedString else uncompressedString
}