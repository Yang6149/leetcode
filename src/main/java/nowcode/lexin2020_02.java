package nowcode;

import java.util.Scanner;

public class lexin2020_02 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        long m=(long)in.nextInt();
        int n = in.nextInt();
        double high=0;
        while(pow(high,10)<m)high++;
        high=high-1;
        for(int i=1;i<=12;i++){
            while(pow(high,10)<m){
                high+=pow(0.1,i);
            }
            high-=pow(0.1,i);
        }
        String s = String.format("%.12f",high);
        System.out.println(Double.valueOf(s));
    }
    public static double pow(double a,int b){
        double res=1;
        for(int i=0;i<b;i++){
            res*=a;
        }
        return res;
    }
}
