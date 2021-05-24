/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)    return true;
        if(x<0||x%10==0)    return false;
        int right=0;
        while(x>right){
            right=10*right+x%10;
            x/=10;
        }
        return x==right||x==right/10;
    }
}
// @lc code=end

