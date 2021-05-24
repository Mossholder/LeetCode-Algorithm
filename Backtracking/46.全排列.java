/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ret=new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> path=new LinkedList<>();
        BackTracking(nums,path);
        return ret;
    }
    private void BackTracking(int[] nums,LinkedList<Integer> path){
        if(nums.length==path.size()){
            ret.add(new LinkedList(path));
            return;
        }
        for(int i=0;i<nums.length;++i){
            if(path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            BackTracking(nums,path);
            path.removeLast();
        }
    }
}
// @lc code=end

