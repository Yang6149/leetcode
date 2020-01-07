package pickOne;

import org.junit.Test;

public class L55 {
    public boolean canJump(int[] nums) {
        if(nums.length<1)return false;
        int maxstep=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxstep)return false;
            int cur=i+nums[i];
            if(cur>maxstep)maxstep=cur;

        }
        return true;
    }
    @Test
    public void test(){
        int []  nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
