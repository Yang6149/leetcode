package like100;

import org.junit.Test;

public class L75 {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int i=0;
        while(i<=high){
            if(nums[i]==0){
                int cur=nums[i];
                nums[i]=nums[low];
                nums[low]=cur;
                low++;
                i++;
            }else if(nums[i]==2){
                int cur=nums[i];
                nums[i]=nums[high];
                nums[high]=cur;
                high--;
            }else{
                i++;
            }
        }
    }



    @Test
    public void test(){
        int nums[] ={2,0,2,1,1,0};
        for (int num : nums) {
            System.out.print(num);
        }
        sortColors(nums);
        System.out.println();
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
