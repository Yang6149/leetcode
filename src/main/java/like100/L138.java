package like100;

import org.junit.Test;
import org.w3c.dom.traversal.NodeIterator;

import java.util.HashMap;

public class L138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node item=head,next;
        while(item!=null){
            next=item.next;
            Node cur= new Node(item.val);
            item.next=cur;
            cur.next=next;
            item=next;
        }
        item=head;
        while (item!=null){
            if(item.random==null){
                item.next.random=null;
            }else {
                item.next.random=item.random.next;
            }
            item=item.next.next;
        }
        item=head;
        Node head2=head.next;
        Node res=head2;
        while(head2.next!=null){

            item.next=head2.next;
            item=item.next;
            head2.next=item.next;
            head2=head2.next;
        }
        item.next=null;
        return res;
    }
    @Test
    public void test(){

    }
}
