/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        return GetMajority(nums, 0, nums.length-1);
    }
    private int GetMajority(int[] nums,int left,int right){
        if(left==right) return nums[left];
        int mid=left+(right-left)/2;
        int l=GetMajority(nums, left, mid);
        int r=GetMajority(nums, mid+1, right);
        if(l==r)
            return l;
        int lcnt=0;
        int rcnt=0;
        for(int i=left;i<=right;++i){
            if(nums[i]==l)  lcnt++;
            if(nums[i]==r)  rcnt++;
        } 
        return lcnt>rcnt?l:r;
    }
}
// @lc code=end

