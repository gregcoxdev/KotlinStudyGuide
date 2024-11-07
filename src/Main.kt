import java.util.*
import kotlin.time.measureTime

//TIP <b>2.2 Return Kth to Last:</b> Implement an algorithm to find the kth to last element of a singly linked list.
fun main() {
    val tests = listOf(
        Triple(createSinglyLinkedList(10, 500), 10, 2),
        Triple(createSinglyLinkedList(3, 500), 3, 0),
        Triple(createSinglyLinkedList(1, 500), 1, 1)
    )
    tests.forEach { test ->
        var resultSize: Node?
        val durationSize = measureTime {
            resultSize = findKthToLastGivenSize(test.first, test.second, test.third)
        }
        println("Test [${test.first}] completed with the result [$resultSize] in ${durationSize.inWholeMilliseconds} milliseconds.")

        var resultNoSize: Node?
        val durationNoSize = measureTime {
            resultNoSize = findKthToLastGivenNoSize(test.first, test.third)
        }
        println("Test [${test}] completed with the result [$resultNoSize] in ${durationNoSize.inWholeMilliseconds} milliseconds.")
    }
}

fun findKthToLastGivenSize(headNode: Node?, size: Int, k: Int): Node? {
    println("Starting test for $headNode.")
    var currentNode = headNode
    var index = 0
    val targetIndex = size - k
    while (currentNode != null) {
        if (index == targetIndex) {
            println("We are at the target. index[$index], value=[${currentNode.value}]")
            break
        } else {
            currentNode = currentNode.next
            index += 1
        }
    }
    return currentNode
}

fun findKthToLastGivenNoSize(headNode: Node?, k: Int): Node? {
    println("Starting test for $headNode.")
    // Iterate through the entire list to get the size, then do the same thing given the size, this becomes O(n^2).
    return headNode
}