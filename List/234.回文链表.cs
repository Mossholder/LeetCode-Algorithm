/*
 * @lc app=leetcode.cn id=234 lang=csharp
 *
 * [234] 回文链表
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
    public bool IsPalindrome(ListNode head)
    {
        if (head==null||head.next==null)    return true;

        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null)
        {
            slow =slow.next;
            fast=fast.next.next;
        }
        slow=slow.next;
        ListNode corr=ReverseList(slow);
        ListNode curr=head;
        while(corr!=null)
        {
            if(corr.val!=curr.val)
                return false;
            corr=corr.next;
            curr=curr.next;
        }
        return true;
    }
    public ListNode ReverseList(ListNode l)
    {
        if(l==null||l.next==null)   return l;
        ListNode next=l.next;
        ListNode newHead=ReverseList(next);
        next.next=l;
        l.next=null;
        return newHead;
    }
}
// @lc code=end

