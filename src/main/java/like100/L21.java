package like100;

import org.junit.Test;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class L21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l=new ListNode(0);
        ListNode result=l;
        while(l1!=null||l2!=null){
            if(l1==null){
                l.next=l2;
                l=l.next;
                l2=l2.next;
                continue;
            }
            if(l2==null||l1.val<l2.val){
                l.next=l1;
                l=l.next;
                l1=l1.next;
                continue;
            }
            if(l1.val>=l2.val){
                l.next=l2;
                l=l.next;
                l2=l2.next;
                continue;
            }
        }
        return result.next;
    }
    @Test
    public void test(){
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(4);
        ListNode b1=new ListNode(1);
        ListNode b2=new ListNode(3);
        ListNode b3=new ListNode(4);
        a1.next=a2;
        a2.next=a3;
        b1.next=b2;
        b2.next=b3;
        System.out.println(mergeTwoLists(a1,b1));
    }
}
