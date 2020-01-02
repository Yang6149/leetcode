package pickOne;

import org.junit.Test;

public class L33 {
    public int[] searchRange(int[] nums, int target) {
        int tail=nums.length-1;
        int head=0;
        while(head<tail){
            int mid=(head+tail)/2;
            if(nums[mid]==target){
                tail=mid;
                head=mid;
            }
            if(nums[mid]>target){
                tail=mid-1;
            }
            if(nums[mid]<target){
                head=mid+1;
            }
        }
        if(nums.length<1||nums[head]!=target)return new int[]{-1,-1};
        //head=tail= index of target
        while(nums[head]==target){
            head--;
            if(head<0)break;
        }
        while(nums[tail]==target){
            tail++;
            if(tail==nums.length)break;
        }
        return new int[]{head+1,tail-1};
    }

    @Test
    public void test(){
        for(int i:searchRange(new int[]{5,7,7,10},8)){
            System.out.println(i);
        }
    }
}
