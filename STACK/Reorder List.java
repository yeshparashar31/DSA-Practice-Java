// 143 :-Reorder List.java
// i/p= head= 1->2->3->4->5
// o/p=  1->5->2->4->3



class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }


        ListNode fast=head;
        ListNode slow=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }

           ListNode prev=null;
           ListNode curr=slow.next;
           slow.next=null;

           while(curr!=null)
           {
            ListNode next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
           }


           ListNode first=head;
           ListNode second=prev;

           while(second!=null)
           {
              
              ListNode firstNext=first.next;
              ListNode  secondNext=second.next;

              first.next=second;
              second.next=firstNext;

              first=firstNext;
              second=secondNext;
           }

    //   ArrayList<ListNode> list=new ArrayList<>();
    //   ListNode temp=head;

    //   while(temp!=null)
    //   {
    //     list.add(temp);
    //     temp=temp.next;
    //   }

    //         int l=0;
    //         int r=list.size()-1;

    //         while(l<r)
    //         {
    //             list.get(l).next=list.get(r);
    //             l++;

    //             if(l==r)
    //             {
    //                 break;
    //             }

    //             list.get(r).next=list.get(l);
    //             r--;
    //         }

    //         list.get(l).next=null;

    }
}
