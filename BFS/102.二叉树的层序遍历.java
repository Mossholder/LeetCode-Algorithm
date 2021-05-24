import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            List<List<Integer>> ret=new LinkedList<>();
            return ret;
        }
        List<List<Integer>> ret=new LinkedList<>();

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int sz=queue.size();
            LinkedList<Integer> temp=new LinkedList<>();
            for(int i=0;i<sz;++i){
                TreeNode cur=queue.poll();
                temp.add(cur.val);
                if(cur.left!=null)  queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
            ret.add(temp);
        }
        return ret;
    }
}
// @lc code=end

