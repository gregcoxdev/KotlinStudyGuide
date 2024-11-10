

import com.sun.source.tree.Tree
import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTree
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max
import kotlin.time.measureTime

//TIP <b>4.6 Successor:</b> Write an algorithm to find the "next" node (i.e., in order successor) of a given node in a
// binary search tree. You may assume that each node has a link to its parent.
fun main() {
    var result: TreeNode?
    val duration = measureTime {
        result = getSuccessor(node = createBinaryTree())
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Write rationale here.
 */
private fun getSuccessor(node: TreeNode): TreeNode {
    return node
}