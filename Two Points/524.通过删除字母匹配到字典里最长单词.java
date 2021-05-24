/*
 * @lc app=leetcode.cn id=524 lang=java
 *
 * [524] 通过删除字母匹配到字典里最长单词
 */

// @lc code=start
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String ret="";
        for(String target:d){
            if(ret.length()>target.length()||!isSub(s,target))    
                continue;
            else if(ret.length()<target.length()||ret.compareTo(target)>0)
                ret=target;        
        }
        return ret;
    }
    private boolean isSub(String s,String target){
        int j=0;
        for(int i=0;i<s.length()&&j<target.length();++i){
            if(s.charAt(i)==target.charAt(j))   ++j;
        }
        return j==target.length();
    }
}
// @lc code=end

