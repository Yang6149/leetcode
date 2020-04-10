package gongsi.wangyi;

import java.math.BigInteger;
import java.util.*;


public class L2 {
    public static void main(String[] args) {
        final int P = (int) (1e9+7);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int T = sc.nextInt();
            for (int i=0;i<T;i++){
                int m = sc.nextInt();
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                long dp[] = new long[s.length()];
                for(int j = 0;j<s.length();j++){//2246
                    long sum = 0;
                    BigInteger N = new BigInteger(String.valueOf(n));
                    for(int k = 0;k<=j;k++){
                        BigInteger integer = new BigInteger(s.substring(k,j+1));
                        if(integer.remainder(N).intValue()==0){
                            if(k==0){
                                sum+=1;
                            }else{
                                sum+=dp[k-1];
                            }
                        }
                    }
                    dp[j]=sum%P;
                }
                System.out.println(dp[s.length()-1]);
            }


        }



    }
}
