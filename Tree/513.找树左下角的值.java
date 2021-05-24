import javax.swing.tree.TreeNode;

import sun.misc.Queue;

/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root=queue.poll();
            if(root.right!=null)    queue.offer(root.right);
            if(root.left!=null)     queue.offer(root.left);
        }
        return root.val;
    }
}
// @lc code=end

