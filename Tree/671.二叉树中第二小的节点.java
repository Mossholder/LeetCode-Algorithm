/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
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
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left==null||root==null) return -1;
        int l=root.left.val;
        int r=root.right.val;
        if(l==root.val) l=findSecondMinimumValue(root.left);
        if(r==root.val) r=findSecondMinimumValue(root.right);
        if(r!=-1&&l!=-1)    return Math.min(l,r);
        if(r!=-1)   return r;
        return l;
    }
}
// @lc code=end

