package like100;

import org.junit.Test;

public class L148 {
    public ListNode sortList(ListNode head) {
        if (head.next==null){
            return head;
        }
        //1 分
        ListNode pre=head,slow=head,fast=head;//1-2-3
        while (fast!=null&&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pre.next=null;
        ListNode left=head;
        //2
        left = sortList(left);
        ListNode right=sortList(slow);
        //合
        return merge(left,right);
    }

    public ListNode merge(ListNode left,ListNode right){
        ListNode index1=left;
        ListNode index2=right;
        ListNode res;
        if(index2==null||(index1!=null&&index1.val<=index2.val)){
            res=index1;
            index1=index1.next;
        }else{
            res=index2;
            index2=index2.next;
        }
        ListNode resss=res;
        while (index1!=null||index2!=null){
            if(index2==null||(index1!=null&&index1.val<=index2.val)){
                res.next=index1;
                index1=index1.next;
                res=res.next;
            }else{
                res.next=index2;
                index2=index2.next;
                res=res.next;
            }
        }
        return resss;
    }



    @Test
    public void test(){
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(6);
        ListNode e = new ListNode(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a);

        System.out.println(sortList(a));
    }
}
