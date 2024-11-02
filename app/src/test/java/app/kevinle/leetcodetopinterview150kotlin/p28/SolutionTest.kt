package app.kevinle.leetcodetopinterview150kotlin.p28

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val haystack = "sadbutsad"
        val needle = "sad"
        val result = solution.strStr(haystack, needle)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val haystack = "leetcode"
        val needle = "leeto"
        val result = solution.strStr(haystack, needle)
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val haystack = "aaa"
        val needle = "aaaa"
        val result = solution.strStr(haystack, needle)
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val haystack = "mississippi"
        val needle = "issipi"
        val result = solution.strStr(haystack, needle)
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun case5() {
        val solution = Solution()
        val haystack = "a"
        val needle = "a"
        val result = solution.strStr(haystack, needle)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun case6() {
        val solution = Solution()
        val haystack = "abc"
        val needle = "c"
        val result = solution.strStr(haystack, needle)
        Assertions.assertEquals(2, result)
    }
}