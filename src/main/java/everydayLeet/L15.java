package everydayLeet;

import org.junit.Test;

import java.util.*;

public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int head = i+1;
            int tail = nums.length-1;
            while(head<tail){
                int temp = nums[i]+nums[head]+nums[tail];
                if(temp<0){
                    int nextTarget = head+1;
                    while(nextTarget<tail&&nums[head]==nums[nextTarget])nextTarget++;
                    head = nextTarget;
                    continue;
                }else if(temp>0){
                    int nextTarget = tail-1;
                    while(nextTarget>head&&nums[tail]==nums[nextTarget])nextTarget--;
                    tail = nextTarget;
                    continue;
                }else if(temp==0){
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[head]);
                    sub.add(nums[tail]);
                    res.add(sub);
                }
                int nextTarget = head+1;
                while(nextTarget<tail&&nums[head]==nums[nextTarget])nextTarget++;
                head = nextTarget;
            }
        }
        return res;
    }

    public int [] find(int n,int [] nums,int begin){
        int end = nums.length-1;
        while(begin<=end){
            int mid = (begin+end)/2;
            if(nums[mid]==n){
                return new int[]{nums[mid]};
            }else if(nums[mid]<n){
                begin = mid+1;
            }else if(nums[mid]>n){
                end = mid-1;
            }
        }
        return null;
    }

    @Test
    public void test(){
        List<List<Integer>> res = threeSum(new int []{0,0,0,0});
        System.out.println(res);
    }
}
