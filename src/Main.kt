

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
 * Since we need to verify the root node, and then it's children to tell if it's a correct BST, we can use pre-order
 * traversal.
 */
private fun isBinarySearchTree(node: TreeNode): Boolean {
    println("Checking if this tree is a binary search tree..\n$node")
    var isFormattedCorrectly = true
    isFormattedCorrectly = preOrderTraversal(node)
    println("Checked node=[${node.value}]. isFormattedCorrectly=[$isFormattedCorrectly]")
    if (isFormattedCorrectly.not()) return isFormattedCorrectly
    node.left?.let { left ->
        isFormattedCorrectly = isBinarySearchTree(left)
        println("Checking left=[${left.value}]. isFormattedCorrectly=[$isFormattedCorrectly]")
        if (isFormattedCorrectly.not()) return isFormattedCorrectly
    }
    node.right?.let { right ->
        isFormattedCorrectly = isBinarySearchTree(right)
        println("Checking right=[${right.value}]. isFormattedCorrectly=[$isFormattedCorrectly]")
        if (isFormattedCorrectly.not()) return isFormattedCorrectly
    }
    return isFormattedCorrectly
}

private fun preOrderTraversal(node: TreeNode?): Boolean {
    if (node == null) return true
    val isLeftNodeLessThanParent = node.left?.value?.let {
        it <= node.value
    } ?: true
    val isRightNodeLessThanParent = node.right?.value?.let {
        node.value <= it
    } ?: true
    println("Node with value ${node.value}, left=[${node.left?.value}=$isLeftNodeLessThanParent], right=[${node.right?.value}=$isRightNodeLessThanParent]")
    return isLeftNodeLessThanParent && isRightNodeLessThanParent
}