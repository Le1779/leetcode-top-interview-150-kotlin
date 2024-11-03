package app.kevinle.leetcodetopinterview150kotlin.p30

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val lengthOfWord = words[0].length
        val wordMap = getWordMap(words)
        val indices = mutableListOf<Int>()
        for (i in s.indices) {
            if (check(s, wordMap.toMutableMap(), lengthOfWord, words.size, i)) {
                indices.add(i)
            }
        }

        return indices
    }

    private fun getWordMap(words: Array<String>): Map<String, Int> {
        val map = mutableMapOf<String, Int>()
        for (word in words) {
            if (map.contains(word)) {
                map[word] = map[word]!! + 1
            } else {
                map[word] = 1
            }
        }

        return map
    }

    private fun check(s: String, wordMap: MutableMap<String, Int>, lengthOfWord: Int, numOfWords: Int, startIndex: Int): Boolean {
        val lastCharIndex = startIndex + lengthOfWord * numOfWords
        if (lastCharIndex > s.length) {
            return false
        }

        for (i in startIndex until lastCharIndex step lengthOfWord) {
            val word = s.substring(i, i + lengthOfWord)
            if (!wordMap.containsKey(word)) {
                return false
            }

            wordMap[word] = wordMap[word]!! - 1
        }

        return isContainsAllWords(wordMap)
    }

    private fun isContainsAllWords(wordMap: MutableMap<String, Int>): Boolean {
        for (entry in wordMap.entries) {
            if (entry.value > 0) {
                return false
            }
        }

        return true
    }
}