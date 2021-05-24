/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        BackTracking(board,0,0);  
    }
    private boolean BackTracking(char[][] board,int i,int j){
        int m=9,n=9;
        if(j==n){
            return BackTracking(board,i+1,0);
        }
        if(i==m)    return true;
        if(board[i][j]!='.')    return BackTracking(board,i,j+1);
        for(char c='1';c<='9';++c){
            if(!isValid(board,i,j,c))
                continue;
            board[i][j]=c;
            if(BackTracking(board,i,j+1))
                return true;
            board[i][j]='.';            
        }
        return false;
    }
    private boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;++i){
            if(board[row][i]==c)    return false;
            if(board[i][col]==c)    return false;
            if(board[(row/3)*3+i/3][(col/3)*3+i%3]==c)  return false;
        }
        return true;
    }
}
// @lc code=end

