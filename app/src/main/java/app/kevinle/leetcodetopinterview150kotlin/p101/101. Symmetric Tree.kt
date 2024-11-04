package app.kevinle.leetcodetopinterview150kotlin.p101

import app.kevinle.leetcodetopinterview150kotlin.models.tree.TreeNode

/**
 * Created by Kevin Le on 2024/11/4.
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return false
        }

        invert(root.right)
        return isSame(root.left, root.right)
    }

    private fun invert(root: TreeNode?) {
        if (root == null) {
            return
        }

        invert(root.left)
        invert(root.right)

        val temp = root.left
        root.left = root.right
        root.right = temp
    }

    private fun isSame(aTree: TreeNode?, bTree: TreeNode?): Boolean {
        if (aTree == null && bTree == null) {
            return true
        }

        if (aTree == null || bTree == null) {
            return false
        }

        if (!isSame(aTree.left, bTree.left)) {
            return false
        }

        if (!isSame(aTree.right, bTree.right)) {
            return false
        }

        return aTree.`val` == bTree.`val`
    }
}