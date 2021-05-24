/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)  return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        int step=1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int sz=queue.size();
            for(int i=0;i<sz;++i){
                TreeNode temp=queue.poll();
                if(temp.left==null && temp.right==null)
                    return step;
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null)    queue.offer(temp.right);
            }
            step++;
        }
        return -1;
    }
}
// @lc code=end

