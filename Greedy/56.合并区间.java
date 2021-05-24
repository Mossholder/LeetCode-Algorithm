/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<2) return intervals;
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        Stack<Integer> res=new Stack<>();
        res.push(intervals[0][0]);
        res.push(intervals[0][1]);
        int num=2;
        for(int i=1;i<n;++i){
            int top=res.peek();
            if(top>=intervals[i][0]){
                res.push(Math.max(res.pop(),intervals[i][1]));
            }else{
                res.push(intervals[i][0]);
                res.push(intervals[i][1]);
                num+=2;
            }
        }
        int[][] ret=new int[num/2][2];
        for(int i=num/2-1;i>=0;--i){
            ret[i][1]=res.pop();
            ret[i][0]=res.pop();
        }
        return ret;
    }
}
// @lc code=end

