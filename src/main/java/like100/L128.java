package like100;

import org.junit.Test;

import java.util.HashMap;

public class L128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null)continue;
            int left=map.get(nums[i]-1)==null?0:map.get(nums[i]-1);
            int right=map.get(nums[i]+1)==null?0:map.get(nums[i]+1);
            int sum=left+right+1;
            if(sum>max)max=sum;
            map.put(nums[i],sum);
            map.put(nums[i]-left,sum);
            map.put(nums[i]+right,sum);


        }
        return max;
    }
    @Test
    public void test(){
        int nums[]=new int[]{4,0,-4,-2,2,5,2,0,-8,-1,7,4,5,6,6,-3};
        System.out.println(longestConsecutive(nums));
    }

}
