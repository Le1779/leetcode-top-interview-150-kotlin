package app.kevinle.leetcodetopinterview150kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/2.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val s = "the sky is blue"
        val result = solution.reverseWords(s)
        Assertions.assertEquals("blue is sky the", result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val s = "     hello  world  "
        val result = solution.reverseWords(s)
        Assertions.assertEquals("world hello", result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val s = "a good   example"
        val result = solution.reverseWords(s)
        Assertions.assertEquals("example good a", result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val s = "F R  I   E    N     D      S      "
        val result = solution.reverseWords(s)
        Assertions.assertEquals("S D N E I R F", result)
    }
}