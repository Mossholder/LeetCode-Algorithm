/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
        if(N==0)    return 0;
        if(N==1)    return nums[0];
        return Math.max(rob(nums,0,N-1),rob(nums,1,N));
    }
    private int rob(int[] nums,int start,int end){
        int dp_0=0,dp_1=nums[start];
        for(int i=start+1;i<end;++i){
            int temp=dp_0;
            dp_0=Math.max(dp_0,dp_1);
            dp_1=temp+nums[i];
        }
        return Math.max(dp_0,dp_1);
    }
}
// @lc code=end

