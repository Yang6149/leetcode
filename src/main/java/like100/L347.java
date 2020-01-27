package like100;

import org.junit.Test;

import java.util.*;

public class L347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,0);
            }
        }
        PriorityQueue queue=new PriorityQueue(k, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(map.get(o1)>map.get(o2)){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        Iterator it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            if (queue.size()!=k){
                queue.add(entry.getKey());
                continue;
            }
            if ((Integer)entry.getValue()>map.get(queue.peek())){
                queue.poll();
                queue.add(entry.getKey());
            }
        }
        return new ArrayList<>(queue);
    }
    @Test
    public void test(){
        int [] nums={4,1,-1,2,-1,2,3};
        System.out.println(topKFrequent(nums,2));
    }
}
