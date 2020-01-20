package like100;

import org.junit.Test;

import java.util.HashMap;

public class L142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        ListNode walker=head,runner=head;
        while (runner.next!=null&&runner.next.next!=null){
            walker=walker.next;
            runner=runner.next.next;
            if(walker==runner)break;
        }
        if(runner.next==null||runner.next.next==null)return null;
        ListNode begin=head;
        while(begin!=walker){
            begin=begin.next;
            walker=walker.next;
        }
        return begin;
    }
    @Test
    public void test(){
        ListNode head=new ListNode(1);
        ListNode b=new ListNode(2);
        head.next=b;
        b.next=head;
        System.out.println(detectCycle(head) == null ? null : detectCycle(head).val);

    }
}
