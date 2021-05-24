/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int N=T.length;
        int[] res=new int[N];
        Stack<Integer> index_stack=new Stack<Integer>();
        for(int cur=0;cur<N;++cur){
            while(!index_stack.isEmpty()&&T[cur]>T[index_stack.peek()]){
                int preIndex=index_stack.pop();
                res[preIndex]=cur-preIndex;
            }
            index_stack.push(cur);
        }
        return res;
    }
}
// @lc code=end

