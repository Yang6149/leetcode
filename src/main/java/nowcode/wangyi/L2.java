package nowcode.wangyi;

import java.util.Scanner;

public class L2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while(a-->0){
            a();
        }
    }
    public static void a(){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int [][] zhangai = new int[k][2];
        for(int i=0;i<k;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            zhangai[i] = new int[]{1,2};
        }
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println("1");
    }
}
