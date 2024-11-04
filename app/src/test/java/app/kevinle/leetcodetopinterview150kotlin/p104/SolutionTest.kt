package app.kevinle.leetcodetopinterview150kotlin.p104

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/4.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.maxDepth(buildTree(listOf(3,9,20,null,null,15,7)))
        Assertions.assertEquals(3, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.maxDepth(buildTree(listOf(1,null,2)))
        Assertions.assertEquals(2, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.maxDepth(buildTree(listOf(1)))
        Assertions.assertEquals(1, result)
    }

    private fun buildTree(nodes: List<Int?>): TreeNode? {
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