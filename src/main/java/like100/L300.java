package like100;

public class L300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<1)return 0;
        int [] res = new int[nums.length];
        int result=0;
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    max=Math.max(max,res[j]+1);
                }
            }
            res[i]=max;
            result=Math.max(max,result);
        }
        return result+1;
    }
}
