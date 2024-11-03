package app.kevinle.leetcodetopinterview150kotlin.p6

import kotlin.math.max

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun convert(s: String, numRows: Int): String {
        val rows = getEmptyRows(numRows)
        writeZigzag(rows, s, numRows)
        return readLineByLine(rows)
    }

    private fun getEmptyRows(numRows: Int): List<StringBuilder> {
        val rows = mutableListOf<StringBuilder>()
        for (i in 0 until numRows) {
            rows.add(StringBuilder())
        }

        return rows
    }

    private fun writeZigzag(rows: List<StringBuilder>, s: String, numRows: Int) {
        val zigzagLen = numRows + max(0, numRows - 2)

        for (i in s.indices) {
            var rowIndex = i % zigzagLen
            if (rowIndex >= numRows) {
                rowIndex = zigzagLen - rowIndex
            }

            rows[rowIndex].append(s[i])
        }
    }

    private fun readLineByLine(rows: List<StringBuilder>): String {
        val sb = StringBuilder()
        for (row in rows) {
            sb.append(row)
        }

        return sb.toString()
    }
}