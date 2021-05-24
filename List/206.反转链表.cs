/*
 * @lc app=leetcode.cn id=206 lang=csharp
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution
{
    public ListNode ReverseList(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        /*ListNode dummy = new ListNode(0);
        while (head != null)
        {
            ListNode next = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = next;
        }
        return dummy.next;*/
        ListNode next = head.next;
        ListNode newhead = ReverseList(next);
        next.next = head;
        head.next = null;
        return newhead;
    }
}
// @lc code=end

