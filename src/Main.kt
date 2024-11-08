

import com.sun.source.tree.Tree
import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTree
import java.util.LinkedList
import kotlin.time.measureTime

//TIP <b>4.3 List of Depths:</b> Given a binary tree, design an algorithm which creates a linked list of all the nodes
// at each depth. (e.g. If you have a tree with depth D, you'll have D linked lists).
fun main() {
    var result: Map<Int, LinkedList<TreeNode>>?
    val duration = measureTime {
        result = createListOfDepths(node = createBinaryTree())
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain your rationale here.
 */
private fun createListOfDepths(node: TreeNode): Map<Int, LinkedList<TreeNode>> {
    return mapOf()
}