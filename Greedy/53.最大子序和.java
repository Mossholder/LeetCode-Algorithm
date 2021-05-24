/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1)    return nums[0];
        int res=nums[0];
        int Sum=nums[0];
        for(int i=1;i<n;++i){
            if(Sum<0){
                Sum=0;
            }
            Sum+=nums[i];
            res=Math.max(res,Sum);
        }
        return res;
    }
    
}
// @lc code=end

