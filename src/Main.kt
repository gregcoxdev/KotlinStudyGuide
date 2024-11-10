

import com.sun.source.tree.Tree
import treesAndGraphs.Node
import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTreeWithNodes
import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.time.measureTime

//TIP <b>4.8 First Common Ancestor:</b> Design an algorithm and write code to find the first common ancestor of two
// nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary
// search tree.
fun main() {
    var result: TreeNode?
    val duration = measureTime {
        val tree = createBinaryTreeWithNodes()
        result = firstCommonAncestor(tree.first, tree.second, tree.third)
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Write rationale here.
 */
private fun firstCommonAncestor(root: TreeNode?, node1: TreeNode, node2: TreeNode): TreeNode? {
    return null
}