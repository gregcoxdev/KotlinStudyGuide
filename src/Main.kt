import kotlin.time.measureTime

//TIP <b>2.4 Partition:</b> Write code to partition a linked list around a value x, such that all nodes less than X come
//before all nodes greater than or equal to X. (IMPORTANT: The partition element X can appear anywhere in the "right
//partition"; it does not need t appear between the left and right partitions. The additional spacing in the example
//below indicates the partition. Yes, the output below is one of many valid outputs.
//<br><br>
//EXAMPLE
//<br><br>
//Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
//Output: [LEFT] 3 -> 1 -> 2 -> [RIGHT] 10 -> 5 -> 5 -> 8
fun main() {
    val tests = listOf(
        Pair(createSinglyLinkedList(10, 10), 5),
        Pair(createSinglyLinkedList(10, 10), 4),
        Pair(createSinglyLinkedList(2, 100), 50),
        Pair(createSinglyLinkedList(1, 100), 25)
    )
    tests.forEach { test ->
        var result: Node?
        val durationSize = measureTime {
            result = partition(test.first, test.second)
        }
        println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
    }
}

/**
 * The train of thought behind this solution is to iterate through and
 */
fun partition(headNode: Node?, partitionValue: Int): Node? {
    println("Test started with head node: $headNode")
    var currentNode = headNode
    var rightPartitionNode: Node? = null
    var leftPartitionNode: Node? = null
    var currentRightPartitionNode = rightPartitionNode
    var currentLeftPartitionNode = leftPartitionNode
    while (currentNode != null) {
        if (currentNode.value >= partitionValue) {
            println("Found node above or equal to $partitionValue. It's ${currentNode.value}.")
            if (rightPartitionNode == null) {
                rightPartitionNode = currentNode
            } else {
                currentRightPartitionNode?.next = currentNode
            }
            currentRightPartitionNode = currentNode
        } else {
            println("Found node less than $partitionValue. It's ${currentNode.value}.")
            if (leftPartitionNode == null) {
                leftPartitionNode = currentNode
            } else {
                currentLeftPartitionNode?.next = currentNode
            }
            currentLeftPartitionNode = currentNode
        }
        currentNode = currentNode.next
    }
    return when {
        currentLeftPartitionNode == null -> rightPartitionNode
        currentRightPartitionNode == null -> leftPartitionNode
        else -> {
            currentRightPartitionNode.next = null // Remove the rest of the old linked nodes.
            currentLeftPartitionNode.next = rightPartitionNode // Combine the left and the right nodes.
            return leftPartitionNode
        }
    }
}