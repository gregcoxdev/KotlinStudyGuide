

import com.sun.source.tree.Tree
import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTree
import java.util.LinkedList
import kotlin.time.measureTime

//TIP <b>4.4 Check Balanced:</b> Implement a function to check if a binary tree is balanced. For the purposes of this
// question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ
// by more than one.
fun main() {
    var result: Boolean?
    val duration = measureTime {
        result = isTreeBalanced(node = createBinaryTree())
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain your rationale here.
 */
private fun isTreeBalanced(node: TreeNode): Boolean {
    return false
}