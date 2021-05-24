/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        return dp(s,0,p,0);
    }
    private boolean dp(String s,int i,String p,int j){
        int m=s.length(),n=p.length();
        if(j==n)   return i==m;
        if(i==m){
            if((n-j)%2==1){
                return false;
            }
            for(;j+1<n;j+=2){
                if(p.charAt(j+1)!='*')
                    return false;  
            }
            return true;
        }

        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
            if(j+1<n&&p.charAt(j+1)=='*'){
                return dp(s,i,p,j+2)||dp(s,i+1,p,j);
            }else{
                return dp(s,i+1,p,j+1);
            }
        }else{
            if(j+1<n&&p.charAt(j+1)=='*'){
                return dp(s,i,p,j+2);
            }else{
                return false;
            }
        }
    }
}
// @lc code=end

