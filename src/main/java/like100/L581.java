package like100;

import org.junit.Test;

public class L581 {
    public int findUnsortedSubarray(int[] nums) {
        int teal=0;
        int curMax=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]<curMax){
                teal=i;
            }
            curMax=Math.max(curMax,nums[i]);
        }
        int head=nums.length-1;
        int curMin=nums[nums.length-1];
        for (int i=nums.length-2;i>=0;i--){
            if (nums[i]>curMin){
                head=i;
            }
            curMin=Math.min(curMin,nums[i]);
        }
        return head<teal?teal-head+1:0;
    }
    @Test
    public void test(){
        int [] nums = {1,2,3,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
