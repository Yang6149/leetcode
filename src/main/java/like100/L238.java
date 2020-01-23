package like100;

public class L238 {
    public int[] productExceptSelf(int[] nums) {

        int [] res=new int[nums.length];
        int a=1;
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int b=1;
        for(int i=nums.length-2;i>=0;i--){
            b=nums[i+1]*b;
            res[i]=res[i]*b;
        }

        return res;
    }
}
