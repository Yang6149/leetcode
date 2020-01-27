package like100;

import org.junit.Test;

import java.util.*;

public class L347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> [] bucket = new List[nums.length+1];
        Iterator it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            if(bucket[(Integer)entry.getValue()]==null){
                bucket[(Integer)entry.getValue()]=new ArrayList<>();
            }
            bucket[(Integer)entry.getValue()].add((Integer)entry.getKey());
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=bucket.length-1;i>=0;i++){
            if (res.size()==k)break;
            if (bucket[i]==null)continue;
            res.addAll(bucket[i]);
        }

        return res;
    }
    @Test
    public void test(){
        int [] nums={4,1,-1,2,-1,2,3};
        System.out.println(topKFrequent(nums,2));
    }
}
