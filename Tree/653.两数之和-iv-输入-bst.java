/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list=ConvertToArray(root);
        int i=0,j=list.size()-1;
        while(i<j){
            int sum=list.get(i)+list.get(j);
            if(sum==k)  return true;
            if(sum<k)   ++i;
            else    --j;
        }
        return false;
    }
    private ArrayList<Integer> ConvertToArray(TreeNode root){
        if(root==null)  return new ArrayList<Integer>();
        ArrayList<Integer> res=new ArrayList<>();
        res.addAll(ConvertToArray(root.left));
        res.add(root.val);
        res.addAll(ConvertToArray(root.right));
        return res;
    }
}
// @lc code=end

