package contest.contest176;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class L1354 {
    public boolean isPossible(int[] target) {
        Queue<Integer> queue = new PriorityQueue<Integer>((a,b)->b-a);
        long sum = 0;
        for(int i=0;i<target.length;i++){
            sum+=target[i];
            queue.offer(target[i]);
        }
        while(queue.peek()>1){
            int num = queue.poll();
            sum=sum-num;
            num%=sum;
            sum+=num;
            if(num<1)return false;
            queue.offer(num);
        }
        if(queue.peek()==1)return true;
        return false;
    }

    @Test
    public void test(){
        int [] a = {9,3,5};
        System.out.println(isPossible(a));

    }
}
