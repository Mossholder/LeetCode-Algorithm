import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int MaxLen=0;
        for(int item:map.keySet()){
            if(map.containsKey(item+1)) MaxLen=Math.max(MaxLen,map.get(item)+map.get(item+1));
        }
        return MaxLen;
    }
}
// @lc code=end

