/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    private final static HashSet<Character> vowel=new HashSet<>(
        Arrays.asList('a','e','i','o','u','A','E','I','O','U')
    );

    public String reverseVowels(String s) {
        if(s==null) return null;
        int l=0,r=s.length()-1;
        char[] res=new char[s.length()];
        while(l<=r){
            char cl=s.charAt(l),cr=s.charAt(r);
            if(!vowel.contains(cl)) res[l]=s.charAt(l++);
            else if(!vowel.contains(cr))    res[r]=s.charAt(r--);
            else{
                res[l++]=cr;
                res[r--]=cl;
            }
        }    
        return new String(res);
    }
}
// @lc code=end

