package app.kevinle.leetcodetopinterview150kotlin.p104

import app.kevinle.leetcodetopinterview150kotlin.models.tree.TreeBuilder
import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/4.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.maxDepth(TreeBuilder.build(listOf(3,9,20,null,null,15,7)))
        Assertions.assertEquals(3, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.maxDepth(TreeBuilder.build(listOf(1,null,2)))
        Assertions.assertEquals(2, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.maxDepth(TreeBuilder.build(listOf(1)))
        Assertions.assertEquals(1, result)
    }
}