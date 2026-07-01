/*
LeetCode 160 - Intersection of Two Linked Lists

Pattern: Two Pointers

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while(a != b)
        {
            if(a == null)
            {
                a = headB;
            }
            else
            {
                a = a.next;
            }

            if(b == null)
            {
                b = headA;
            }
            else
            {
                b = b.next;
            }
        }

        return a;
    }
}
