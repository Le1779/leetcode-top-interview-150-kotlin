package app.kevinle.leetcodetopinterview150kotlin.p12

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun intToRoman(num: Int): String {
        val values = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val symbols = arrayOf('M', "CM", 'D', "CD", 'C', "XC", 'L', "XL", 'X', "IX", 'V', "IV", 'I')

        var remaining = num
        val roman = StringBuilder()
        for (i in values.indices) {
            val value = values[i]
            val symbol = symbols[i]
            while (remaining >= value) {
                remaining -= value
                roman.append(symbol)
            }
        }

        return roman.toString()
    }
}