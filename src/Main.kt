

import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTreeWithNodes
import kotlin.time.measureTime

//TIP <b>4.9 BST Sequences:</b> A binary search tree was created by traversing through an array from left to
// right and inserting each element. Given a binary search tree with distinct elements, print all possible arrays that
// could have led to this tree.
// <pre>
//
// EXAMPLE:<br>
// Input: ( 2 )<br>
//        /   \<br>
//    ( 1 )   ( 3 )<br>
// Output: {2, 1, 3}, {2, 3, 1}
// </pre>
fun main() {
    var result: IntArray?
    val duration = measureTime {
        val tree = createBinaryTreeWithNodes()
        result = createBSTSequences(tree)
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Write rationale here.
 */
private fun createBSTSequences(root: TreeNode?): IntArray? {
    return null
}