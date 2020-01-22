package like100;

import org.junit.Test;

public class L198 {
    public int rob(int[] nums) {

        int isrob=0;
        int nortob=0;
        for (int i=0;i<nums.length;i++){
            int iscur=nortob+nums[i];
            nortob=Math.max(isrob,nortob);
            isrob=iscur;
        }
        return Math.max(isrob,nortob);
    }

    @Test
    public void test(){
        int [] nums={1,2,9,2,3,9};
        System.out.println(rob(nums));
    }
}
