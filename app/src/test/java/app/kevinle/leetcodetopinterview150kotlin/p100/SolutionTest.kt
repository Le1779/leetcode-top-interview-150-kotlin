package app.kevinle.leetcodetopinterview150kotlin.p100

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
        val result = solution.isSameTree(TreeBuilder.build(listOf(1,2,3)), TreeBuilder.build(listOf(1,2,3)))
        Assertions.assertEquals(true, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.isSameTree(TreeBuilder.build(listOf(1,2)), TreeBuilder.build(listOf(1,null,2)))
        Assertions.assertEquals(false, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.isSameTree(TreeBuilder.build(listOf(1,2,1)), TreeBuilder.build(listOf(1,1,2)))
        Assertions.assertEquals(false, result)
    }
}