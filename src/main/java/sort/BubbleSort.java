package sort;

import org.junit.Test;

import java.util.Random;

public class BubbleSort {
    public void BuubleSort(int [] nums){
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1])swap(nums,j,j+1);
            }
        }
    }

    public void swap(int [] nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    @Test
    public void test(){
        int [] nums = new int[50];
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt(100);
        }
        BuubleSort(nums);
        for (int num : nums) {
            System.out.print(num+",");
        }
    }
}
