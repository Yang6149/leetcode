package sort;

import org.junit.Test;

import java.util.Random;

public class QuickSort {
    public void s(int [] nums,int a,int b){
        int i=a,j=b;
        int pivot = nums[(a-b)/2+b];
        while(i<=j){
            while(nums[i]<pivot)i++;
            while(nums[j]>pivot)j--;
            swap(nums,i++,j--);
        }
        if(a<j)s(nums,a,j);
        if(i<b)s(nums,i,b);
    }
    public void swap(int [] nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public void print(int [] nums){
        for (int num : nums) {
            System.out.print(num+",");
        }
    }
    @Test
    public void test(){
        int nums[] = new int[30];
        Random random = new Random();
        for(int i=0;i<30;i++){
            nums[i]=random .nextInt(100);
        }
        s(nums,0,nums.length-1);
        print(nums);
    }
}
