package like100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class L239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length<1)return nums;
        int n=nums.length;
        int [] res=new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while (!deque.isEmpty()&&deque.peek()<i-k+1){
                deque.pollFirst();
            }
            while (!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i-k+1>=0){
                res[i-k+1]=nums[deque.peek()];
            }
        }
        return res;
    }

    @Test
    public void test(){
        int nums[]={1,3,1,2,0,5};
        System.out.println(maxSlidingWindow(nums,3));
    }
}
