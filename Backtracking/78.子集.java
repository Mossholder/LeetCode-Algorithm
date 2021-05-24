/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    //回溯算法
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> path=new ArrayList<>();
        BackTracking(nums,0,path);
        return res;
    }
    private void BackTracking(int[] nums,int start,ArrayList<Integer> path){
        res.add(new ArrayList(path));
        for(int i=start;i<nums.length;++i){
            path.add(nums[i]);
            BackTracking(nums,i+1,path);
            path.remove(path.size()-1);
        }
    }

//数学归纳法
/*
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret=new ArrayList<>();
        int N=nums.length;
        if(N==0){
            ret.add(new ArrayList<Integer>());
            return ret;
        }
        int num=nums[N-1];
        ret=subsets(Arrays.copyOf(nums,N-1));
        int m=ret.size();
        for(int i=0;i<m;++i){
            List<Integer> temp=new ArrayList(ret.get(i));
            temp.add(num);
            ret.add(temp);
        }
        return ret;
    }
*/
}
// @lc code=end

