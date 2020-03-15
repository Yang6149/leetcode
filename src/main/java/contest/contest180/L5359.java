package contest.contest180;

import org.junit.Test;

/**
 * There are n engineers numbered from 1 to n and two arrays:
 * speed and efficiency, where speed[i] and efficiency[i] represent
 * the speed and efficiency for the i-th engineer respectively. Return
 * the maximum performance of a team composed of at most k engineers
 * , since the answer can be a huge number, return this modulo 10^9 + 7.
 *
 * Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
 * Output: 60
 * Explanation:
 * We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4)
 * and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.
 */
public class L5359 {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int dp[][] = new int[k+1][2];
        dp[0][1]=Integer.MAX_VALUE;
        for (int i=1;i<k;i++){
            for (int j=0;j<n;j++){
                if((speed[j]+dp[i-1][0])*Math.min(efficiency[j],dp[i-1][1])>dp[i][0]*dp[i][1]){
                    dp[i][0]=speed[j]+dp[i-1][0];
                    dp[i][1]=Math.min(efficiency[j],dp[i-1][1]);
                }
            }
        }
        return dp[k-1][0]*dp[k-1][1];
    }
    @Test
    public void test(){
        int [] speed = new int[]{2,10,3,1,5,8};
        int [] eff = new int[]{5,4,3,9,7,2};
        System.out.println(maxPerformance(6,speed,eff,2));

    }
}
