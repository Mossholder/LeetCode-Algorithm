/*
 * @lc app=leetcode.cn id=1312 lang=java
 *
 * [1312] 让字符串成为回文串的最少插入次数
 */

// @lc code=start
class Solution {
    public int minInsertions(String s) {
        //version_2 状态压缩
        int strLen=s.length();
        if(strLen<2)    return 0;
        char[] charArray=s.toCharArray();
        int[] dp=new int[strLen];
        for(int i=strLen-2;i>=0;i--){
            int pre=0;
            for(int j=i+1;j<strLen;++j){
                int temp=dp[j];
                if(charArray[i]==charArray[j]){
                    dp[j]=pre;
                }else{
                    dp[j]=Math.min(dp[j-1],dp[j])+1;
                }
                pre=temp;
            }
        }
        return dp[strLen-1];
    }
}
// @lc code=end

