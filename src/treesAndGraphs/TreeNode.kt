package treesAndGraphs

data class TreeNode(var value: Int, var left: TreeNode? = null , var right: TreeNode? = null) {
    override fun toString(): String {
        return ("TreeNode(value=[$value])")
//        val stringBuilder = StringBuilder()
//        fun printNode(node: TreeNode?, level: Int) {
//            if (node == null) return
//            val indent = "  ".repeat(level)
//            stringBuilder.append("$indent${node.value}\n")
//            printNode(node.left, level + 1)
//            printNode(node.right, level + 1)
//        }
//        printNode(this, 0)
//        return stringBuilder.toString()
    }
}

fun createBinaryTree(): TreeNode {
    val headNode = TreeNode(1)
    val leftHeadNode = TreeNode(2).also { headNode.left = it }
    val rightHeadNode = TreeNode(3).also { headNode.right = it }
    val leftLeftHeadNode = TreeNode(4).also { leftHeadNode.left = it }
    val rightLeftHeadNode = TreeNode(5).also { leftHeadNode.right = it }
    val leftRightHeadNode = TreeNode(6).also { rightHeadNode.left = it }
    val rightRightHeadNode =  TreeNode(7).also { rightHeadNode.right = it  }
    val rightRightRightHeadNode = TreeNode(8).also { rightRightHeadNode.right = it  }
    TreeNode(9).also { rightRightRightHeadNode.right = it  }
    return headNode
}