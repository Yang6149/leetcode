package gongsi.baidu;

import org.junit.Test;

import java.util.Scanner;

public class L1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = getNum(in);
            System.out.println((long)a*(a-1)-1);
        }
    }

    public static int getNum(Scanner in){
        return in.nextInt();
    }
    public static int gcd(int a,int b){
        return a%b==0?b:gcd(b,a%b);
    }

    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static int res(int a,int b){
        return lcm(a,b)-gcd(a,b);
    }
}
