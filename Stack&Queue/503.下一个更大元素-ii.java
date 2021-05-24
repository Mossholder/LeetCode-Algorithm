import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int N=nums.length;
        int[] res=new int[N];
        Arrays.fill(res,-1);
        Stack<Integer> pre=new Stack<Integer>();
        for(int i=0;i<2*N;++i){
            int num=nums[i%N];
            while(!pre.isEmpty()&&num>nums[pre.peek()])
                res[pre.pop()]=num;
            if(i<N)
                pre.push(i);
        }
        return res;
    }
}
// @lc code=end

