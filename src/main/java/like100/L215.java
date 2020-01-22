package like100;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class L215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        for (int num : nums) {
            if (queue.size()<k){
                queue.add(num);
                continue;
            }
            if(queue.peek()<num){
                queue.poll();
                queue.add(num);
            }
        }
        return queue.peek();
    }

    @Test
    public void test(){
        int [] nums=new int[100];
        Random r=new Random();
        for(int i=0;i<nums.length;i++){
            nums[i]=r.nextInt(10000);
        }
        System.out.println(findKthLargest(nums,3));
    }
}
