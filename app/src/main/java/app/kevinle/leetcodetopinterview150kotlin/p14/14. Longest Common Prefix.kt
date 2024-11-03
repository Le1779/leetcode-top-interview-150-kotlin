package app.kevinle.leetcodetopinterview150kotlin.p14

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val prefix = StringBuilder()
        for (i in strs[0].indices) {
            if (haveCommon(strs, i)) {
                prefix.append(strs[0][i])
            } else {
                return prefix.toString()
            }
        }

        return prefix.toString()
    }

    private fun haveCommon(strs: Array<String>, index: Int): Boolean {
        val firstStr = strs[0]
        if (index >= firstStr.length) {
            return false
        }

        val target = firstStr[index]
        for (i in 1 until strs.size) {
            if (index >= strs[i].length) {
                return false
            }

            if (target != strs[i][index]) {
                return false
            }
        }

        return true
    }
}