/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int end=0;
        int farthest=0;
        int count=0;
        for(int i=0;i<n-1;++i){
            farthest=Math.max(i+nums[i],farthest);
            if(i==end){
                count++;
                end=farthest;
            }
        }
        return count;
    }
}
// @lc code=end

