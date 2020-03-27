package sort;

import org.junit.Test;

public class HsellSort {
    public void ShellSort(int [] nums){
        int len = nums.length;
        for(int gap = len/2;gap>0;gap=gap/2){
            for (int i = 0; i < len; i++) {
                int j = i;
                int current = nums[i];
                while(j - gap>=0 && current<nums[j-gap]){
                    nums[j] = nums[j-gap];
                    j=j-gap;
                }
                nums[j]=current;
            }

        }
    }
    @Test
    public void test(){
        int [] nums = SortUtil.getRandom();
        ShellSort(nums);
        System.out.println(SortUtil.judge(nums));
    }
}
