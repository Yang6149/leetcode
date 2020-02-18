package contest.contest176;

import org.junit.Test;

import java.util.Arrays;

public class L1353 {
    public int maxEvents(int[][] event) {
        int res = 0;
        Arrays.sort(event,(a,b) -> a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        int max=0;
        int min=event[0][0];
        for(int i=0;i<event.length;i++){
            min = Math.min(min,event[i][0]);
            max = Math.max(max,event[i][1]);
        }
        int [] dp = new int[max-min+1];
        for(int i=0;i<event.length;i++){
            for(int j=event[i][0];j<=event[i][1];j++){
                if(dp[j-min]!=0)continue;
                dp[j-min]++;
                res++;
                break;
            }
        }
        return res;
    }

    @Test
    public void test(){
        int [][] a = {{1,3},{1,3},{1,3},{3,4}};

        System.out.println(maxEvents(a));
    }

}
