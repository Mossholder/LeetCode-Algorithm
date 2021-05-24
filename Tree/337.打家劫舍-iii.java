/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
    
    public int rob(TreeNode root) {
        if(root==null)  return 0;
        int val_1=root.val;
        if(root.left!=null) val_1+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null)    val_1+=rob(root.right.left)+rob(root.right.right);
        int val_2=rob(root.left)+rob(root.right);
        return Math.max(val_1,val_2);
    }
    
}
// @lc code=end

