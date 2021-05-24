/*
 * @lc app=leetcode.cn id=696 lang=java
 *
 * [696] 计数二进制子串
 */

// @lc code=start
/**
 * class Solution {
    private int cnt = 0;

    public int countBinarySubstrings(String s) {
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) != s.charAt(i + 1))
                extendSubstring(s, i, i + 1, s.charAt(i));
        }
        return cnt;
    }

    private void extendSubstring(String s, int start, int end, char num) {
        if (start >= 0 && end < s.length() && s.charAt(start) == num && s.charAt(end) == (num == '1' ? '0' : '1')) {
            ++cnt;
            extendSubstring(s, --start, ++end, num);
        }
    }
}
 */
class Solution {
    public int countBinarySubstrings(String s) {
        int preLen=0,curLen=1,cnt=0;
        for(int i=1;i<s.length();++i){
            if(s.charAt(i)==s.charAt(i-1))
                ++curLen;
            else{
                preLen=curLen;
                curLen=1;
            }
            if(curLen<=preLen)
                ++cnt;
        }
        return cnt;
    }
}
// @lc code=end
