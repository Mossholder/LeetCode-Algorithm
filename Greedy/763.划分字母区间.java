/*
 * @lc app=leetcode.cn id=763 lang=java
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> ret=new ArrayList<>();
        int[] farthest=new int[26];
        char[] s=S.toCharArray();
        int n=s.length;
        for(int i=0;i<n;i++){
            farthest[s[i]-'a']=i;
        }   
        int left=0,right=0;
        for(int i=0;i<n;++i){
            right=Math.max(right,farthest[s[i]-'a']);
            if(i==right){
                ret.add(i-left+1);
                left=i+1;
            }
        }
        return ret;
    }
}
// @lc code=end

