import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(k,(a,b)->b-a);
        for(int item:nums){
            maxHeap.offer(item);
        }
        int ret=0;
        while(k--!=0){
            ret=maxHeap.poll();
        }
        return ret;
    }
}
// @lc code=end

