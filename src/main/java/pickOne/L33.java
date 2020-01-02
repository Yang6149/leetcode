package pickOne;

import org.junit.Test;

public class L33 {
    public int[] searchRange(int[] A, int target) {
        int start = findFirst(A, target);
        if (start == A.length || A[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, findFirst(A, target + 1) - 1};

    }
    public int findFirst(int[] nums, int target){
        int tail=nums.length-1;
        int head=0;
        int index=-1;
        while(tail>=head){
            int mid=(tail+head)/2;
            if(nums[mid]>=target){
                tail=mid-1;
            }else{
                head=mid+1;
            }

        }
        return head;
    }
    @Test
    public void test(){
        for(int i:searchRange(new int[]{5,7,7,10},7)){
            System.out.println(i);
        }
    }
}
