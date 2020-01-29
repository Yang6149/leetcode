package like100;

import org.junit.Test;

import java.util.HashMap;

public class L560 {
    //similar as L437

    public int subarraySum(int[] nums, int k) {
        if(nums.length<1)return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }


    @Test
    public void test(){
        int [] nums = {1,2,3};
        System.out.println(subarraySum(nums,3));
    }
}
