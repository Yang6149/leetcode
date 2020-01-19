package like100;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L23 {
    public ListNode mergeKLists(ListNode[] lists) {//n*m
        ListNode result=new ListNode(0);
        ListNode tail=result;
        PriorityQueue<ListNode> queue=new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val>o2.val){
                    return 1;
                }else if(o1.val<o2.val){
                    return -1;
                }
                return 0;
            }
        });
        for(ListNode node:lists){
            if(node!=null){
                queue.add(node);
            }
        }
        while(!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            if(tail.next!=null){
                queue.add(tail.next);
            }
        }
        return result.next;
    }
    @Test
    public void test(){
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(3);
        a1.next=a2;
        ListNode a3=new ListNode(6);
        a2.next=a3;
        ListNode a4=new ListNode(9);
        a3.next=a4;

        ListNode b1=new ListNode(2);
        ListNode b2=new ListNode(3);
        b1.next=b2;
        ListNode b3=new ListNode(4);
        b2.next=b3;
        ListNode b4=new ListNode(6);
        b3.next=b4;
        ListNode [] lists={a1,b1};
        System.out.println(mergeKLists(lists));
    }

}
