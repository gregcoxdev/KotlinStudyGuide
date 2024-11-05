import kotlin.time.measureTime

//TIP <b>1.4 Palindrome Permutation:</b> Given a string, write a function to check if it is a permutation of a palindrome. A palindrome
//is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The
//palindrome does not need to be limited to just dictionary words. You can ignore casing and non-letter characters.
//<br><br>
//TIP <b>EXAMPLE</b>
//<br>Input: string=["Tact Coa"]
//<br>Output: boolean=[True] (permutations: "taco cat", "atco cta", etc.)
fun main() {
    val testCases = listOf("tact coa", "cviic", "cigar to go tragic", "was it a cat i saw?", "abc", "baa b", "")
    testCases.forEach { test ->
        val result: Boolean
        val duration = measureTime {
            result = isPalindromePermutation(test)
        }
        println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun isPalindromePermutation(string: String): Boolean {
    val stringWithOnlyLetters = string.lowercase().filter { it.isLetter() }
    val charMap = hashMapOf<Char, Int>()
    stringWithOnlyLetters.forEach {
        if (charMap[it] != null) {
            charMap.remove(it)
        } else {
            charMap[it] = 1
        }
    }
    println("Remaining character map for [$string] is [$charMap].")
    return charMap.size <= 1
}