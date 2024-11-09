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

fun createBinaryTree(): TreeNode {
    val headNode = TreeNode(10)
    val leftHeadNode = TreeNode(6).also { headNode.left = it }
    val rightHeadNode = TreeNode(15).also { headNode.right = it }
    val leftLeftHeadNode = TreeNode(4).also { leftHeadNode.left = it }
    val rightLeftHeadNode = TreeNode(8).also { leftHeadNode.right = it }
    val leftRightHeadNode = TreeNode(6).also { rightHeadNode.left = it }
    val rightRightHeadNode =  TreeNode(23).also { rightHeadNode.right = it  }
    val rightRightRightHeadNode = TreeNode(32).also { rightRightHeadNode.right = it  }
    TreeNode(45).also { rightRightRightHeadNode.right = it  }
    return headNode
}