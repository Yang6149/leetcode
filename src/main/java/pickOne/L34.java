package pickOne;

import org.junit.Test;

public class L34 {
    public int search(int[] nums, int target) {//1 2 3 4 5 6 7 8
        if(nums.length<1)return -1;
        return getIndex(nums,0,nums.length-1,target);
    }
    public int getIndex(int[] nums,int begin,int end,int target){
        while(begin<=end){
            int mid=(begin+end)/2;

            if(nums[mid]==target)return mid;//中位数就是结果
            if(nums[mid]>=nums[begin]){//pivot is int right
                if(nums[mid]>target){
                    if(target>=nums[begin]){//在左边
                        end=mid-1;
                    }else{//在右边
                        begin=mid+1;
                    }
                }else{
                    begin=mid+1;
                }

            }else{//pivot is in left
                if(nums[mid]>target){
                    end=mid-1;
                }else{
                    if(target<nums[begin]){//在右边
                        begin=mid+1;
                    }else{//在左边
                        end=mid-1;
                    }
                }

            }
        }
        return -1;
    }
    @Test
    public void test(){
        int[] nums={5,1,3};
        System.out.println(search(nums,5));

    }
}
