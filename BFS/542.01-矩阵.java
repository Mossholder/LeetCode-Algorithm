import java.util.Queue;

/*
 * @lc app=leetcode.cn id=542 lang=java
 *
 * [542] 01 矩阵
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] direction={{-1,0},{1,0},{0,-1},{0,1}};
        int m=matrix.length,n=matrix[0].length;
        boolean[][] visited=new boolean[m][n];
        int[][] ret=new int[m][n];
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(matrix[i][j]==0){
                    queue.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int step=1;
        while(!queue.isEmpty()){
            int sz=queue.size();
            for(int k=0;k<sz;++k){
                int[] cur=queue.poll();
                for(int i=0;i<4;++i){
                    int row=cur[0]+direction[i][0];
                    int col=cur[1]+direction[i][1];
                    if(row>=0 && row<m && col>=0 && col<n && !visited[row][col]){
                        ret[row][col]=step;
                        visited[row][col]=true;
                        queue.offer(new int[]{row,col});
                    }
                }
            }
            step++;            
        }
        return ret;
    }
}
// @lc code=end

