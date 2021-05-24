/*
 * @lc app=leetcode.cn id=328 lang=csharp
 *
 * [328] 奇偶链表
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
    public ListNode OddEvenList(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null)
        {
            ListNode temp = fast.next;
            fast.next = temp.next;
            temp.next = slow.next;
            slow.next = temp;
            slow = slow.next;
            fast = fast.next;
        }
        return head;
    }
}
// @lc code=end

