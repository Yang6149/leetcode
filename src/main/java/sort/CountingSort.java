package sort;

import org.junit.Test;

public class CountingSort {
    public void countingSort(int [] nums,int bound){
        int count[] = new int[bound];
        for (int num : nums) {
            count[num]++;
        }
        int begin=0;
        for (int i = 0; i < nums.length; i++) {
            while (count[begin]==0)begin++;
            count[begin]--;
            nums[i]=begin;
        }
    }
    @Test
    public void test(){
        int [] nums = SortUtil.getRandom();
        countingSort(nums,100);
        System.out.println(SortUtil.judge(nums));
    }
}
