/*
 * @lc app=leetcode.cn id=160 lang=csharp
 *
 * [160] 相交链表
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
    public ListNode GetIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null)
            return null;
        ListNode l1 = headA, l2 = headB;
        ListNode lastA = headA, lastB = headB;
        while (lastA.next != null)
            lastA = lastA.next;
        while (lastB.next != null)
            lastB = lastB.next;
        if (lastA != lastB)
            return null;

        while (l1 != l2)
        {
            l1 = (l1.next == null) ? headB : l1.next;
            l2 = (l2.next == null) ? headA : l2.next;
        }
        return l1;
    }
}
// @lc code=end

