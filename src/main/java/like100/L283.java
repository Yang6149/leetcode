package like100;

public class L283 {
    public void moveZeroes(int[] nums) {
        int head=0;
        int teal=0;
        while (teal<nums.length){
            if(nums[teal]!=0){
                int a=nums[head];
                nums[head]=nums[teal];
                nums[teal]=a;
                head++;
            }
            teal++;
        }
    }


}
