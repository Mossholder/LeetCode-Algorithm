/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //version 1
        //用小尺寸满足小胃口的孩子
        int glen=g.length,slen=s.length;
        if(glen==0 || slen==0)  return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int res=0;
        for(int i=0,j=0;i<slen && j<glen;++i){
            if(s[i]>=g[j]){
                j++;
                res++;
            }
        }
        return res;
    }
    /*
        //version 1
        //用大尺寸的饼满足胃口大的孩子
        int glen=g.length,slen=s.length;
        if(glen==0 || slen==0)  return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int res=0;
        for(int i=slen-1,j=glen-1;i>=0 && j>=0;j--){
            if(s[i]>=g[j]){
                res++;
                i--;
            }
        }
        return res;
    */
     
}
// @lc code=end

