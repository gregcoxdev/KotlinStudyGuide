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
    println("Starting test for $headNode.")
    val dataSet = mutableSetOf<Int>()
    var currentNode = headNode
    var prevNode: Node? = null
    if (headNode == null) return null
    while (currentNode != null) {
        if (dataSet.contains(currentNode.value)) {
            println("Value [${currentNode.value}] was already in the data set, removing $currentNode.")
            prevNode?.next = currentNode.next // Set the previous next reference to this node's next reference, deleting this nodes reference.
            currentNode = currentNode.next // Set the current node to the next one and repeat the loop.
        } else {
            println("Added [${currentNode.value}] to the data set.")
            dataSet.add(currentNode.value)
            prevNode = currentNode // Update the previous node to this one.
            currentNode = currentNode.next // Set the current node to the next one and repeat the loop.
        }
    }
    return headNode
}

fun removeDupsNoBuffer(headNode: Node?): Node? {
    // Perform O(n^2) iterating through all the nodes taking a look at the value, then go through all the nodes again,
    // deleting the nodes that match that value.
    return null
}