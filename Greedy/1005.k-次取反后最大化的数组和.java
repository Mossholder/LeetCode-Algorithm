/*
 * @lc app=leetcode.cn id=1005 lang=java
 *
 * [1005] K 次取反后最大化的数组和
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        int n=A.length;
        Arrays.sort(A);
        int res=0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;++i){
            if(A[i]<0 && K-->0){
                A[i]=-A[i];
            }
            res+=A[i];
            min=Math.min(A[i],min);
        }
        if(K%2==1)  res-=2*min;
        return res;
    }
}
// @lc code=end

