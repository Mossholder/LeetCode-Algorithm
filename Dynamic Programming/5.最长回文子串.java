/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    
    public String longestPalindrome(String s) {
        int strLen=s.length();
        if(strLen<2)   return s;
        int begin=0;
        int maxLen=1;
        boolean[][] dp=new boolean[strLen][strLen];

        //base case
        for(int i=0;i<strLen;++i){
            dp[i][i]=true;
        }

        for(int j=1;j<strLen;++j){
            for(int i=0;i<j;++i){
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else{
                    if(j-i<3){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&j-i+1>maxLen){
                    begin=i;
                    maxLen=j-i+1;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
// @lc code=end

