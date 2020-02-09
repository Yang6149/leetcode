package nowcode;

import java.util.ArrayList;
import java.util.Scanner;

public class lexin2020_01 {
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        int A[] = { 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47 };
        long  tem = 1;
        for (int i = 0; i <= 10; i++)
        {
            tem *= A[i];
        }
        tem++;
        System.out.println(isPrime(tem));
        System.out.println(System.currentTimeMillis()-start);
    }
    public static boolean isPrime(long n){
        double sq = Math.sqrt(n);
        for(int i=5;i<sq;i+=6){
            if(n%i==0||(n%(i+2)==0)){
                return false;
            }
        }
        return true;
    }
}
