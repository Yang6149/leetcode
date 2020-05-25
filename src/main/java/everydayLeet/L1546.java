package everydayLeet;

import org.junit.Test;

public class L1546 {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int [][] dp = new int[nums1.length][nums2.length];
        int max = nums1[0]*nums2[0];
        for(int i = 0;i<nums1.length;i++){
            max = Math.max(nums1[i]*nums2[0],max);
            dp[i][0] = max;
        }
        max = nums2[0]*nums1[0];
        for(int i = 0;i<nums2.length;i++){
            max = Math.max(nums2[i]*nums1[0],max);
            dp[0][i] = max;
        }
        for(int i = 1;i<nums1.length;i++){
            for(int j = 1;j<nums2.length;j++){
                dp[i][j] = Math.max(dp[i-1][j-1]+nums1[i]*nums2[j],nums1[i]*nums2[j]);
                dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
                dp[i][j] = Math.max(dp[i][j],dp[i][j-1]);
            }
        }
        return dp[nums1.length-1][nums2.length-1];

    }
    @Test
    public void test(){
        int [] nums1 = {-5,-1,-2};
        int [] nums2 = {3,3,5,5};
        System.out.println(maxDotProduct(nums1, nums2));
    }
}
