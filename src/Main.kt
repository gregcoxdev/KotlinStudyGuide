import treesAndGraphs.Graph
import treesAndGraphs.Node
import treesAndGraphs.createDirectedGraph
import kotlin.time.measureTime

//TIP <b>4.1 Route Between Nodes:</b> Given a directed graph and two nodes (S and E), design an algorithm to find out whether
// there is a route from S to E.
fun main() {
    var result: Boolean? = null
    val duration = measureTime {
        val graph = createDirectedGraph()
        result = isRouteBetweenNodes(graph, graph.nodes.first(), graph.nodes.last())
    }
    println("Test completed with $result in ${duration.inWholeMilliseconds} milliseconds.")
}

/**
 * Explain your rational here.
 */
private fun isRouteBetweenNodes(graph: Graph, s: Node, e: Node): Boolean {
    return false
}