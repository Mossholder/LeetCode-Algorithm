import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(n,(a,b)->b-a);
        for(int stone:stones){
            maxHeap.offer(stone);
        }
        while(maxHeap.size()>=2){
            int a=maxHeap.poll();
            int b=maxHeap.poll();
            if(a==b){
                continue;
            }
            maxHeap.offer(a-b);
        }
        return maxHeap.size()==1?maxHeap.poll():0;
    }
}
// @lc code=end

