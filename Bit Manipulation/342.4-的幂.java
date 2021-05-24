/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        return num>0&&num%3==1&&(num&(num-1))==0;
    }
}
// @lc code=end

