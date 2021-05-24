/*
 * @lc app=leetcode.cn id=738 lang=java
 *
 * [738] 单调递增的数字
 */

// @lc code=start
class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] c=String.valueOf(N).toCharArray();
        int n=c.length;
        if(n==1)    return N;
        int flag=n;
        for(int i=n-1;i>0;--i){
            if(c[i-1]-'0'>c[i]-'0'){
                c[i]='9';
                c[i-1]-=1;
                flag=i;
            }
        }
        while(++flag<n){
            c[flag]='9';
        }
        return Integer.parseInt(String.valueOf(c));
    }
}
// @lc code=end

