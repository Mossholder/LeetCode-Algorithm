/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        Depth(root);
        return max;
    }

    private int Depth(TreeNode root) {
        if (root == null)
            return 0;
        int l = Depth(root.left);
        int r = Depth(root.right);
        max = Math.max(max, l + r);
        return Math.max(l, r) + 1;
    }
}
// @lc code=end
