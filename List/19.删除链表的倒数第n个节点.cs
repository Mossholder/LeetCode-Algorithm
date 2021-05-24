/*
 * @lc app=leetcode.cn id=19 lang=csharp
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode RemoveNthFromEnd(ListNode head, int n)
    {
        ListNode temp = head;
        //求链表长度
        int len = 1;
        while (temp.next != null)
        {
            temp = temp.next;
            len += 1;
        }
        int index = len - n + 1;                //需删除节点的索引
        if (index == 1)
            head = head.next;
        else
        {
            //寻找删除节点的前一个节点
            ListNode before = head;
            int i = 1;
            while (i < index - 1)
            {
                before = before.next;
                i++;
            }
            before.next = before.next.next;
        }
        return head;
    }
}
// @lc code=end

