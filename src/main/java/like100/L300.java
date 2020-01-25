package like100;

import org.junit.Test;

import java.util.Arrays;

public class L300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<1)return 0;
        int [] res = new int[nums.length];
        int size=0;
        for(int i=0;i<nums.length;i++){
            int low=0;
            int high=size;
            while (high!=low){
                int m=(high+low)/2;
                if(res[m]<nums[i]){
                    low=m+1;
                }else {
                    high=m;
                }
            }
            res[high]=nums[i];
            if(high==size)size++;
        }
        return size;
    }

    @Test
    public void test(){
        int [] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}
