import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)  return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int level=1;
        while(!queue.isEmpty()){
            LinkedList<Integer> temp=new LinkedList<>();
            int sz=queue.size();
            for(int i=0;i<sz;++i){
                TreeNode cur=queue.poll();
                if(level%2==1){
                    temp.add(cur.val);
                }else{
                    temp.addFirst(cur.val);
                }
                if(cur.left!=null)  queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
            level++;
            ans.add(temp);
        }
        return ans;
    }
}
// @lc code=end

