package like100;

import org.junit.Test;

import java.util.Arrays;

public class L312 {
    public int maxCoins(int[] nums) {
        int [] N=new int[nums.length+2];
        System.arraycopy(nums,0,N,1,nums.length);
        N[0]=N[nums.length+1]=1;
        int [][] dp =new int[nums.length+2][nums.length+2];


        for (int i=2;i<N.length;i++){
            for (int left=0;left+i<N.length;left++){
                int right=left+i;
                for(int k=left+1;k<right;k++){
                    dp[left][right]=Math.max(dp[left][right],dp[left][k]+N[k]*N[left]*N[right]+dp[k][right]);
                }
            }
        }
        return dp[0][N.length-1];
    }


    @Test
    public void test(){
        int [] nums = {3,1,5,8};
        System.out.println(maxCoins(nums));
    }
}
