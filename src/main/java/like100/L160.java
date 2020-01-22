package like100;

public class L160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while (a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
            if(a==headA)return null;
        }
        return a;

    }
}
