/*
LeetCode 19 - Remove Nth Node From End of List

Pattern: Fast & Slow Pointer

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i <= n; i++)
        {
            fast = fast.next;
        }

        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
