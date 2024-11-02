package app.kevinle.leetcodetopinterview150kotlin.p58

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var lenOfLast = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i] == ' ' && lenOfLast != 0) {
                return lenOfLast
            }

            if (s[i] != ' ') {
                lenOfLast++
            }
        }

        return lenOfLast
    }
}