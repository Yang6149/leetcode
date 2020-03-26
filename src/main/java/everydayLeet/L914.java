package everydayLeet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L914 {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i:deck){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        int min=Integer.MAX_VALUE;
        for (Integer value : hashMap.values()) {
            min=Math.min(value,min);
        }
        if(min<=1)return false;
        ArrayList<Integer> yinshu = new ArrayList<>();
        for (int i = 2; i*i <= min; i++) {
            if (min%i==0){
                if (i*i!=min){
                    yinshu.add(min/i);
                }
                yinshu.add(i);
            }
        }
        yinshu.add(min);
        for (Integer integer : yinshu) {
            boolean f = true;
            for (Integer value : hashMap.values()) {
                if(value%integer!=0){
                    f= false;
                    break;
                }
            }
            if (f)return true;
        }

        return false;
    }
}
