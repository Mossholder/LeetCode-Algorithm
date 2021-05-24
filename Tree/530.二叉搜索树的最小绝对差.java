/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
    private int res=Integer.MAX_VALUE;
    private TreeNode preNode=null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return res;
    }
    //中序遍历
    private void inOrder(TreeNode root){
        if(root==null)  return;
        inOrder(root.left);
        if(preNode!=null)   res=Math.min(res,root.val-preNode.val);
        preNode=root;
        inOrder(root.right);
    }
}
// @lc code=end

