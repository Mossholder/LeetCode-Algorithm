/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
    private int path=0;
    public int longestUnivaluePath(TreeNode root) {
        pass_root(root);
        return path;
    }
    private int pass_root(TreeNode root){
        if(root==null)  return 0;
        int l=pass_root(root.left);
        int r=pass_root(root.right);
        int left_path=root.left!=null&&root.left.val==root.val?l+1:0;
        int right_path=root.right!=null&&root.right.val==root.val?r+1:0;
        path=Math.max(path,left_path+right_path);
        return Math.max(left_path,right_path);
    }
}
// @lc code=end

