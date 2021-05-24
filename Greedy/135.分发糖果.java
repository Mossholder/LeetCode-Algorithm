/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        if(n==0||n==1)  return n;
        int[] nums=new int[n];
        nums[0]=1;
        //正向遍历
        for(int i=1;i<n;++i){
            if(ratings[i]>ratings[i-1]){
                nums[i]=nums[i-1]+1;
            }else{
                nums[i]=1;
            }
        }
        //反向遍历
        for(int i=n-1;i>0;--i){
            if(ratings[i-1]>ratings[i] && nums[i-1]<=nums[i]){
                nums[i-1]=nums[i]+1;
            }
        }
        int res=0;
        for(int num : nums){
            res+=num;
        }
        return res;
    }
}
// @lc code=end

