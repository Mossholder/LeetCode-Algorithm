/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int N=nums.length;
        if(N==0)    return 0;
        int max=nums[0];
        int dp=nums[0];
        for(int i=1;i<N;++i){
            dp=Math.max(nums[i]+dp,nums[i]);
            max=Math.max(max,dp);
        }
        return max;
    }
}
// @lc code=end

