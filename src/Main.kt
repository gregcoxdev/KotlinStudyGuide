import java.util.*
import kotlin.time.measureTime

//TIP <b>2.1 Remove Dups:</b> Write code to remove duplicates from an unsorted linked list. As a follow-up, how would
//you solve this problem if a temporary buffer is not allowed?
fun main() {
    val tests = listOf(
        createSinglyLinkedList(10, 3),
        createSinglyLinkedList(3, 3),
        createSinglyLinkedList(1, 1)
    )
    tests.forEach { test ->
        var result: Node?
        val duration = measureTime {
            result = removeDups(test)
        }
        println("Test [${test}] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
    }
}

fun removeDups(headNode: Node?): Node? {
    return null
}