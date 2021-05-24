/*
 * @lc app=leetcode.cn id=445 lang=csharp
 *
 * [445] 两数相加 II
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
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
    {
        Stack<int> s1 = new Stack<int>();
        Stack<int> s2 = new Stack<int>();
        while (l1 != null)
        {
            s1.Push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null)
        {
            s2.Push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode last = null;
        while (s1.Count > 0 || s2.Count > 0)
        {
            int sum = carry;
            sum += (s1.Count > 0 ? s1.Pop() : 0);
            sum += (s2.Count > 0 ? s2.Pop() : 0);
            if (sum >= 10)
            {
                sum %= 10;
                carry = 1;
            }
            else
                carry = 0;
            ListNode newNode = new ListNode(sum);
            newNode.next = last;
            last = newNode;
        }
        if (carry == 1)
        {
            ListNode newNode = new ListNode(1);
            newNode.next = last;
            last = newNode;
        }
        return last;
    }
}

// @lc code=end

