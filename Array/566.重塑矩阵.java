/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length,col=nums[0].length;
        if(row*col!=r*c)    return nums;
        int[][] mat=new int[r][c];
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                int temp=i*col+j;
                mat[temp/c][temp%c]=nums[i][j];
            }
        }
        return mat;
    }
}
// @lc code=end

