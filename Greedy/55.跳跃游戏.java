/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int farthest=0;
        for(int i=0;i<n-1;++i){
            farthest=Math.max(farthest,nums[i]+i);
            if(farthest==i) return false;
        }
        return true;
    }
}
// @lc code=end

