import kotlin.time.measureTime

//TIP <b>1.5 One Away:</b> There are three types of edits that can be performed on strings: Insert a character, remove a
//character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits)
//away.
//<br><br>
//TIP <b>EXAMPLE</b>
//<br>Input: firstString=["pale"], secondString=["ple"]
//<br>Output: boolean=[True]
//<br>Input: firstString=["pales"], secondString=["pale"]
//<br>Output: boolean=[True]
//<br>Input: firstString=["pale"], secondString=["bale"]
//<br>Output: boolean=[True]
//<br>Input: firstString=["pale"], secondString=["bake"]
//<br>Output: boolean=[False]
fun main() {
    val testCases = listOf(Pair("pale", "ple"), Pair("pales", "pale"), Pair("pale", "bale"), Pair("pale", "bake"), Pair("pale", "pl"), Pair("a", ""), Pair("a  ", "a"))
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = isOneAway(test.first, test.second)
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun isOneAway(firstString: String, secondString: String): Boolean {
    return false
}