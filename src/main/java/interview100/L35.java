package interview100;

public class L35 {
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        while(begin<=end){
            int mid = ((begin-end)/2+end);
            if(target==nums[mid])return mid;
            if(target>nums[mid]){
                if(mid==nums.length-1||target<nums[mid+1])return mid+1;
                begin=mid+1;
            }else if(target<nums[mid]){
                if(mid==0||target>nums[mid-1])return mid;
                end = mid-1;
            }
        }
        return end;
    }
}
