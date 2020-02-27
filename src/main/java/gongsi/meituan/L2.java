package gongsi.meituan;

import java.util.Scanner;

public class L2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int k = in.nextInt();
        int [] array = new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        int head=0;
        int teal=0;
        if(length<1){
            System.out.println(0);
            return;
        }
        int maxLength=0;
        while(teal<length){
            if(array[teal]==1){
                teal++;
                maxLength=Math.max(maxLength,teal-head);
                continue;
            }
            if(k>0){
                teal++;
                k--;
                maxLength=Math.max(maxLength,teal-head);
                continue;
            }
            if(array[head]==1){
                head++;
                maxLength=Math.max(maxLength,-teal+head);
                continue;
            }
            if(k==0){
                head++;
                k++;
                maxLength=Math.max(maxLength,-teal+head);
                continue;
            }

        }
        System.out.println(maxLength);
    }
}
