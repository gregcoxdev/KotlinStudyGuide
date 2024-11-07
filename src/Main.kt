import java.util.*
import kotlin.time.measureTime

//TIP <b>2.2 Return Kth to Last:</b> Implement an algorithm to find the kth to last element of a singly linked list.
fun main() {
    val tests = listOf(
        Triple(createSinglyLinkedList(10, 3), 10, 2),
        Triple(createSinglyLinkedList(3, 3), 3, 0),
        Triple(createSinglyLinkedList(1, 1), 1, 1)
    )
    tests.forEach { test ->
        var resultSize: Node?
        val durationSize = measureTime {
            resultSize = findKthToLastGivenSize(test.first, test.second, test.third)
        }
        println("Test [${test}] completed with the result [$resultSize] in ${durationSize.inWholeMilliseconds} milliseconds.")

        var resultNoSize: Node?
        val durationNoSize = measureTime {
            resultNoSize = findKthToLastGivenNoSize(test.first, test.third)
        }
        println("Test [${test}] completed with the result [$resultNoSize] in ${durationNoSize.inWholeMilliseconds} milliseconds.")
    }
}

fun findKthToLastGivenSize(headNode: Node?, size: Int, k: Int): Node? {
    println("Starting test for $headNode.")
    return headNode
}

fun findKthToLastGivenNoSize(headNode: Node?, k: Int): Node? {
    println("Starting test for $headNode.")
    return headNode
}