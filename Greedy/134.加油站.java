/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum=0;
        int curSum=0;
        int start=0;
        for(int i=0;i<gas.length;++i){
            int rest=gas[i]-cost[i];
            curSum+=rest;
            totalSum+=rest;
            if(curSum<0){
                start=i+1;
                curSum=0;
            }
        }
        return totalSum<0?-1:start;
    }
}
// @lc code=end

