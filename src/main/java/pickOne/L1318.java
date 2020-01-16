package pickOne;

import org.junit.Test;

public class L1318 {
    public int minFlips(int a, int b, int c) {
        int cur=c;
        int res=0;
        while (c>0||a>0||b>0){
            int tar=c&1;
            int tar1=a&1;
            int tar2=b&1;
            if(tar==1){
                if(tar==(tar1|tar2)){
                    //不用反转
                }else{
                    res++;
                }
            }else{//0
                if((tar1|tar2)==1){
                    if((tar1&tar2)==1){
                        res+=2;
                    }else{
                        res++;
                    }
                }

            }
            c=c>>1;
            a=a>>1;
            b=b>>1;
        }
        return res;

    }
    @Test
    public void test(){
        //010
        //110
        //101
        System.out.println(minFlips(8,3,5));
    }
}
