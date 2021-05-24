import jdk.internal.jshell.tool.resources.l10n;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)  return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int sz=queue.size();
            for(int i=0;i<sz;++i){
                TreeNode cur=queue.poll();
                if(i==sz-1) ans.add(cur.val);
                if(cur.left!=null)  queue.offer(cur.left);
                if(cur.right!=null)  queue.offer(cur.right);
            }
        }
        return ans;
    }
}
// @lc code=end

