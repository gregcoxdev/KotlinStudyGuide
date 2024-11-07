import kotlin.time.measureTime

//TIP <b>2.7 Intersection:</b> Given two (singly) linked lists, determine if the two lists intersect. Return the
// intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of
// the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are
// intersecting.
//<br><br>
//FOLLOW-UP<br>
//Find the intersecting node, if possible.
fun main() {
    val nodes = createInterconnectedSinglyLinkedList()
    var result: Boolean
    val durationSize = measureTime {
        result = isIntersecting(nodes.first, nodes.second)
    }
    println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain rationale here.
 */
fun isIntersecting(firstHeadNode: Node?, secondHeadNode: Node?): Boolean {
    println("Test started with first head node [$firstHeadNode], second head node [$secondHeadNode].")

    // Traverse first head.
    var currentFirstHeadNode = firstHeadNode
    while (currentFirstHeadNode?.next != null) {
        currentFirstHeadNode = currentFirstHeadNode.next
    }

    // Traverse second head.
    var currentSecondHeadNode = secondHeadNode
    while (currentSecondHeadNode?.next != null) {
        currentSecondHeadNode = currentSecondHeadNode.next
    }

    // Determine if the last nodes are equal references.
    return currentFirstHeadNode == currentSecondHeadNode
}

fun findIntersectingNode() {
    // To accomplish this, we should get the sizes of both, then remove off the top of the longer one until they have
    // equal sizes. Once we do this, we should be able to iterate through both at the same time and check if they are
    // the same node at any given point.
}