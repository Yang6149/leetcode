package like100;

import java.util.HashMap;

public class L169 {
    public int majorityElement(int[] nums) {
//        if(nums.length<1)return 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int max=0;
//        int index=-1;
//        for (int num : nums) {
//            if(map.containsKey(num)){
//                map.put(num,map.get(num)+1);
//
//            }else {
//                map.put(num,1);
//            }
//            if(map.get(num)>max){
//                max=map.get(num);
//                index=num;
//            }
//        }
//        return index;
        int major=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                major=nums[i];
                count++;
            }else {
                if(nums[i]==major)count++;
                else count--;
            }
        }
        return major;
    }

}
