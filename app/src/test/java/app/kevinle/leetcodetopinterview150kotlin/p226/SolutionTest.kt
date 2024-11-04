package app.kevinle.leetcodetopinterview150kotlin.p226

import app.kevinle.leetcodetopinterview150kotlin.models.tree.TreeBuilder
import org.junit.Test
import org.junit.jupiter.api.Assertions
import app.kevinle.leetcodetopinterview150kotlin.p100.Solution as P100Solution

/**
 * Created by Kevin Le on 2024/11/4.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.invertTree(TreeBuilder.build(listOf(4,2,7,1,3,6,9)))
        val isSameTree = P100Solution().isSameTree(result, TreeBuilder.build(listOf(4,7,2,9,6,3,1)))
        Assertions.assertEquals(true, isSameTree)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.invertTree(TreeBuilder.build(listOf(2,1,3)))
        val isSameTree = P100Solution().isSameTree(result, TreeBuilder.build(listOf(2,3,1)))
        Assertions.assertEquals(true, isSameTree)
    }
}