package pickOne;

public class L2AddTowNum {




    public static void main(String[] args) {
        ListNode a1=new ListNode(2);
        ListNode a2=new ListNode(8);
        ListNode a3=new ListNode(9);
        ListNode b1=new ListNode(5);//982+915=1897
        ListNode b2=new ListNode(1);
        ListNode b3=new ListNode(9);
        b1.next=b2;
        b2.next=b3;
        a1.next=a2;
        a2.next=a3;
        System.out.println(addTwoNumbers(a1,b1).toString());

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result;
        ListNode begin=new ListNode(0);
        result=begin;
        int jin=0;
        while(l1!=null||l2!=null){
            int sum=0;
            int num1=l1==null? 0:l1.val;
            int num2=l2==null? 0:l2.val;
            sum=(num1+num2+jin)%10;
            if((num1+num2+jin)>9){
                jin=1;
            }else{
                jin=0;
            }

            begin.next=new ListNode(sum);
            begin=begin.next;
            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;
        }
        if(jin>0){
            begin.next=new ListNode(1);
        }
        return result.next;

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return val+" "+next;
    }
}