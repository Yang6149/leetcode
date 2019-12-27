package pickOne;

import org.junit.Test;

public class L27 {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
    @Test
    public void test(){
        int [] nums={1,2,2,3,4,5};
        System.out.println(removeElement(nums,2));
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
