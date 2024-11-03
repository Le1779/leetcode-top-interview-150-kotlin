package app.kevinle.leetcodetopinterview150kotlin.p12

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.intToRoman(58)
        Assertions.assertEquals("LVIII", result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.intToRoman(4)
        Assertions.assertEquals("IV", result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.intToRoman(199)
        Assertions.assertEquals("CXCIX", result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.intToRoman(3749)
        Assertions.assertEquals("MMMDCCXLIX", result)
    }
}