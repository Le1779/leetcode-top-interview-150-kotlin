package app.kevinle.leetcodetopinterview150kotlin.p226

import app.kevinle.leetcodetopinterview150kotlin.models.tree.TreeNode

/**
 * Created by Kevin Le on 2024/11/4.
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        traversal(root)
        return root
    }

    private fun traversal(root: TreeNode?) {
        if (root == null) {
            return
        }

        traversal(root.left)
        traversal(root.right)

        val temp = root.left
        root.left = root.right
        root.right = temp
    }
}