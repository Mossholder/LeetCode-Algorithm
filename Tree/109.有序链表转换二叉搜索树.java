/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)   return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode preMid=preMid(head);
        ListNode mid=preMid.next;
        preMid.next=null;
        TreeNode root=new TreeNode(mid.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(mid.next);
        return root;
    }
    private ListNode preMid(ListNode head){
        ListNode slow=head,fast=head.next;
        ListNode preMid=head;
        while(fast!=null&&fast.next!=null){
            preMid=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return preMid;
    }
}
// @lc code=end

