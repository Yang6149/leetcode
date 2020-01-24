package like100;

import org.junit.Test;

public class L287 {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[slow];
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        int slow2=nums[0];
        slow=nums[slow];
        while (slow2!=slow){
            slow=nums[slow];
            slow2=nums[slow2];
        }
        return slow;
    }

    @Test
    public void test(){
        int [] nums={1,3,4,2,5,2};
        System.out.println(findDuplicate(nums));
    }
}
