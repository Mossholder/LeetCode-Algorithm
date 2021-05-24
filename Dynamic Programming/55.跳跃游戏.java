/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int N=nums.length;
        boolean[] dp=new boolean[N];
        dp[0]=true;
        for(int i=1;i<N;++i){
            for(int j=i-1;j>=0;--j){
                if(i-j<=nums[j]&&dp[j]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[N-1];
    }
}
// @lc code=end

