package app.kevinle.leetcodetopinterview150kotlin.models.tree

/**
 * Created by Kevin Le on 2024/11/4.
 */
object TreeBuilder {
    fun build(nodes: List<Int?>): TreeNode? {
        if (nodes.isEmpty() || nodes[0] == null) return null

        val root = TreeNode(nodes[0]!!)
        val queue = ArrayDeque<TreeNode?>()
        queue.add(root)

        var i = 1
        while (i < nodes.size) {
            val current = queue.removeFirst() ?: return root

            if (i < nodes.size && nodes[i] != null) {
                current.left = TreeNode(nodes[i]!!)
                queue.add(current.left)
            }
            i++

            if (i < nodes.size && nodes[i] != null) {
                current.right = TreeNode(nodes[i]!!)
                queue.add(current.right)
            }
            i++
        }

        return root
    }
}