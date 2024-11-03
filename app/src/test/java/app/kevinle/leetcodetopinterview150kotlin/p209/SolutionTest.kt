package app.kevinle.leetcodetopinterview150kotlin.p209

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.minSubArrayLen(7, intArrayOf(2,3,1,2,4,3))
        Assertions.assertEquals(2, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.minSubArrayLen(4, intArrayOf(1,4,4))
        Assertions.assertEquals(1, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.minSubArrayLen(11, intArrayOf(1,1,1,1,1,1,1,1))
        Assertions.assertEquals(0, result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.minSubArrayLen(1, intArrayOf(1))
        Assertions.assertEquals(1, result)
    }

    @Test
    fun case5() {
        val solution = Solution()
        val result = solution.minSubArrayLen(11, intArrayOf(1,2,3,4,5))
        Assertions.assertEquals(3, result)
    }
}