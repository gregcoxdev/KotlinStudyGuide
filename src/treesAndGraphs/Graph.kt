package treesAndGraphs

data class Graph(val nodes: List<Node>)

fun createDirectedGraph(): Graph {

    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)
    val node5 = Node(5)

    node1.addChild(node2)
    node1.addChild(node3)
    node2.addChild(node4)
    node4.addChild(node5)
    node5.addChild(node3)
    node3.addChild(node1)

    return Graph(listOf(node1, node2, node3, node4, node5))
}