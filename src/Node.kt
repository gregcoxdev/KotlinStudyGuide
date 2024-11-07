import kotlin.random.Random

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
 * Generate a linked list with random values.
 * @param string The string to split into characters and into each node of a linked list.
 */
fun createSinglyLinkedList(string: String): Node? {
    var headNode: Node? = null
    var currentNode: Node? = null
    for (i in string.indices) {
        val nextNode = Node(string[i])
        if (headNode == null) {
            headNode = nextNode
            currentNode = headNode
        } else {
            currentNode?.next = nextNode
            currentNode = currentNode?.next
        }
    }
    return headNode
}