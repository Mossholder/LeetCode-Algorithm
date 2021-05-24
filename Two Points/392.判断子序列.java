/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        int m=sc.length,n=tc.length;
        if(m==0)    return true;
        if(n==0)    return false;         
        int i=0,j=0;
        while(i<m && j<n){
            if(sc[i]==tc[j])
                i++;
            j++;
        }
        if(j==n)    return i==m;
        return true;
    }
}
// @lc code=end

