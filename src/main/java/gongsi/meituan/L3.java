package gongsi.meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class L3 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=in.nextInt();
        }
        int res = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i=0;i<prices.length;i++){
            ArrayList<Integer> newList = new ArrayList<>();
            for(int a:list){
                if(a<x)newList.add(a);
                if(a+prices[i]>=x){
                    res = Math.min(res,a+prices[i]);
                }else{
                    newList.add(a+prices[i]);
                }
            }
            list=newList;
        }
        System.out.println(res);
    }
}
