package app.kevinle.leetcodetopinterview150kotlin.p6

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.convert("PAYPALISHIRING", 3)
        Assertions.assertEquals("PAHNAPLSIIGYIR", result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.convert("PAYPALISHIRING", 4)
        Assertions.assertEquals("PINALSIGYAHRPI", result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.convert("A", 1)
        Assertions.assertEquals("A", result)
    }
}