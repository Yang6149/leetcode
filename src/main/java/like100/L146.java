package like100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class L146 {
    HashMap<Integer,Nooo> map=new HashMap<>();
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

        @Override
        public String toString() {
            return "Nooo{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    LinkedList<Integer> linkedList;
    public L146(int capacity) {
        this.capacity=capacity;
        head=new Nooo(0,0);
        teal=new Nooo(0,0);
        head.next=teal;
        teal.pre=head;
    }

    public void remove(int key){
        Nooo cur=map.remove(key);

        cur.next.pre=cur.pre;
        cur.pre.next=cur.next;

        size--;
    }
    public int get(int key) {
        Nooo res=map.get(key);
        if(res==null)return -1;
        remove(key);
        put(key,res.value);
        return res.value;
    }

    public void put(int key, int value) {
        if(get(key)!=-1){
            remove(key);
        }
        if(size==capacity){
            remove(teal.pre.key);
        }
        Nooo cur=new Nooo(key,value);

        cur.next=head.next;
        cur.next.pre=cur;
        head.next=cur;
        cur.pre=head;

        map.put(key,cur);
        size++;
    }

    @Test
    public void test(){
        L146 l=new L146(2);
        l.put(1,1);
        l.put(2,2);
        l.get(1);
        l.put(3,3);
        System.out.println(l.get(2));
    }

    public static void main(String[] args) {
        L146 cache=new L146(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);
        System.out.println(cache.get(4));
        System.out.println();
    }
}
