package like100;

public class L45 {
    public int jump(int[] nums) {
        int curFarthest=0,curEnd=0,jumps=0;
        for(int i=0;i<nums.length-1;i++){
            curFarthest = Math.max(curFarthest,i+nums[i]);
            if(i==curEnd){
                jumps++;
                curEnd=curFarthest;
            }
        }
        return jumps;
    }
}
