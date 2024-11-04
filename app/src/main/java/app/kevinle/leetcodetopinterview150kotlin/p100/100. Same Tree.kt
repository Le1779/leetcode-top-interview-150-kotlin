package app.kevinle.leetcodetopinterview150kotlin.p100

/**
 * Created by Kevin Le on 2024/11/4.
 */
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return traversal(p, q)
    }

    private fun traversal(aTree: TreeNode?, bTree: TreeNode?): Boolean {
        if (aTree == null && bTree == null) {
            return true
        }

        if (aTree == null || bTree == null) {
            return false
        }

        if (!traversal(aTree.left, bTree.left)) {
            return false
        }

        if (!traversal(aTree.right, bTree.right)) {
            return false
        }

        return aTree.`val` == bTree.`val`
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}