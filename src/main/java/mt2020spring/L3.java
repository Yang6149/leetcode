package mt2020spring;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int L = in.nextInt();
        int R = in.nextInt();
        final long MAX = (long)(1e9+7);

        long [][]dp = new long[n][k];
        for (int i = L; i <= R; i++) {
            dp[0][i%k]++;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j=0;j<k;j++){
                for (int s=0;s<k;s++){

                    dp[i][(j+s)%k]= (long) (dp[i][(j+s)%k]%(1e9+7)+dp[0][j]%(1e9+7)*dp[i-1][s]%(1e9+7));
                    dp[i][(j+s)%k]= dp[i][(j+s)%k]%(MAX);
                }
            }
        }
        System.out.println((int)dp[n-1][0]);
    }
}