import java.util.Iterator;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
/**
 * class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                int num=map.get(c);
                map.put(c,++num);
            }
            else
                map.put(c,1);
        }
        boolean leave=false;
        int cnt=0;
        Iterator<Map.Entry<Character,Integer>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry=it.next();
            cnt+=entry.getValue()/2;
            leave=leave||entry.getValue()%2!=0;
        }
        return 2*cnt+(leave==true?1:0);
    }
}
 */
class Solution {
    public int longestPalindrome(String s) {
        int[] cnts=new int[128];
        for(char c:s.toCharArray())
            cnts[c]++;
        int num=0;
        for(int i:cnts)
            num+=i/2;
        return 2*num+(2*num==s.length()?0:1);
    }
}
// @lc code=end

