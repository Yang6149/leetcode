package csnote.greedy;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * see like 100 406
 */
public class L406 {
    public static void main(String[] args) {
        int capacity=10000;
        ArrayList<Integer> list = new ArrayList<>(capacity);
        LinkedList<Integer> link = new LinkedList<>();
        long begin = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            list.add(i);
        }
        System.out.println(System.currentTimeMillis()-begin);
        begin=System.currentTimeMillis();
        link.add(0);
        for (int i=0;i<10000-1;i++){
            link.add(i,i);
        }
        System.out.println(System.currentTimeMillis()-begin);
    }
}
