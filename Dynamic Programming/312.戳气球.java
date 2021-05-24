/*
 * @lc app=leetcode.cn id=312 lang=java
 *
 * [312] 戳气球
 */

// @lc code=start
class Solution {
    public int maxCoins(int[] nums) {
        int N=nums.length;
        int[] points=new int[N+2];
        //哨兵
        points[0]=1;
        points[N+1]=1;
        System.arraycopy(nums,0,points,1,N);
        
        int[][] dp=new int[N+2][N+2];
        for(int i=N;i>=0;--i){
            for(int j=i+2;j<N+2;++j){
                for(int k=i+1;k<j;++k){
                    dp[i][j]=Math.max(
                        dp[i][j],
                        points[k]*points[i]*points[j]+dp[i][k]+dp[k][j]
                        );
                }
            }
        }
        return dp[0][N+1];
    }
}
// @lc code=end

