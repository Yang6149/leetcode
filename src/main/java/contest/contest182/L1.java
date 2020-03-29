package contest.contest182;

public class L1 {
    public int findLucky(int[] arr) {
        int nums [] = new int [500+1];
        for(int i:arr){
            nums[i]++;
        }
        for(int i=500;i>=1;i--){
            if(nums[i]==i)return i;
        }
        return -1;
    }
}
