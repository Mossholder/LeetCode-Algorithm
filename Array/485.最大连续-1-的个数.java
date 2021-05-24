/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,cur=0;
        for(int item:nums){
            cur=item==0?0:cur+1;
            max=Math.max(max,cur);
        }
        return max;
    }
}
// @lc code=end

