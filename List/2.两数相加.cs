/*
 * @lc app=leetcode.cn id=2 lang=csharp
 *
 * [2] 两数相加
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
        ListNode Sum = new ListNode(0);
        ListNode curr = Sum;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0)
        {
            int sum = carry;
            if (l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum > 9)
            {
                sum = sum % 10;
                carry = 1;
            }
            else
                carry = 0;
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        return Sum.next;

    }
}
// @lc code=end

