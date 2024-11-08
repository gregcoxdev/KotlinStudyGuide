package treesAndGraphs

data class TreeNode(var value: Int, var left: TreeNode? = null , var right: TreeNode? = null) {
    override fun toString(): String {
        val stringBuilder = StringBuilder()
        fun printNode(node: TreeNode?, level: Int) {
            if (node == null) return
            val indent = "  ".repeat(level)
            stringBuilder.append("$indent${node.value}\n")
            printNode(node.left, level + 1)
            printNode(node.right, level + 1)
        }
        printNode(this, 0)
        return stringBuilder.toString()
    }
}