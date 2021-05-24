/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k, int[] prices) {
        int N=prices.length;
        if(N==0)    return 0;
        if(k>N/2){
            return maxProfit_k_inf(prices);
        }

        int[][][] dp=new int[N][k+1][2];
        for(int i=0;i<N;++i){
            for(int j=0;j<=k;++j){
                if(j==0){
                    dp[i][j][0]=0;
                    dp[i][j][1]=Integer.MIN_VALUE;
                }else if(i==0){
                    dp[i][j][0]=0;
                    dp[i][j][1]=-prices[0];
                }else{
                    dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                    dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
                }
            }
        }
        return dp[N-1][k][0];
    }
    private int maxProfit_k_inf(int[] prices){
        int N=prices.length;
        int dp_i0=0,dp_i1=Integer.MIN_VALUE;
        for(int i=0;i<N;++i){
            int temp=dp_i0;
            dp_i0=Math.max(dp_i0,dp_i1+prices[i]);
            dp_i1=Math.max(dp_i1,temp-prices[i]);
        }
        return dp_i0;
    }
}
// @lc code=end

