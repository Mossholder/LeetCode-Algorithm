/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int num) {
        int[] ret=new int[num+1];
        for(int i=1;i<=num;++i){
            ret[i]=Integer.bitCount(i);
        }
        return ret;
    }
}
// @lc code=end

