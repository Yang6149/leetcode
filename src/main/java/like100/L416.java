package like100;

import org.junit.Test;

import java.util.Stack;

public class L416 {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if ((sum&1)==1)return false;
        int half = sum/2;
        boolean [] dp = new boolean[half+1];
        dp[0]=true;
        for (int i=1;i<nums.length;i++){
            for (int j=half;j>=nums[i-1];j--){
                dp[j] = dp[j] ||dp[j-nums[i-1]];
            }
        }
        return dp[half];
    }
    @Test
    public void test(){
        long start = System.currentTimeMillis();
        int [] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100};
        System.out.println(canPartition(nums));
        System.out.println(System.currentTimeMillis()-start);
    }
}
