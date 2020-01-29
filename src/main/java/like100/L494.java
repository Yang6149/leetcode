package like100;

import org.junit.Test;

public class L494 {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        if (((sum+S)&1)==1)return 0;
        sum = (sum+S)/2;
        int [] dp = new int[sum+1];
        dp[0]=1;
        int count=0;
        for (int i=0;i<nums.length;i++){
            for (int j=sum;j>=nums[i];j--){
                dp[j]=dp[j]+dp[j-nums[i]];

            }
        }
        return dp[sum];
    }

    @Test
    public void test(){
        int [] nums = new int[]{1};
        System.out.println(findTargetSumWays(nums,2));
    }
}
