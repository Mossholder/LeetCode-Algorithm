/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int left=0,right=(int)Math.sqrt(c);
        while(left<=right){
            int res=left*left+right*right;
            if(res==c)  return true;
            else if(res<c)  left++;
            else    right--;
        }
        return false;
    }
}
// @lc code=end

