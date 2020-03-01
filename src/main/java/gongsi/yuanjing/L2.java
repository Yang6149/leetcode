package gongsi.yuanjing;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//硬币数
        DecimalFormat df = new DecimalFormat(".000000");
        double d = 1d;
        double a=1;
        if(n>990){
            System.out.println("1.000000");
            return ;
        }
        for(int i=0;i<n;i++){
            a*= (double)(990-i)/(double)(1000-i);
        }

        System.out.println((df.format(1d-a).toString().split("\\.")[0].equals("")?"0":"1")+"."+df.format(1d-a).toString().split("\\.")[1]);
    }
}
