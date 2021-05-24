/*
 * @lc app=leetcode.cn id=518 lang=java
 *
 * [518] 零钱兑换 II
 */

// @lc code=start
class Solution {
    public int change(int amount, int[] coins) {
        int N=coins.length;
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int i=0;i<N;++i){
            for(int j=amount;j>0;--j){
                if(j>=coins[i]){
                    for(int k=1;k<=j/coins[i];++k){
                        dp[j]+=dp[j-k*coins[i]];
                    }
                }
            }
        }
        return dp[amount];
    }
}
// @lc code=end

