/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int m=intervals.length;
        if(m==0)    return 0;
        //按end升序排序
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[1]-b[1];
            }
        });
        int n=1;    //不重叠区间数
        int end=intervals[0][1];
        for(int[] item:intervals){
            if(item[0]>=end){
                end=item[1];
                n++;
            }
        }
        return m-n;
    }
}
// @lc code=end

