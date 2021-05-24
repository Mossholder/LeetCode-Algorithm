/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return Start_Root(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int Start_Root(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int num = 0;
        if (root.val == sum)
            num++;
        num += Start_Root(root.left, sum - root.val) + Start_Root(root.right, sum - root.val);
        return num;
    }
}
// @lc code=end
