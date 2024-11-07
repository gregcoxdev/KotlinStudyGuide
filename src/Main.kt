import kotlin.time.measureTime

//TIP <b>2.6 Palindrome:</b> Implement a function to check if a linked list is a palindrome.
fun main() {
    val tests = listOf(
        createSinglyLinkedList("racecar"),
        createSinglyLinkedList("exit"),
        createSinglyLinkedList("a"),
        createSinglyLinkedList("")
    )
    tests.forEach { test ->
        var result: Boolean
        val durationSize = measureTime {
            result = isPalindrome(test)
        }
        println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
    }
}

/**
 * Explain rationale here.
 */
fun isPalindrome(headNode: Node?): Boolean {
    println("Test started with head node [$headNode].")
    return false
}