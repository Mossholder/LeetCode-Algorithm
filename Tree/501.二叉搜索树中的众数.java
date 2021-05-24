import java.util.List;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int max=1;
    private int count=1;
    private TreeNode preNode=null;
    
    public int[] findMode(TreeNode root) {
        List<Integer> MaxNums=new ArrayList<Integer>();
        inOrder(root,MaxNums);
        int[] res=new int[MaxNums.size()];
        int i=0;
        for(int item:MaxNums)
            res[i++]=item;
        return res;
    }
    private void inOrder(TreeNode root,List<Integer> nums){
        if(root==null)  return;
        inOrder(root.left,nums);
        if(preNode!=null){
            if(root.val==preNode.val)   ++count;
            else count=1;
        }
        if(count>max){
            max=count;
            nums.clear();
            nums.add(root.val);
        }
        else if(count==max)
            nums.add(root.val);
        preNode=root;
        inOrder(root.right,nums);
    }
}
// @lc code=end

