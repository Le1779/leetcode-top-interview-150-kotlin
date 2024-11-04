package app.kevinle.leetcodetopinterview150kotlin.p104

import kotlin.math.max

/**
 * Created by Kevin Le on 2024/11/4.
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return traversal(root, 0)
    }

    private fun traversal(root: TreeNode?, depth: Int): Int {
        if (root == null) {
            return depth
        }

        val leftDepth = traversal(root.left, depth + 1)
        val rightDepth = traversal(root.right, depth + 1)
        return max(leftDepth, rightDepth)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}