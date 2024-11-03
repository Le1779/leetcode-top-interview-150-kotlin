package app.kevinle.leetcodetopinterview150kotlin.p30

import org.junit.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.findSubstring("barfoothefoobarman", arrayOf("foo","bar"))
        Assertions.assertEquals(listOf(0, 9), result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.findSubstring("wordgoodgoodgoodbestword", arrayOf("word","good","best","word"))
        Assertions.assertEquals(listOf<Int>(), result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.findSubstring("barfoofoobarthefoobarman", arrayOf("bar","foo","the"))
        Assertions.assertEquals(listOf(6,9,12), result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.findSubstring("wordgoodgoodgoodbestword", arrayOf("word","good","best","good"))
        Assertions.assertEquals(listOf(8), result)
    }
}