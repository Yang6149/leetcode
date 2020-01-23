package mockInterview;

import org.junit.Test;

public class L2 {
    public int hammingDistance(int x, int y) {
        int dis=0;
        while (x!=y){
            if(((x^y)&1)==1)dis++;
            x=x>>1;
            y=y>>1;
        }
        return dis;
    }
    @Test
    public void test(){
        int a=93;
        int b=73;
        System.out.println(hammingDistance(b,a));
    }
}
