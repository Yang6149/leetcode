package everydayLeet;

import org.junit.Test;

import java.util.HashMap;

public class L146 {
    class Node {
        public int key, val;
        public Node next, prev;
        public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }

    int capacity = 0;
    int size = 0;
    Node head = null;
    Node tail = null;
    HashMap<Integer,Node> map;
    public L146(int capacity) {
        map = new HashMap<>();
        size = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        Node i = map.get(key);
        if(i==null)return -1;
        put(key, i.val);
        return i.val;
    }

    public void put(int key, int value) {
        if(map.get(key)==null){
            if (size==capacity){
                size--;
                Node a = head;
                removeHead();
                map.remove(a.key);
            }
        }else{
            size--;
            removeNode(key);
        }
        Node node = new Node(key,value);
        addToTail(node);

    }

    private void addToTail(Node node){
        size++;
        map.put(node.key,node);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    private void removeHead(){
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    private void removeNode(int i){
        Node node = map.get(i);
        map.remove(i);
        if(node==head){
            removeHead();
            return;
        }
        if(node==tail){
            tail=tail.prev;
            tail.next=null;
            return;
        }
        Node pre = node.prev;
        Node next = node.next;
        pre.next = next;
        next.prev = pre;
    }
    @Test
    public void test(){

    }

    public static void main(String[] args) {
        L146 l = new L146(2);
        l.get(2);
        l.put(2,6);
        l.get(1);
        l.put(1,5);
        l.put(1,2);
        l.get(1);
        l.get(2);

    }
}
