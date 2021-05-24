/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    private int cnt=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();++i){
            extendString(s,i,i);
            extendString(s,i,i+1);
        }
        return cnt;
    }
    private void extendString(String s,int start,int end){
        if(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end))
        {
            cnt++;
            extendString(s,--start,++end);
        }
    }
}
// @lc code=end

