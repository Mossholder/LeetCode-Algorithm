/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        
        //base case: dp[0]=0
        int[] dp=new int[amount+1];

        for(int i=1;i<=amount;++i){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<n;++j){
                //状态转移方程
                if(i-coins[j]>=0 && dp[i-coins[j]]!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i-coins[j]]+1,dp[i]);
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
// @lc code=end

