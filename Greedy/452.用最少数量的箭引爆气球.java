/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points){
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[1],b[1]);
            }
        });
        int arrowPos = points[0][1];
        int arrowCnt = 1;
        for (int i = 1; i < points.length; i++) {
            if (arrowPos >= points[i][0]) {
                continue;
            }
            arrowCnt++;
            arrowPos = points[i][1];
        }
        return arrowCnt;
    }
}
// @lc code=end

