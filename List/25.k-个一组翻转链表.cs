/*
 * @lc app=leetcode.cn id=25 lang=csharp
 *
 * [25] K 个一组翻转链表
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
    public ListNode ReverseKGroup(ListNode head, int k)
    {
        int len = GetLength(head);              //链表长度
        int loop = len / k;                     //翻转组数
        if (loop == 0 || k == 1)
            return head;

        ListNode dummy = new ListNode(-1);      //建立头结点
        dummy.next = head;

        //翻转方法：头插法
        ListNode pre = dummy;
        ListNode move = head;
        //ListNode insert = move.next;
        while (move != null)
        {
            //Nxt是翻转组的末节点
            ListNode Nxt = pre;
            for (int j = 1; j <= k; ++j)
                Nxt = Nxt.next;
            while (move != Nxt)
            {
                ListNode insert = move.next;
                move.next = insert.next;
                insert.next = pre.next;
                pre.next = insert;
                //insert = move.next;
            }
            pre = Nxt;
            move = pre.next;
            /*
            if (i != loop)
            {
                move = pre.next;
                insert = move.next;
            }*/

        }
        return head;
    }
    public int GetLength(ListNode l)
    {
        int count = 0;
        while (l != null)
        {
            count++;
            l = l.next;
        }
        return count;
    }
}
// @lc code=end

