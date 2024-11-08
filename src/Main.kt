

import treesAndGraphs.TreeNode
import kotlin.time.measureTime

//TIP <b>4.2 Minimal Tree:</b> Given a sorted (increasing order) array with a unique integer elements, write an
// algorithm to create a binary search tree with minimal height.
fun main() {
    var result: TreeNode?
    val duration = measureTime {
        result = createMinimalTree(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    }
    println("Test completed with tree: \n$result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain your rationale here.
 */
private fun createMinimalTree(array: IntArray): TreeNode? {
    val headNode = recursivelyMakeBinarySearchTree(array, 0, array.size - 1)
    return headNode
}

private fun recursivelyMakeBinarySearchTree(array: IntArray, startIndex: Int, endIndex: Int): TreeNode? {
    val middleIndex = (startIndex + endIndex) / 2
    val middleNode = TreeNode(array[middleIndex])
    println("Created middle node: ${middleNode.value}")
    if (startIndex > endIndex) return null
    middleNode.left = if (endIndex >= 0) {
        println("Creating left node from: [$startIndex to ${middleIndex - 1}]")
        recursivelyMakeBinarySearchTree(array, startIndex, middleIndex - 1)
    } else {
        println("Can't move any further left, at start index [$startIndex].")
        null
    }
    middleNode.right = if (startIndex < array.size) {
        println("Creating right node from: [${middleIndex + 1} to $endIndex]")
        recursivelyMakeBinarySearchTree(
            array = array,
            startIndex = middleIndex + 1,
            endIndex = endIndex
        )
    } else {
        println("Can't move any further right, at end index [$endIndex].")
        null
    }
    return middleNode
}