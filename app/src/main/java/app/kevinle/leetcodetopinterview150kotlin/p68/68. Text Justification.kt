package app.kevinle.leetcodetopinterview150kotlin.p68

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        val lines = getLines(words, maxWidth)

        val result = mutableListOf<String>()
        for (l in lines.indices) {
            val wordsInCurrentLine = lines[l]
            var remainingSpace = maxWidth
            for (i in wordsInCurrentLine) {
                remainingSpace -= i.length
            }

            if (l == lines.size - 1) {
                result.add(getLastLine(wordsInCurrentLine, remainingSpace))
            } else {
                result.add(getLine(wordsInCurrentLine, remainingSpace))
            }
        }

        return result
    }

    private fun getLines(words: Array<String>, maxWidth: Int): List<List<String>> {
        val lines: MutableList<MutableList<String>> = mutableListOf()
        lines.add(mutableListOf())
        var count = -1
        var lineIndex = 0
        for (i in words.indices) {
            val word = words[i]
            if (count + word.length + 1 > maxWidth) {
                lineIndex++
                lines.add(mutableListOf())
                count = -1
            }

            lines[lineIndex].add(word)
            count += word.length + 1
        }

        return lines
    }

    private fun getLine(words: List<String>, remainingSpace: Int): String {
        val sb = StringBuilder(words.first())
        val split = if (words.size - 1 <= 0) 1 else words.size - 1
        val space = " ".repeat(remainingSpace / split)

        for (i in 1 until words.size) {
            sb.append(space)
            if (i <= remainingSpace % split) {
                sb.append(' ')
            }

            sb.append(words[i])
        }

        if (words.size == 1) {
            sb.append(space)
        }

        return sb.toString()
    }

    private fun getLastLine(words: List<String>, remainingSpace: Int): String {
        val sb = StringBuilder(words.first())
        for (i in 1 until words.size) {
            sb.append(' ')
            sb.append(words[i])
        }

        val space = remainingSpace - (words.size - 1)
        if (space > 0) {
            sb.append(" ".repeat(space))
        }

        return sb.toString()
    }
}