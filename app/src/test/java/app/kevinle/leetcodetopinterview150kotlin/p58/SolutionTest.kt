package app.kevinle.leetcodetopinterview150kotlin.p58

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.lengthOfLastWord("Hello World")
        Assertions.assertEquals(5, result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.lengthOfLastWord("   fly me   to   the moon  ")
        Assertions.assertEquals(4, result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.lengthOfLastWord("a")
        Assertions.assertEquals(1, result)
    }
}