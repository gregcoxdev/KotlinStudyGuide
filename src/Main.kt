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
 * We have to iterate through the entire thing in order to tell. Since we don't have the length in a Linked List, we
 * don't know when we should realistically begin mirroring to determine it's a palindrome.
 */
fun isPalindrome(headNode: Node?): Boolean {
    println("Test started with head node [$headNode].")
    var currentNode = headNode
    var palindromeStringBuilder = StringBuilder()
    var size = 0
    while (currentNode != null) {
        size += 1
        palindromeStringBuilder.append(currentNode.value)
        currentNode = currentNode.next
    }
    if (size == 0 || size == 1) return true
    val hasActualMidpoint = size % 2 == 1
    val actualMidpoint = size.div(2)
    if (hasActualMidpoint) {
        val firstHalf = palindromeStringBuilder.substring(0, actualMidpoint)
        val secondHalf = palindromeStringBuilder.substring(actualMidpoint + 1, size).reversed()
        return firstHalf == secondHalf
    } else {
        val firstHalf = palindromeStringBuilder.substring(0, actualMidpoint)
        val secondHalf = palindromeStringBuilder.substring(actualMidpoint, size).reversed()
        return firstHalf == secondHalf
    }
}