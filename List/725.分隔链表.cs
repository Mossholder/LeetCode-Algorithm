/*
 * @lc app=leetcode.cn id=725 lang=csharp
 *
 * [725] 分隔链表
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
    public ListNode[] SplitListToParts(ListNode root, int k)
    {
        int len = 0;
        ListNode curr = root;
        while (curr != null)
        {
            len++;
            curr = curr.next;
        }

        int basic = len / k;
        int add = len % k;
        ListNode[] result = new ListNode[k];
        curr = root;
        for (int i = 0; curr != null && i < k; ++i)
        {
            int ResSize = basic + (add-- > 0 ? 1 : 0);
            result[i] = curr;
            for (int j = 1; j < ResSize; ++j)
            {
                if (curr.next == null) break;
                curr = curr.next;
            }
            ListNode temp = curr.next;
            curr.next = null;
            curr = temp;
        }
        return result;
    }
}
// @lc code=end

