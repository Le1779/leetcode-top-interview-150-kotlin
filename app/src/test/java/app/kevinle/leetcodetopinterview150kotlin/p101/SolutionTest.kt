package app.kevinle.leetcodetopinterview150kotlin.p101

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
        val result = solution.isSymmetric(TreeBuilder.build(listOf(1,2,2,3,4,4,3)))
        Assertions.assertEquals(true, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.isSymmetric(TreeBuilder.build(listOf(1,2,2,null,3,null,3)))
        Assertions.assertEquals(false, result)
    }
}