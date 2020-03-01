package gongsi.tencent2020q;

import java.util.Scanner;
//40%
public class L3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        num=1<<num;
        int arr [] = new int [num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        int a =in.nextInt();
        for(int i=0;i<a;i++){
            int gap = 1<<in.nextInt();
            for(int j=0;j<num;j+=gap){
                reverse(arr,j,j+gap-1);
            }
            System.out.println(returnRes(arr));
        }
    }
    public static int returnRes(int [] arr){
        int res = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])res++;
            }
        }
        return res;
    }
    public static void reverse(int [] arr,int begin,int end){
        int temp = 0;
        while(begin<end){
            temp = arr[begin];
            arr[begin++] = arr[end];
            arr[end--] = temp;
        }
    }
}
