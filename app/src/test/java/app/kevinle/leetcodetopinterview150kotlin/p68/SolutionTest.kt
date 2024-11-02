package app.kevinle.leetcodetopinterview150kotlin.p68

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Kevin Le on 2024/11/3.
 */
class SolutionTest {

    @Test
    fun case1() {
        val solution = Solution()
        val result = solution.fullJustify(arrayOf("This", "is", "an", "example", "of", "text", "justification."), 16)
        assertEquals(listOf(
            "This    is    an",
            "example  of text",
            "justification.  "), result)
    }

    @Test
    fun case2() {
        val solution = Solution()
        val result = solution.fullJustify(arrayOf("What","must","be","acknowledgment","shall","be"), 16)
        assertEquals(listOf(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        ), result)
    }

    @Test
    fun case3() {
        val solution = Solution()
        val result = solution.fullJustify(arrayOf("Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"), 20)
        assertEquals(listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        ), result)
    }

    @Test
    fun case4() {
        val solution = Solution()
        val result = solution.fullJustify(arrayOf("ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"), 16)
        assertEquals(listOf(
            "ask   not   what",
            "your country can",
            "do  for  you ask",
            "what  you can do",
            "for your country"
        ), result)
    }

    @Test
    fun case5() {
        val solution = Solution()
        val result = solution.fullJustify(arrayOf("My","momma","always","said,","\"Life","was","like","a","box","of","chocolates.","You","never","know","what","you're","gonna","get."), 20)
        assertEquals(listOf(
            "My    momma   always",
            "said, \"Life was like",
            "a box of chocolates.",
            "You  never know what",
            "you're gonna get.   "
        ), result)
    }
}