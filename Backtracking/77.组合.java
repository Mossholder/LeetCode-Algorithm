/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> path=new ArrayList<>();
        BackTracking(n,1,k,path);
        return res;
    }
    private void BackTracking(int n,int start,int k,ArrayList<Integer> path){
        int len=path.size();
        if(len==k){
            res.add(new ArrayList(path));
            return;
        }
        for(int i=start;i<=n;++i){
            path.add(i);
            BackTracking(n,i+1,k,path);
            path.remove(len);
        }
    }
}
// @lc code=end

