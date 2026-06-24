/*
LeetCode 92. Reverse Linked List II


*/


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer>list=new ArrayList<>();
       ListNode temp =head;

       while(temp!=null)
       {
        list.add(temp.val);
        temp=temp.next;
       }

       int l=left-1;
       int r=right-1;

       while(l<r)
       {
        int t= list.get(l);
        list.set(l,list.get(r));
        list.set(r,t);

        l++;
        r--;
       }


        ListNode dummy = new ListNode(0);
        temp = dummy;

        for(int num : list)
        {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
      
      }
}
