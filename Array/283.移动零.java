/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
/**
 * class Solution {
    public void moveZeroes(int[] nums) {
        int pre=0;
        boolean flag=false;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==0&&!flag){
                pre=i;
                flag=true;
            }
            else if(nums[i]!=0&&flag){
                exch(nums,i,pre);
                pre++;
            }
        }
    }
    private void exch(int[] nums,int i,int j){
        int num=nums[i];
        nums[i]=nums[j];
        nums[j]=num;
    }
}
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int num:nums)
            if(num!=0)
                nums[index++]=num;
        while(index<nums.length)
            nums[index++]=0;
    }

}
// @lc code=end

