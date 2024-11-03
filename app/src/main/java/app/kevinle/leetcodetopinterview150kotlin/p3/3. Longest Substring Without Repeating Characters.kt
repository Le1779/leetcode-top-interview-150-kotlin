package app.kevinle.leetcodetopinterview150kotlin.p3

import kotlin.math.max
import kotlin.math.min

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLen = 0
        var count = 0
        val hashMap = hashMapOf<Char, Int>()
        for (i in s.indices) {
            val char = s[i]
            if (hashMap.contains(char)) {
                val repeatIndex = hashMap[char] ?: 0
                maxLen = max(maxLen, count)
                count = min(i - repeatIndex - 1, count)
            }

            count++
            hashMap[char] = i
        }

        return max(maxLen, count)
    }
}