package like100;

import org.junit.Test;

public class L19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode a=head;
        ListNode b=head;
        ListNode beforeA=new ListNode(0);
        ListNode result=beforeA;
        beforeA.next=a;
        for(int i=1;i<n;i++){
            b=b.next;
        }
        while(b.next!=null){
            beforeA=a;
            a=a.next;
            b=b.next;

        }
        beforeA.next=a.next;
        return result.next;
    }
    @Test
    public void test(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        a.next=b;
        ListNode c=new ListNode(3);
        b.next=c;
        ListNode d=new ListNode(4);
        c.next=d;
        System.out.println(removeNthFromEnd(a,4));
    }
}
