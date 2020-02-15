package interview100;
import org.junit.Test;
import recursion.SwapNodeInPair.*;
public class L25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res;
        ListNode pre = new ListNode(-1);
        res = pre;
        pre.next=head;
        ListNode cur = pre;
        ListNode nextHead ;
        while(head!=null){
            int count=0;
            while(cur.next!=null&&count<k){
                cur=cur.next;
                count++;
            }
            if(count<k){
                break;
            }else{
                nextHead=cur.next;
                ListNode tou = pre.next;
                pre.next=cur;
                reverse(tou,k);
                tou.next=nextHead;
                cur=tou;
            }

            pre=cur;

        }
        return res.next;
    }
    public void reverse(ListNode head,int k){
        ListNode pre = head;
        ListNode cur = pre.next;
        if (cur==null)return;
        ListNode teal = cur.next;
        for(int i=1;i<k;i++){
            cur.next = pre;
            pre = cur;
            cur = teal;
            if(teal!=null){
                teal = teal.next;
            }

        }
    }
    @Test
    public void test(){
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(6);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        System.out.println(reverseKGroup(a1,1));
    }
}
