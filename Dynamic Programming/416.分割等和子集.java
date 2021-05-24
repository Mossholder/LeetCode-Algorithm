/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0)    return false;
        int N=nums.length;
        sum/=2;
        boolean[] dp=new boolean[sum+1];
        //base case
        dp[0]=true;
        for(int i=0;i<N;++i){
            for(int j=sum;j>0;--j){
                if(j>=nums[i])
                    dp[j]=dp[j]||dp[j-nums[i]];
            }
        }
        return dp[sum];
    }
}

// @lc code=end

