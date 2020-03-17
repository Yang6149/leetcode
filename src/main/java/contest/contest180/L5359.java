package contest.contest180;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

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
    final int MOD= (int) (1e9+7);
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] ess = new int[n][2];
        for (int i = 0; i < n; ++i)
            ess[i] = new int[] {efficiency[i], speed[i]};
        Arrays.sort(ess,(a,b)->b[0]-a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        long res = 0,sumS = 0;
        for (int[] es : ess) {
            pq.add(es[1]);
            sumS+=es[1];
            if(pq.size()>k)sumS-=pq.poll();
            res=Math.max(res,((sumS%MOD)*es[0])%MOD);
        }
        return (int)(res % (long)(1e9 + 7));
    }
    @Test
    public void test(){
//        System.out.println(MOD);
//        int [] speed = new int[]{2,10,3,1,5,8};
//        int [] eff = new int[]{5,4,3,9,7,2};
//        System.out.println(maxPerformance(6,speed,eff,2));
        System.out.println(Long.MAX_VALUE > (long) Integer.MAX_VALUE * (long) Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println((long) Integer.MAX_VALUE * (long) Integer.MAX_VALUE);

        long a = (long) (Integer.MAX_VALUE);
        long b = (long) (Integer.MAX_VALUE);
        System.out.println((a*b)%MOD);
        System.out.println(((a%MOD)*(b%MOD))%MOD);
    }
}
