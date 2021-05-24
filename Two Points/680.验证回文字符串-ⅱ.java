/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s){
        for(int l=0,r=s.length()-1;l<r;++l,--r){
            if(s.charAt(l)!=s.charAt(r))
                return isPalindrome(s.substring(l,r))||isPalindrome(s.substring(l+1,r+1));
        }
        return true;
    }

    private boolean isPalindrome(String s){
        for(int l=0,r=s.length()-1;l<r;++l,--r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
        }
        return true;
    }
}
// @lc code=end

