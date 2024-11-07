import kotlin.random.Random

data class Node(val value: Int, var next: Node? = null) {
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
 * @param size The size of the linked list, i.e. the number of values to store in the linked list.
 * @param upperBounds The maximum generated value (non-inclusive), you'll have more duplicates the lower the value.
 */
fun createSinglyLinkedList(size: Int, upperBounds: Int = 3): Node? {
    var headNode: Node? = null
    var currentNode: Node? = null
    for (i in 0..<size) {
        val nextNode = Node(Random.nextInt(from = 0, until = upperBounds))
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