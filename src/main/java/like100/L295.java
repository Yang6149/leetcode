package like100;

import org.junit.Test;

import java.util.*;

public class L295 {
    /** initialize your data structure here. */

    class MedianFinder {
        PriorityQueue<Integer> rightQueue=new PriorityQueue<>();
        PriorityQueue<Integer> leftQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        int allSize=0;

        /** initialize your data structure here. */
        public MedianFinder() {

        }

        public void addNum(int num) {
            if(allSize==0){
                leftQueue.add(num);
                allSize++;
                return;
            }
            if((allSize&1)==0){//双数
                if(num>=rightQueue.peek()){
                    leftQueue.add(rightQueue.poll());
                    rightQueue.add(num);
                }else {
                    leftQueue.add(num);
                }
            }else{//单数
                if(num>=leftQueue.peek()){
                    rightQueue.add(num);
                }else{
                    rightQueue.add(leftQueue.poll());
                    leftQueue.add(num);
                }
            }
            allSize++;
        }


        public double findMedian() {
            if((allSize&1)==1){
                return leftQueue.peek();
            }else {
                return ((double)(leftQueue.peek()+rightQueue.peek()))/2;
            }
        }
    }
    @Test
    public void test(){
        MedianFinder a=new MedianFinder();
        a.addNum(1);
        System.out.println(a.findMedian());
        a.addNum(10);
        System.out.println(a.findMedian());
        a.addNum(6);
        System.out.println(a.findMedian());
        a.addNum(7);
        System.out.println(a.findMedian());
    }
}
