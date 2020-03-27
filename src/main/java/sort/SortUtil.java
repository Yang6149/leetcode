package sort;

import java.util.Random;

public class SortUtil {
    public static void swap(int [] nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static boolean judge(int nums[]){
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<cur)return false;
            cur=nums[i];
        }
        return true;
    }

    public static int[] getRandom(){
        int [] nums = new int[50];
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt(100);
        }
        return nums;
    }
}
