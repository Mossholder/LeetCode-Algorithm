/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int N=prices.length;
        if(N==0)    return 0;
        int[][] dp=new int[N][3];
        
        //base case
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        dp[0][2]=0;

        for(int i=1;i<N;++i){
            dp[i][0]=Math.max(dp[i-1][2],dp[i-1][0]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2]=dp[i-1][1]+prices[i];
        }
        return Math.max(dp[N-1][0],dp[N-1][2]);
    }
}
// @lc code=end

