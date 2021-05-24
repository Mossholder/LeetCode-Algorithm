/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
/* 哈希表的方法
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen=s.length();
        if(sLen!=t.length())  return false;
        Map<Character,Integer>   Smap=new HashMap<>();
        Map<Character,Integer>   Tmap=new HashMap<>();
        for(int i=0;i<sLen;++i){
            Character sc=s.charAt(i);
            if(Smap.containsKey(sc)){
                int cnt=Smap.get(sc);
                Smap.put(sc,++cnt);
            }
            else
                Smap.put(sc,1);

            Character tc=t.charAt(i);
            if(Tmap.containsKey(tc)){
                int cnt=Tmap.get(tc);
                Tmap.put(tc,++cnt);
            }
            else
                Tmap.put(tc,1);
        }
        return Smap.equals(Tmap);
    }
}
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt=new int[26];
        for(char c:s.toCharArray())
            cnt[c-'a']++;
        for(char c:t.toCharArray())
            cnt[c-'a']--;
        for(int i:cnt)
            if(i!=0)   return false;
        return true;
    }
}
// @lc code=end

