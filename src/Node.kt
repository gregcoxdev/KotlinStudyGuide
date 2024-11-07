
data class Node(val value: Char, var next: Node? = null) {
    override fun toString(): String {
        var currentNode: Node? = this
        val stringBuilder = StringBuilder()
        while (currentNode != null) {
            stringBuilder.append("${currentNode.value} -> ")
            currentNode = currentNode.next
        }
        stringBuilder.append("null")
        return stringBuilder.toString()
    }
}

/**
 * Generate an interconnected linked list with random values.
 * @return A pair of singly linked lists that are intersecting.
 */
fun createInterconnectedSinglyLinkedList(): Pair<Node, Node> {

    val firstHeadNode = Node('r')
    firstHeadNode.next = Node('a')
    firstHeadNode.next?.next = Node('c')
    firstHeadNode.next?.next?.next = Node('e')
    firstHeadNode.next?.next?.next?.next = Node('c')
    firstHeadNode.next?.next?.next?.next?.next = Node('a')
    firstHeadNode.next?.next?.next?.next?.next?.next = Node('r')

    val secondHeadNode = Node('n')
    secondHeadNode.next = Node('a')
    secondHeadNode.next?.next = Node('s')
    secondHeadNode.next?.next?.next = firstHeadNode.next?.next?.next?.next

    return Pair(firstHeadNode, secondHeadNode)
}