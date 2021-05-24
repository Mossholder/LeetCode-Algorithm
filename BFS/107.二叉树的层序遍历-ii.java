import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ret=new LinkedList<>();
        if(root==null){
            return ret;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int sz=queue.size();
            List<Integer> temp=new LinkedList<>();
            for(int i=0;i<sz;++i){
                TreeNode cur=queue.poll();
                temp.add(cur.val);
                if(cur.left!=null)  queue.offer(cur.left);
                if(cur.right!=null)  queue.offer(cur.right);
            }
            ret.addFirst(temp);
        }  
        return ret;
    }
}
// @lc code=end

