package iaa;

import java.util.Arrays;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int people = n;
        long res=0;
        int d[] = new int[3*n];
        for(int i=0;i<3*n;i++){
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        for(int i = 3*n-1; i >= 0; i--){
            int cur = d[i];
            if((i&1)==1&&people>0){
                res+=cur;
                people--;
            }
        }
        System.out.println(res);
    }
}
