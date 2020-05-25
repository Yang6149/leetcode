package everydayLeet;

import org.junit.Test;

public class L152 {
    public int maxProduct(int[] nums) {
        if (nums.length<1)return 0;
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i = 1;i<nums.length;i++){
            //System.out.println("begin--res = "+res+",max = "+max+",min = "+min);
            if (nums[i]<0){
                max = Math.max(min*nums[i],nums[i]);
                min = Math.min(max*nums[i],nums[i]);
            }else{
                max = Math.max(max*nums[i],nums[i]);
                min = Math.min(min*nums[i],nums[i]);
            }
            res = Math.max(res,max);
            //System.out.println("end----res = "+res+",max = "+max+",min = "+min);
        }
        return res;
    }
    @Test
    public void test(){
        int [] nums = new int[]{8,-4,9,4,5};
        maxProduct(nums);
    }
}
