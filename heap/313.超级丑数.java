import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=313 lang=java
 *
 * [313] 超级丑数
 */

// @lc code=start
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> queue=new PriorityQueue<>();
        int count = 0;
        long ans = 1;
        queue.add(ans);
        while (count < n) {
            ans=queue.poll();
            while (!queue.isEmpty() && ans == queue.peek()) {
                queue.poll();
            }
            count++;
            for (int i = 0; i < primes.length ; i++) {
                queue.offer(ans * primes[i]);
            }
        }
        return (int)ans;
    }
}
// @lc code=end

