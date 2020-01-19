package like100;

import org.junit.Test;

public class L41 {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0&&nums[i]<=nums.length&&nums[nums[i]-1]!=nums[i]){//7 6 2 4 5 9 1 8
                int a=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=a;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)return i+1;
        }
        return nums.length+1;
    }
    @Test
    public void test(){
        int [] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
}
