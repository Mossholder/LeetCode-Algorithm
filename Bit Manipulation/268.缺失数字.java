/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int ret=0;
        for(int i=0;i<nums.length;++i){
            ret^=i^nums[i];
        }
        return ret^nums.length;
    }
}
// @lc code=end

