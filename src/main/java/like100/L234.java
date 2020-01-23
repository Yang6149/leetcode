package like100;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

public class L234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode half=reverse(slow);
        while (half!=null){
            if (head.val!=half.val){
                return false;
            }
            head=head.next;
            half=half.next;
        }
        return true;
    }
    public ListNode reverse(ListNode root){
        ListNode pre=null;
        while (root!=null){
            ListNode next=root.next;
            root.next=pre;
            pre=root;
            root=next;
        }
        return pre;
    }

    @Test
    public void test(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(4);
        ListNode c=new ListNode(-1);
        ListNode d=new ListNode(-1);
        ListNode e=new ListNode(4);
        ListNode f=new ListNode(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(isPalindrome(a));
    }
}
