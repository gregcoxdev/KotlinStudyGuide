import kotlin.time.measureTime

//TIP <b>2.3 Delete Middle Node:</b> Implement an algorithm to delete a node in the middle (i.e., any node but the first
//and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
fun main() {
    val tests = listOf(
        createSinglyLinkedList(9, 500),
        createSinglyLinkedList(4, 500),
        createSinglyLinkedList(2, 500),
        createSinglyLinkedList(1, 500)
    )
    tests.forEach { test ->
        var result: Node?
        val durationSize = measureTime {
            result = deleteAnyMiddleNode(test)
        }
        println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
    }
}

fun deleteAnyMiddleNode(headNode: Node?): Node? {
    println("Test started with headNode: $headNode")
    if (headNode?.next == null) return headNode // Is only a size 1 linked list.
    if (headNode.next?.next == null) return headNode // Is only a size 2 linked list.
    headNode.next = headNode.next?.next // You can keep iterating through here until you find one you want to delete.
    return headNode
}