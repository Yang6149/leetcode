package al;

import java.util.Arrays;
import java.util.Scanner;

public class L2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        int [][] adds = new int[line][4];
        in.nextLine();
        int ee=0;
        for(int i=0;i<line;i++){
            String s=in.nextLine();
            adds[i][0]=s.charAt(0)-97;
            adds[i][1]=s.charAt(s.length()-1)-97;
            adds[i][2]=s.length();
            ee=Math.max(ee,adds[i][1]);
        }
        Arrays.sort(adds,(a,b)->a[1]!=b[1]?a[1]-b[1]:b[1]-a[2]);

        int [] dp = new int[26];
        for (int[] add : adds) {
            for (int i=add[0];i>=0;i--){
                dp[add[1]]=Math.max(dp[i]+add[2],dp[add[1]]);
            }
        }
        System.out.println(dp[ee]);
    }
}
