/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    private List<List<String>> ret=new LinkedList<>();
    public List<List<String>> solveNQueens(int n) {
        LinkedList<String> board=new LinkedList<>();
        BackTracking(n,board,0);
        return ret;
    }
    private void BackTracking(int n,LinkedList<String> board,int row){
        if(row==n){
            ret.add(new LinkedList<>(board));
            return;
        }
        char[] line=new char[n];
        Arrays.fill(line,'.');
        for(int col=0;col<n;++col){
            if(!isValid(board,row,col,n))
                continue;
            line[col]='Q';
            board.add(String.valueOf(line));
            BackTracking(n,board,row+1);
            board.removeLast();
            line[col]='.';
        }
    }
    //检测冲突
    private boolean isValid(LinkedList<String> board,int row,int col,int n){
        //检查该列
        for(int i=0;i<row;++i){
            if(board.get(i).charAt(col)=='Q')
                return false;
        }
        //检查左上方
        for(int i=row-1,j=col-1;i>=0&&j>=0;--i,--j){
            if(board.get(i).charAt(j)=='Q')
                return false;
        }
        //检查右上方
        for(int i=row-1,j=col+1;i>=0&&j<n;--i,++j){
            if(board.get(i).charAt(j)=='Q')
                return false;
        }
        return true;
    }
}
// @lc code=end

