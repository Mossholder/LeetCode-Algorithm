/*
 * @lc app=leetcode.cn id=260 lang=java
 *
 * [260] 只出现一次的数字 III
 */

// @lc code=start
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask=0;
        for(int num:nums)   bitmask^=num;
        bitmask&=-bitmask;
        int[] ret=new int[2];
        for(int num:nums){
            if((num&bitmask)==0)  ret[0]^=num;
            else    ret[1]^=num;
        }
        return ret;
    }
}
// @lc code=end

