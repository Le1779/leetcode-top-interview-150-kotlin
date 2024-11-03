package app.kevinle.leetcodetopinterview150kotlin.p3

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring("abcabcbb")
        Assertions.assertEquals(3, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring("bbbbb")
        Assertions.assertEquals(1, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring("pwwkew")
        Assertions.assertEquals(3, result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring("")
        Assertions.assertEquals(0, result)
    }

    @Test
    fun case5() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring(" ")
        Assertions.assertEquals(1, result)
    }

    @Test
    fun case6() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring("dvdf")
        Assertions.assertEquals(3, result)
    }

    @Test
    fun case7() {
        val solution = Solution()
        val result = solution.lengthOfLongestSubstring("abba")
        Assertions.assertEquals(2, result)
    }

}