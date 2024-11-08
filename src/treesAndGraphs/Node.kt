package treesAndGraphs


data class Node(val value: Int, var isVisited: Boolean = false, val children: MutableList<Node> = mutableListOf()) {
    fun addChild(child: Node) {
        children.add(child)
    }
    override fun toString(): String {
        return "Node: value=[$value], isVisited=[$isVisited]"
    }
}