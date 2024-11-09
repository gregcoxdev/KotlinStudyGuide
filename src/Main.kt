

import com.sun.source.tree.Tree
import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTree
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max
import kotlin.time.measureTime

//TIP <b>4.5 Validate BST:</b> Implement a function to check if a binary tree is a binary search tree.
fun main() {
    var result: Boolean?
    val duration = measureTime {
        result = isBinarySearchTree(node = createBinaryTree())
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain rationale here.
 */
private fun isBinarySearchTree(node: TreeNode): Boolean {
    return false
}