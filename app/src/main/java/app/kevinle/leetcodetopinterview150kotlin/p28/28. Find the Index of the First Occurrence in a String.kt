package app.kevinle.leetcodetopinterview150kotlin.p28

/**
 * Created by Kevin Le on 2024/11/2.
 */
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var index = -1
        if (needle.length == haystack.length) {
            return if (haystack.equals(needle)) 0 else -1
        }

        for (i in 0 .. haystack.length - needle.length) {
            if (compare(haystack, i, needle)) {
                index = i
                break
            }
        }

        return index
    }

    private fun compare(haystack: String, start: Int, needle: String): Boolean {
        for (i in needle.indices) {
            if (needle[i] != haystack[i + start]) {
                return false
            }
        }

        return true
    }
}