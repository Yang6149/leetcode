package gongsi.tencent2020q;

import java.util.Arrays;
import java.util.Scanner;

public class L2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] level = new int[num];
        for(int i=0;i<num;i++){
            level[i]=in.nextInt();
        }
        int dpasc [] = new int[num];
        int dasc [] = new int[num];
        Arrays.fill(dpasc,1);
        Arrays.fill(dasc,1);
        int dpdesc [] = new int[num];
        int ddesc [] = new int[num];
        Arrays.fill(dpdesc,1);
        Arrays.fill(ddesc,1);
        for(int i=1;i<num;i++){
            for(int j=i-1;j>=0;j--){
                if(level[j]>level[i]){
                    dpdesc[i]=1+dpdesc[j];
                    break;
                }
            }
        }
        for(int i=num-2;i>=0;i--){
            for(int j=i+1;j<num;j++){
                if(level[j]>level[i]){
                    dpasc[i]=1+dpasc[j];
                    break;
                }
            }
        }

        if(num<2){
            System.out.print(1);
        }else{
            System.out.print(1+dpasc[1]+" ");
            for(int i=1;i<num-1;i++){
                System.out.print(dpdesc[i-1]+1+dpasc[i+1]+" ");
            }
            System.out.print(1+dpdesc[num-2]);
        }
    }
}
