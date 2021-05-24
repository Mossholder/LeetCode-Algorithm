import java.util.ArrayList;
import java.util.Queue;

import jdk.internal.jshell.tool.resources.l10n;

/*
 * @lc app=leetcode.cn id=310 lang=java
 *
 * [310] 最小高度树
 */

// @lc code=start
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res=new ArrayList<>();
        if(n==1){
            res.add(0);
            return res;
        }
        List<List<Integer>> map=new ArrayList<>();
        for(int i=0;i<n;++i){
            map.add(new ArrayList<Integer>());
        }
        int[] degrees=new int[n];
        for(int[] edge:edges){
            degrees[edge[0]]++;
            degrees[edge[1]]++;
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;++i){
            if(degrees[i]==1){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            res=new ArrayList<>();
            int sz=queue.size();
            for(int i=0;i<sz;++i){
                int cur=queue.poll();
                res.add(cur);
                List<Integer> neighbor=map.get(cur);
                for(int item : neighbor){
                    degrees[item]--;
                    if(degrees[item]==1)
                        queue.offer(item);
                }
            }
        }
        return res;
    }
}
// @lc code=end

