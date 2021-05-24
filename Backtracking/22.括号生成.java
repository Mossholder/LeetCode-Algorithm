/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        char[] path=new char[2*n];
        BackTracking(n,0,path);
        return res;
    }
    private void BackTracking(int n,int i,char[] path){
        if(i==2*n){
            res.add(String.valueOf(path));
            return;
        }
        for(char c : new char[]{'(',')'}){
            if(isValid(path,i,n,c)){
                path[i]=c;
                BackTracking(n,i+1,path);
            }
        }
    }
    private boolean isValid(char[] path,int i,int n,char c){
        int l=0,r=0;
        for(int j=0;j<i;++j){
            if(path[j]=='(')
                l++;
            else
                r++;
        }
        if(l==n) return c!='(';
        return l>=r;
    }
}
// @lc code=end

