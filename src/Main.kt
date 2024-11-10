

import com.sun.source.tree.Tree
import treesAndGraphs.Node
import treesAndGraphs.TreeNode
import treesAndGraphs.createBinaryTree
import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.time.measureTime

//TIP <b>4.7 Build Order:</b> You are given a list of projects and a list of dependencies (which is a list of pairs of
// projects, where the second project is dependent on the first project). All of a project's dependencies must be built
// before the project is. Find a build order that will allow the projects to be built. If there is no valid build order,
// return an error.
// <br><br.
// EXAMPLE <br>
// Input:<br>
// projects: a, b, c, d, e, f<br>
// dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)<br>
// Output: f, e, a, b, d, c
fun main() {
    var result: List<String>?
    val duration = measureTime {
        val projects = listOf("A", "B", "C", "D", "E", "F")
        val dependencies = listOf(Pair("A", "D"), Pair("F", "B"), Pair("B", "D"), Pair("F", "A"), Pair("D", "C"))
        result = findBuildOrder(projects, dependencies)
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Write rationale here.
 */
private fun findBuildOrder(projects: List<String>, dependencies: List<Pair<String, String>>): List<String> {
    return listOf()
}