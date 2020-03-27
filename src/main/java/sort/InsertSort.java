package sort;

import org.junit.Test;

public class InsertSort {
    public void InsertSort(int []nums){


        for(int begin = 0;begin<nums.length;begin++){
            int cur = nums[begin];
            int pre = begin-1;
            while (pre>=0&&nums[pre]>cur){
                nums[pre+1]=nums[pre];
                pre--;
            }
            nums[pre+1]=cur;
        }
    }

    @Test
    public void test(){
        int [] nums = SortUtil.getRandom();
        InsertSort(nums);
        System.out.println(SortUtil.judge(nums));
    }
}
