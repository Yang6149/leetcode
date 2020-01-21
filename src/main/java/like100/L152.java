package like100;

import org.junit.Test;

public class L152 {
    public int maxProduct(int[] nums) {
        //先循环，遇到0下一次循环
        if(nums.length<1)return 0;
        int max=nums[0];
        int min=nums[0];
        int res=max;
        for (int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int a=max;
                max=min;
                min=a;
            }
            max=Math.max(max*nums[i],nums[i]);
            min=Math.min(min*nums[i],nums[i]);
            if(res<max)res=max;
        }
        return res;
    }
    @Test
    public void test(){
        int [] nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    //[2,-5,-2,-4,3]
    // 2  0
    // 2 -10
    // 20 -2
    //
}
