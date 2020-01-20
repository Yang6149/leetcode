package like100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class L146 {
    int capacity;
    int size=0;
    Nooo head;
    Nooo teal;
    class Nooo{
        private Nooo(int key,int value){
            this.key=key;
            this.value=value;
        }
        int key;
        int value;
        Nooo next;
        Nooo pre;
    }
    LinkedList<Integer> linkedList;
    public L146(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        Nooo index=head;
        while (index!=null){
            if(index.key==key){
                if(index!=head){
                    index.pre.next=index.next;
                    index.next.pre=index.pre;
                    index.next=head;
                    head.pre=index;
                    head=index;
                }
                return index.value;

            }
            index=index.next;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(size==0){
            head= new Nooo(key,value);
            teal=head;
            head.next=head;
            head.pre=head;
        }
        if(size==capacity){
            teal=teal.pre;
            teal.next=null;
        }
        if(size<capacity){
            size++;
        }
        Nooo cur=new Nooo(key,value);
        head.pre=cur;
        cur.next=head;
        head=cur;
    }
}
