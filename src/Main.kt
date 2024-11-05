import java.util.*
import kotlin.math.abs
import kotlin.math.max
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
    val testCases = listOf(Pair("pale", "ple"), Pair("pales", "pale"), Pair("pale", "bale"), Pair("pale", "bake"), Pair("pale", "pl"), Pair("a", ""), Pair("a  ", "a"), Pair("ple", "pale"), Pair("pale", "pale"), Pair("peal", "pale"))
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = isOneAway(test.first, test.second, 1)
        }
        println("---> Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun isOneAway(firstString: String, secondString: String, numberOfDifferencesMax: Int): Boolean {

    if (firstString == secondString) return true
    val numberOfActualDifferences = when {
        firstString.length == secondString.length -> checkReplacements(firstString, secondString)
        firstString.length > secondString.length -> checkDifferences(firstString, secondString)
        else -> checkDifferences(secondString, firstString)
    }
    println("Testing [$firstString] and [$secondString] resulted in $numberOfActualDifferences differences.")
    return numberOfActualDifferences <= numberOfDifferencesMax
}

private fun checkReplacements(first: String, second: String): Int {
    var numberOfActualDifferences = 0
    first.forEachIndexed { index, char ->
        if (char != second[index]) {
            numberOfActualDifferences += 1
        } else {
            // No difference, continue.
        }
    }
    return numberOfActualDifferences
}

private fun checkDifferences(first: String, second: String): Int {
    var numberOfActualDifferences = 0
    val secondCharList = second.toMutableList()
    first.forEachIndexed { index, char ->
        if (index < secondCharList.size && secondCharList[index] == char) {
            // No difference here.
        } else {
            secondCharList.add(index, char)
            numberOfActualDifferences += 1
        }
    }
    return numberOfActualDifferences
}