package contest.contest100;

import java.util.HashSet;

public class L898 {
    public int subarrayBitwiseORs(int[] A) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> cur = new HashSet<>();
        HashSet<Integer> cur2;
        for(int i:A){
            cur2 = new HashSet<>();
            cur.add(i);
            for(int j:cur){
                cur2.add(i|j);
            }
            res.addAll(cur=cur2);
        }
        return res.size();
    }
}
