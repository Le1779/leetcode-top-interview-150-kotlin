package app.kevinle.leetcodetopinterview150kotlin.p209

import kotlin.math.max
import kotlin.math.min

/**
 * Created by Kevin Le on 2024/11/3.
 */
class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minSize = nums.size
        var size = 0
        var left = 0
        var sum = 0
        var isGreaterThanOrEqual = false
        for (i in nums.indices) {
            sum += nums[i]
            size++

            while (sum >= target) {
                isGreaterThanOrEqual = true
                minSize = min(minSize, size)
                sum -= nums[left]
                size--
                left++
            }

            sum = max(sum, 0)
        }

        if (minSize == nums.size && !isGreaterThanOrEqual) {
            return 0
        }

        return minSize
    }
}