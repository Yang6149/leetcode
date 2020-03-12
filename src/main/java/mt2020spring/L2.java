package mt2020spring;

import java.util.HashMap;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
        int [] nums2 = new int[n];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=nums[i]|x;
        }
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums2[i]){
                int get=map.getOrDefault(nums[i],0)+1;
                max=Math.max(max,get);
                map.put(nums[i],get);
            }else{
                int get1=map.getOrDefault(nums[i],0)+1;
                int get2=map.getOrDefault(nums2[i],0)+1;
                max=Math.max(max,get1);
                max=Math.max(max,get2);
                map.put(nums[i],get1);
                map.put(nums2[i],get2);
            }
        }
        System.out.println(max);

    }
}
