package pickOne;

import org.junit.Test;

public class L26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<1)return 0;
        int currentNum=nums[0];
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=currentNum){
                currentNum=nums[i];
                num++;
                nums[num]=currentNum;
            }
        }
        return num+1;

    }
    @Test
    public void test(){
        int [] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        for(int i:nums) System.out.println(i);
    }
}
