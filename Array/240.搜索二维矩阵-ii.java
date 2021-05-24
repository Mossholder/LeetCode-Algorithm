/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int r = matrix.length, c = matrix[0].length;
        int r_index = r - 1, c_index = 0;
        while (r_index >= 0 && c_index < c) {
            int cur = matrix[r_index][c_index];
            if (cur == target)
                return true;
            if (cur > target)
                --r_index;
            else
                ++c_index;
        }
        return false;
    }

}
// @lc code=end
