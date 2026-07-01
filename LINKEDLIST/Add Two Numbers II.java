// [445.] :- Add Two Numbers II



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        
        l1=reverse(l1);
        l2=reverse(l2);

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        int carry=0;

        while(l1!=null || l2!=null || carry!=0)
        {

            int x=(l1!=null)? l1.val:0;
            int y= (l2!=null)?l2.val:0;

            int sum= x+y+carry;
            carry=sum/10;

            temp.next=new ListNode(sum%10);
            temp=temp.next;

            if(l1!=null)
            {
                l1=l1.next;
            }

            if(l2!=null)
            {
                l2=l2.next;
            }
        }
        return reverse(dummy.next);

    }
        public ListNode reverse(ListNode head)
        {
            ListNode prev=null;
            ListNode curr=head;

            while(curr != null)
            {
                ListNode next= curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
     
    
}
