package recursion;

public class SwapNodeInPair {
    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     *
     * You may not modify the values in the list's nodes, only nodes itself may be changed.
     *
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     */

    public class ListNode {
      public int val;
      public ListNode next;
      public ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode fake=new ListNode(-1);
            fake.next=head;
            so(fake);
            return fake.next;
        }
        public void so(ListNode head){
            if(head.next==null||head.next.next==null)return;
            ListNode next=head.next;
            ListNode next2=head.next.next;
            next.next=next2.next;
            next2.next=next;
            head.next=next2;
            so(next);
        }
    }
}
