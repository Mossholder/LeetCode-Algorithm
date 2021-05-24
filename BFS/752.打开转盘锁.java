import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {
    public int openLock(String[] deadends, String target) {
        //双向BFS
        Set<String> deads=new HashSet<>();
        for(String s:deadends)  deads.add(s);

        Set<String> q1=new HashSet<>();
        Set<String> q2=new HashSet<>();
        q1.add("0000");
        q2.add(target);
        Set<String> visited=new HashSet<>();
        int step=0;

        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.size()>q2.size()){
                Set<String> swap=q1;
                q1=q2;
                q2=swap;
            }
            Set<String> temp=new HashSet<>();
            for(String cur:q1){
                if(deads.contains(cur)) continue;
                if(q2.contains(cur))    return step;
                visited.add(cur);
                for(int j=0;j<4;++j){
                    String up=PlusOne(cur, j);
                    if(!visited.contains(up)){
                        temp.add(up);
                    }
                    String down=MinusOne(cur, j);
                    if(!visited.contains(down)){
                        temp.add(down);
                    }
                }
            }
            step++;
            q1=q2;
            q2=temp;
        }
        return -1;
    }

    private String PlusOne(String s,int j){
        char[] c=s.toCharArray();
        if(c[j]=='9')   c[j]='0';
        else    c[j]++;
        return new String(c);
    }

    private String MinusOne(String s,int j){
        char[] c=s.toCharArray();
        if(c[j]=='0')   c[j]='9';
        else    c[j]--;
        return new String(c);
    }
}
// @lc code=end