import kotlin.time.measureTime

//TIP <b>1.9 String Rotation:</b> Assume you have a method isSubstring which checks if one word is a substring of another.
//Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
//(e.g., "waterbottle" is a rotation of "erbottlewat").
fun main() {
    val tests = listOf(Pair("waterbottle", "erbottlewat"), Pair("aa", "aa"), Pair("", ""), Pair("shirt", "pants"))
    tests.forEach { test ->
        var result: Boolean? = null
        val duration = measureTime {
            result = isStringRotation(test.first, test.second)
        }
        println("Test [${test}] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun isStringRotation(s1: String, s2: String): Boolean {
    val s3 = s1 + s1
    return s3.contains(s2)
}