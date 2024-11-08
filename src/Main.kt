import treesAndGraphs.Graph
import treesAndGraphs.Node
import treesAndGraphs.createDirectedGraph
import java.util.*
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
    val queue: Queue<Node> = LinkedList()
    queue.add(s)
    while (queue.isNotEmpty()) {
        val popped = queue.poll()
        popped.isVisited = true
        println("Popped node: $popped.")
        if (popped == e) {
            println("Popped node matched e! node=[$popped], e=[$e].")
            return true
        }
        println("We aren't at the goal node yet, searching children.")
        popped.children.forEach {
            if (!it.isVisited) {
                println("Added $it to the queue.")
                queue.add(it)
            } else {
                println("Node $it was already visited, not adding it again.")
            }
        }
    }
    return false
}