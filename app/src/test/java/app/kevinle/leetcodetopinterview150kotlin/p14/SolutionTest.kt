package app.kevinle.leetcodetopinterview150kotlin.p14

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.longestCommonPrefix(arrayOf("flower","flow","flight"))
        Assertions.assertEquals("fl", result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.longestCommonPrefix(arrayOf("dog","racecar","car"))
        Assertions.assertEquals("", result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.longestCommonPrefix(arrayOf("ab", "a"))
        Assertions.assertEquals("a", result)
    }
}