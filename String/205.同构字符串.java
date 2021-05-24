import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] preS=new int[256];
        int[] preT=new int[256];
        for(int i=0;i<s.length();++i){
            if(preS[s.charAt(i)]!=preT[t.charAt(i)])    return false;
            preS[s.charAt(i)]=i+1;
            preT[t.charAt(i)]=i+1;
        }
        return true;
    }
}
// @lc code=end

