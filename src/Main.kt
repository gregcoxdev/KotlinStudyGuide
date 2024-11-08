
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
    return null
}