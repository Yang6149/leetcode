package everydayLeet;

public class L55 {
    public boolean canJump(int[] nums) {
        int longest = 0;
        int index = 0;
        while(index<nums.length){
            longest = Math.max(longest,index+nums[index]);
            if (longest >=nums.length-1){
                return true;
            }
            if (index<longest){
                index++;
            }else{
                break;
            }
        }
        return false;
    }
}
