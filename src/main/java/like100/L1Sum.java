package like100;

import java.util.HashMap;

public class L1Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(target-nums[i],i);
            }else{
                return new int[]{map.get(nums[i]),i};
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int []aaa={2, 7, 11, 15};
        int [] a=twoSum(aaa,9);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
