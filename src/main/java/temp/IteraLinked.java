package temp;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteraLinked {
    public static void main(String[] args) {
        int a=0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i<100000;i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            list.get(i);
            a++;
        }
        System.out.println("普通for循环："+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (Integer integer : list) {
            a++;
        }
        System.out.println("foreach循环："+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        ListIterator<Integer> integerListIterator = list.listIterator();
        while(integerListIterator.hasNext()){
            integerListIterator.next();
            a++;
        }
        System.out.println("iterator："+(System.currentTimeMillis()-start));
    }
}
