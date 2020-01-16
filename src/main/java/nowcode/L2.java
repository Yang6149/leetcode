package nowcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nums=sc.nextInt();
        int res=0;
        int nums[] =new int[Nums];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=nums.length-1;i>=2;i--){
            for(int j=i-1;j>=1;j--){
                for(int k=j-1;k>=0;k--){
                    if(nums[k]+nums[j]>nums[i]){
                        res++;
                    }else {
                        break;
                    }
                }
                if(nums[j]<nums[i]/2)break;
            }
        }
        System.out.println(res);
    }
    public void t(){
        int Nums=10;
        int [] nums={1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(nums);
        int res=0;
        for(int i=nums.length-1;i>=2;i--){
            for(int j=i-1;j>=1;j--){
                for(int k=j-1;k>=0;k--){
                    if(nums[k]+nums[j]>nums[i]&&nums[k]>0&&nums[j]>0&&nums[k]>0){
                        res++;
                    }else {
                        break;
                    }
                }
                if(nums[j]<nums[i]/2)break;
            }
        }
        System.out.println(res);
    }
    @Test
    public void test(){
        t();
    }
}
