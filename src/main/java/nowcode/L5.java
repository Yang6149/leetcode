package nowcode;

import java.util.Scanner;

/**
 * 在两个字符串中找出最多的相同子字符串，并输出长度
 */
public class L5 {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int Nums = sc.nextInt();
        int nums[] = new int[Nums];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int head=0;
        int teal=0;
        int end=head+1;
        int mid=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                mid=i;
                break;
            }
        }

        while(end<nums.length){
            if(nums[end-1]<nums[end]){
                end++;
            }else{
                if(end-head+1>res)res=end-head+1;
            }

        }
        System.out.println(res);
    }
}
