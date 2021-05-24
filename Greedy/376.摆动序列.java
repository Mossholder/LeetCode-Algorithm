/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        if(n<2) return n;
        int preDiff=0;
        int curDiff=0;   
        int res=1;
        for(int i=0;i<n-1;++i){
            curDiff=nums[i+1]-nums[i];
            if((curDiff>0 && preDiff<=0)||(curDiff<0 && preDiff>=0)){
                res++;
                preDiff=curDiff;
            }
        }
        return res;
    }
}
// @lc code=end