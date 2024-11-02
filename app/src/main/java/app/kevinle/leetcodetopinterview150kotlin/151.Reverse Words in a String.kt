package app.kevinle.leetcodetopinterview150kotlin

import kotlin.math.ceil

/**
 * Created by Kevin Le on 2024/11/2.
 */
class Solution {
    fun reverseWords(s: String): String {
        val sb = StringBuilder(s)
        var left = 0
        var right: Int
        var needReverse = false

        for (i in sb.indices) {
            if (sb[i] == ' ' && needReverse) {
                right = i - 1
                val spaceNum = reverse(sb, left, right)
                left = i - spaceNum + 1
                needReverse = false
            }

            if (sb[i] != ' '){
                needReverse = true
            }
        }

        reverse(sb, left, s.length - 1)
        reverse(sb, 0, s.length - 1)

        var start = 0
        for (i in sb.indices) {
            if (sb[i] != ' '){
                start = i
                break
            }
        }

        return sb.substring(start)
    }

    private fun reverse(s: StringBuilder, from: Int, to: Int): Int {
        if (from >= to) {
            return 0
        }

        var space = 0
        for (i in 0 until ceil((to - from) / 2f).toInt()) {
            val temp = s[from + i]
            s[from + i] = s[to - i]
            s[to - i] = temp

            if (s[from + i] == ' ') {
                space++
            }

            if (s[to - i] == ' ') {
                space++
            }
        }

        if ((to - from) % 2 == 0) {
            if (s[from + ceil((to - from) / 2f).toInt()] == ' ') {
                space++
            }
        }

        return space
    }
}