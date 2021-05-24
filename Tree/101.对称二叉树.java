/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)  return true;
        return  isSymmetric(root.left,root.right);
    }
    private boolean isSymmetric(TreeNode s,TreeNode t){
        if(s==null&&t==null)    return true;
        if(s==null||t==null)    return false;
        if(s.val!=t.val)        return false;
        return isSymmetric(s.left,t.right)&isSymmetric(s.right,t.left);
    }
}
// @lc code=end

