package nowcode;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nums=sc.nextInt();

        int nums[] =new int[Nums];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int res=0;

        for(int i=0;i<nums.length;i++){

            int cur=nums[i];
            for(int j=i;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=cur;
            for(int j=0;j<nums.length/2;j++){
                int a=nums[j];
                nums[j]=nums[nums.length-1-j];
                nums[nums.length-1-j]=a;
            }
        }

        System.out.print(nums[0]);
        for(int i=1;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }


}
