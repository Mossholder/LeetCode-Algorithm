/*
 * @lc app=leetcode.cn id=61 lang=csharp
 *
 * [61] 旋转链表
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
    public ListNode RotateRight(ListNode head, int k)
    {
        if (head == null || head.next == null || k == 0)
            return head;
        ListNode last = head;
        //计算长度
        int length = 1;
        while (last.next != null)
        {
            ++length;
            last = last.next;
        }
        k %= length;
        if (k == 0)
            return head;
        last.next = head;               //收尾连接
        ListNode newhead = null;
        ListNode newTail = head;
        int move = length - k - 1;      //新尾结点与头结点的距离
        while (move-- > 0)
            newTail = newTail.next;
        newhead = newTail.next;
        newTail.next = null;
        return newhead;
    }
}
// @lc code=end