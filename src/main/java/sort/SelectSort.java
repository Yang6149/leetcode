package sort;

import org.junit.Test;

import java.util.Random;

public class SelectSort {
    public void SelectSort(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            int lo=i;
            for (int j = i+1;j<nums.length;j++){
                if (nums[lo]>nums[j])lo=j;
            }
            SortUtil.swap(nums,lo,i);
        }
    }

    @Test
    public void test(){
        int [] nums = SortUtil.getRandom();
        SelectSort(nums);
        System.out.println(SortUtil.judge(nums));
    }
}
