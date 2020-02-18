package contest.contest172;

import org.junit.Test;

import java.util.Arrays;

/**
 * 写不完了，0-n的花园
 * 每个上边一个水龙头
 * 每个水龙头的喷水范围为（i-ranges[i],i+ranges[i]），求最少覆盖完花园
 *
 * 保留
 */
public class L4 {
    public int minTaps(int n, int[] A) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 2);
        dp[0] = 0;
        for (int i = 0; i <= n; ++i)
            for (int j = Math.max(i - A[i] + 1, 0); j <= Math.min(i + A[i], n); ++j)
                dp[j] = Math.min(dp[j], dp[Math.max(0, i - A[i])] + 1);
        return dp[n]  < n + 2 ? dp[n] : -1;
    }

    @Test
    public void test(){
        int [] a=new int[]{1,2,1,0,2,1,0,1};
        System.out.println(minTaps(a.length-1,a));
    }


}
