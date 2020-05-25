package everydayLeet;

import org.junit.Test;

import java.util.HashSet;

public class L202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int cur = n;
        while(true){
            if(cur==1){
                return true;
            }
            if (set.contains(cur)){
                return false;
            }
            set.add(cur);
            String s = String.valueOf(cur);
            cur = 0;
            while(s.length()>0){
                int ii=Integer.valueOf(s.substring(0,1));
                cur +=ii*ii;
                s = s.substring(1);
            }
        }
    }
    @Test
    public void test(){
        System.out.println(isHappy(7));
    }
}
