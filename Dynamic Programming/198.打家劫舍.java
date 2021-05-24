/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
        if(N==0)    return 0;
        int dp_i0=0,dp_i1=nums[0];
        for(int i=1;i<N;++i){
            int temp=dp_i0;
            dp_i0=Math.max(dp_i0,dp_i1);
            dp_i1=temp+nums[i];
        }
        return Math.max(dp_i0,dp_i1);
    }
}
// @lc code=end

