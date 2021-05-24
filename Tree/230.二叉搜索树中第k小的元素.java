import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**中序遍历解法
 * class Solution {
    private int count=0;
    private int res=0;
    public int kthSmallest(TreeNode root, int k) {
        OrderInMedium(root,k);
        return res;
    }
    private void OrderInMedium(TreeNode root,int k){
        if(root==null)  return;
        OrderInMedium(root.left,k);
        if(++count==k){
            res=root.val;
            return;
        }
        OrderInMedium(root.right,k);
    }
}
 */
//递归解法
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int l=num(root.left);
        if(l>k-1) return kthSmallest(root.left, k);
        else if(l==k-1) return root.val;
        else    return kthSmallest(root.right,k-l-1);
    }
    private int num(TreeNode root){
        if(root==null)  return 0;
        return 1+num(root.left)+num(root.right);
    }
}
// @lc code=end

