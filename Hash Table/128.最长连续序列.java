import java.util.Map;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:nums)
            map.put(num,1);
        for(int num:nums)
            forward(map,num);
        int max=0;
        for(int item:map.keySet()){
            max=Math.max(max,map.get(item));
        }
        return max;
    }
    private int forward(Map<Integer,Integer> map,int num){
        if(!map.containsKey(num))   return 0;
        int count=map.get(num);
        if(count>1) return count;
        count=forward(map, num+1)+1;
        map.put(num, count);
        return count;
    }
}
// @lc code=end

