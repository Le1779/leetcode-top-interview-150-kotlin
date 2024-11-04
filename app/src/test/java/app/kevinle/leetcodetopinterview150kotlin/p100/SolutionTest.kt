package app.kevinle.leetcodetopinterview150kotlin.p100

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/4.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.isSameTree(buildTree(listOf(1,2,3)), buildTree(listOf(1,2,3)))
        Assertions.assertEquals(true, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.isSameTree(buildTree(listOf(1,2)), buildTree(listOf(1,null,2)))
        Assertions.assertEquals(false, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.isSameTree(buildTree(listOf(1,2,1)), buildTree(listOf(1,1,2)))
        Assertions.assertEquals(false, result)
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